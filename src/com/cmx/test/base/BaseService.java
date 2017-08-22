package com.cmx.test.base;

import java.util.List;

import com.cmx.test.entity.PageView;

public interface BaseService<T> {

	public List<T> query(T t) throws Exception;

	public void delete(String id) throws Exception;

	public void mofiy(T t) throws Exception;

	public Integer add(T t) throws Exception;
	
	//需要分页
	public PageView<T> queryPage(PageView<T> pageView, T t) throws Exception;
	

}