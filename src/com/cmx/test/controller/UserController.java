package com.cmx.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.cmx.test.entity.Book;
import com.cmx.test.entity.PageView;
import com.cmx.test.service.BookService;


@Controller
@RequestMapping("/user")
public class UserController{
	
	@Autowired
	BookService bookService;
	
	
	@RequestMapping("/user")
	public String getUser(){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Object json = null;
		try {
			PageView<Book> pageView = new PageView<Book>();
			pageView = bookService.queryPage(pageView, new Book());
			resultMap.put("row", pageView.getRecord());
			resultMap.put("totalpage", pageView.getPageCount());
			resultMap.put("totalRecord", pageView.getTotalRecord());
			resultMap.put("pageNow", pageView.getCurrentPage());
			json = JSON.toJSON(resultMap);
			System.out.println(json.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json.toString();
		
	}

}
