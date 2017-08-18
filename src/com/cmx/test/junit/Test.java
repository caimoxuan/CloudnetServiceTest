package com.cmx.test.junit;

import java.util.List;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cmx.test.entity.Book;
import com.cmx.test.service.BookService;
import junit.framework.TestCase;

public class Test extends TestCase{
	
	private ApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception {
		applicationContext = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
	}
	
	public void testBook(){
		BookService bs = (BookService)applicationContext.getBean("bookService");
		try {
			List<Book> query = bs.query(new Book());
			System.out.println(query.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testInsert(){
		Book b = new Book();
		b.setBookid(87654);
		b.setBookname("添加测试");
		BookService bs = (BookService)applicationContext.getBean("bookService");
		try{
			System.out.println(bs.add(b));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
