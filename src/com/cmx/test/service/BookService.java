package com.cmx.test.service;

import java.util.Map;

import com.cmx.test.base.BaseService;
import com.cmx.test.entity.Book;

public interface BookService extends BaseService<Book>{
	
	public Integer getSexNum(Map<String, Object> map);
	

}
