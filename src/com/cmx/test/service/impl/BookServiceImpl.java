package com.cmx.test.service.impl;


import java.util.Map;

import org.springframework.stereotype.Service;

import com.cmx.test.base.BaseServiceImpl;
import com.cmx.test.dao.BookDao;
import com.cmx.test.entity.Book;
import com.cmx.test.service.BookService;


@Service("bookService")
public class BookServiceImpl extends BaseServiceImpl<Book> implements BookService{

	@Override
	public Integer getSexNum(Map<String, Object> map) {
		((BookDao)dao).getSexNum(map);
		Integer sexNum = Integer.parseInt(map.get("sexNum").toString());
		return sexNum;
	}

}
