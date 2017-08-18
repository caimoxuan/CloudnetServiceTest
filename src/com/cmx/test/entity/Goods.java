package com.cmx.test.entity;

import java.io.Serializable;

public class Goods implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer goodsid;
	private String goodsname;
	private String description;
	private Integer telephone;
	private String goodspath;
	private String owner;
	private String category;
	private String keyword;

	public void setGoodsname(String goodsname){
		this.goodsname = goodsname;
	}
	public String getGoodsname(){
		return goodsname;
	}

	public void setCategory(String category){
		this.category = category;
	}
	public String getCategory(){
		return category;
	}

	public void setGoodsid(Integer goodsid){
		this.goodsid = goodsid;
	}
	public Integer getGoodsid(){
		return goodsid;
	}

	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return description;
	}

	public void setKeyword(String keyword){
		this.keyword = keyword;
	}
	public String getKeyword(){
		return keyword;
	}

	public void setOwner(String owner){
		this.owner = owner;
	}
	public String getOwner(){
		return owner;
	}

	public void setGoodspath(String goodspath){
		this.goodspath = goodspath;
	}
	public String getGoodspath(){
		return goodspath;
	}

	public void setTelephone(Integer telephone){
		this.telephone = telephone;
	}
	public Integer getTelephone(){
		return telephone;
	}

	public String toString(){
		return "Goods["
		+"goodsname=" + goodsname + ","
		+"category=" + category + ","
		+"goodsid=" + goodsid + ","
		+"description=" + description + ","
		+"keyword=" + keyword + ","
		+"owner=" + owner + ","
		+"goodspath=" + goodspath + ","
		+"telephone=" + telephone 
		+"]";
	}
}