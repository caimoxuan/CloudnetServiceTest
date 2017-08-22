package com.cmx.test.base;

import java.util.List;
import java.util.Map;

import com.cmx.test.entity.PageView;

public interface BaseDao<T> {

	public List<T> query(T t);

	public void delete(String id);

	public void modify(T t);

	public Integer add(T t);
	
	//需要分页
	
	public List<T> query(PageView<?> pageView, T t);
	
	public List<T> query(Map<String, Object> parameter);

}