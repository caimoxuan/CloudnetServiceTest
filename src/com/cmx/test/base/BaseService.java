package com.cmx.test.base;

import java.util.List;

import com.cmx.test.entity.PageView;

public interface BaseService<T> {

	public List<T> query(T t) throws Exception;

	public void delete(String id) throws Exception;

	public void modify(T t) throws Exception;

	public Integer add(T t) throws Exception;
	
	public PageView<T> queryPage(PageView<T> pageView, T t);

}