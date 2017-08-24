package com.cmx.test.entity;

import java.io.Serializable;
import java.util.List;

public class PageView<T> implements Serializable{
	
	private static final long serialVersionUID = 7672516589636097960L;

	private Integer pageSize = 10;
	
	private Integer pageCount;//总页数
	
	private Integer currentPage = 1;//当前页 默认是1
	
	private Integer totalRecord;//总记录数
	
	private List<T> record;//记录数据
	
	private PageIndex pageIndex;//开始和结束页的索引
	
	private Integer pageCode;//页码的数量
	
	private boolean needCountSql;//是否需要拦截时带上计数sql
	
	private String[] sortKey;//需要排序的key
	
	
	
	
	public Integer getPageCode() {
		return pageCode;
	}

	public void setPageCode(Integer pageCode) {
		this.pageCode = pageCode;
	}

	//获取第一条数据
	public Integer getFirstResult(){
		return (this.currentPage - 1) * this.pageSize; 
	}
	
	public void setTotalRecord(Integer totalRecord){
		this.totalRecord = totalRecord;
		setPageCount((this.totalRecord + this.pageSize - 1)/this.pageSize);
		//还有一种算法： this.totalRecord / pageSize == 0?this.totalRecord / pageSize : this.totalRecord / pageSize + 1;
	}

	public Integer getPageSize() {
		return pageSize;
	}


	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}


	public Integer getPageCount() {
		return pageCount;
	}


	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
		this.pageIndex = PageIndex.getPageIndex(pageCode, currentPage, pageCount);
	}


	public Integer getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}


	public List<T> getRecord() {
		return record;
	}


	public void setRecord(List<T> rowRecord) {
		this.record = rowRecord;
	}


	public Integer getTotalRecord() {
		return totalRecord;
	}
	
	
	
}
