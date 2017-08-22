package com.cmx.test.plugin;

import java.sql.Connection;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import com.cmx.test.entity.PageView;

//			拦截			指定的类							指定的方法			指定的参数
@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class}) })
public class MybatisPlugin implements Interceptor{

	//在这处理拦截器的主要逻辑
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		System.out.println("进入拦截器");
		StatementHandler statementHandler = (StatementHandler)invocation.getTarget();
		MetaObject metaStatementHandler = SystemMetaObject.forObject(statementHandler);
		
		//循环剥离，可能会被代理多次，剥离出原始的对象
		while(metaStatementHandler.hasGetter("h")){
			Object obj = metaStatementHandler.getValue("h");
			metaStatementHandler = SystemMetaObject.forObject(obj);
		}
		
		BoundSql boundSql = statementHandler.getBoundSql();
		Object paramterObject = boundSql.getParameterObject();
		//System.out.println("被拦截的对象："+paramterObject.toString());
		PageView<?> pageView = null;
		if(paramterObject == null){
			return invocation.proceed();
		}else{
			if(paramterObject instanceof Map<?, ?>){
				System.out.println("存在map");
				Set<Map.Entry<String, Object>> entrySet = ((Map<String,Object>)paramterObject).entrySet();
				Iterator<Entry<String, Object>> it = entrySet.iterator();
				while(it.hasNext()){
					Entry<String, Object> map = it.next();
					if("paging".equals(map.getKey())){
						//System.out.println(map.getValue());
						pageView = (PageView<?>) map.getValue();
					}
				}
			}
		}
		
		if(pageView != null){
			String sql = boundSql.getSql();
			String pageSql = sql + " limit "+pageView.getFirstResult()+","+pageView.getPageSize();
			//System.out.println(pageSql);
			metaStatementHandler.setValue("delegate.boundSql.sql", pageSql);
		}
		
		return invocation.proceed();
	}
	
	
	//将目标对象（拦截的对象），拦截器（this）封装成plugin对象
	@Override
	public Object plugin(Object obj) {
		return Plugin.wrap(obj, this);
	}

	@Override
	public void setProperties(Properties properties) {
		
	}

}
