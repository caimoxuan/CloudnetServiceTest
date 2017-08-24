package com.cmx.test.dao;

import java.util.Map;

import com.cmx.test.base.BaseDao;
import com.cmx.test.entity.Book;

public interface BookDao extends BaseDao<Book> {
	
	public Integer getSexNum(Map<String, Object> map);
	
}