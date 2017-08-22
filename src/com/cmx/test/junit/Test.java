package com.cmx.test.junit;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cmx.test.entity.Book;
import com.cmx.test.entity.PageView;
import com.cmx.test.service.BookService;

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
			for(Book b : query){
				System.out.println("Book[bookid="+b.getBookid()+", bookname="+b.getBookname()+", bookauthor="+b.getBookauthor()+"]");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testInsert(){
		Book b = new Book();
		//b.setBookid(87654);
		b.setBookname("添加测试");
		BookService bs = (BookService)applicationContext.getBean("bookService");
		try{
			System.out.println(bs.add(b));
			System.out.println("bookid:"+b.getBookid());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void testQueryPage(){
		BookService bs = (BookService)applicationContext.getBean("bookService");
		try {
			PageView<Book> pageView = new PageView<Book>();
			pageView = bs.queryPage(pageView, new Book());
			for(Book b : pageView.getRecord()){
				System.out.println("Book[bookid="+b.getBookid()+", bookname="+b.getBookname()+", bookauthor="+b.getBookauthor()+"]");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
