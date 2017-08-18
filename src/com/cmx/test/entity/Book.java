package com.cmx.test.entity;

import java.io.Serializable;

public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer bookid;
	private String bookname;
	private String booknumber;
	private Integer bookcount;
	private String bookauthor;
	private Double bookprice;
	private String bookpublish;

	public void setBookauthor(String bookauthor){
		this.bookauthor = bookauthor;
	}
	public String getBookauthor(){
		return bookauthor;
	}

	public void setBookcount(Integer bookcount){
		this.bookcount = bookcount;
	}
	public Integer getBookcount(){
		return bookcount;
	}

	public void setBookid(Integer bookid){
		this.bookid = bookid;
	}
	public Integer getBookid(){
		return bookid;
	}

	public void setBookname(String bookname){
		this.bookname = bookname;
	}
	public String getBookname(){
		return bookname;
	}

	public void setBooknumber(String booknumber){
		this.booknumber = booknumber;
	}
	public String getBooknumber(){
		return booknumber;
	}

	public void setBookprice(Double bookprice){
		this.bookprice = bookprice;
	}
	public Double getBookprice(){
		return bookprice;
	}

	public void setBookpublish(String bookpublish){
		this.bookpublish = bookpublish;
	}
	public String getBookpublish(){
		return bookpublish;
	}

	public String toString(){
		return "Book["
		+"bookauthor=" + bookauthor + ","
		+"bookcount=" + bookcount + ","
		+"bookid=" + bookid + ","
		+"bookname=" + bookname + ","
		+"booknumber=" + booknumber + ","
		+"bookprice=" + bookprice + ","
		+"bookpublish=" + bookpublish 
		+"]";
	}
}