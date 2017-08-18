package com.cmx.test.entity;

import java.io.Serializable;

public class Rubooimg implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer imgid;
	private String imgpath;
	private String description;
	private String forwordpath;

	public void setImgpath(String imgpath){
		this.imgpath = imgpath;
	}
	public String getImgpath(){
		return imgpath;
	}

	public void setForwordpath(String forwordpath){
		this.forwordpath = forwordpath;
	}
	public String getForwordpath(){
		return forwordpath;
	}

	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return description;
	}

	public void setImgid(Integer imgid){
		this.imgid = imgid;
	}
	public Integer getImgid(){
		return imgid;
	}

	public String toString(){
		return "Rubooimg["
		+"imgpath=" + imgpath + ","
		+"forwordpath=" + forwordpath + ","
		+"description=" + description + ","
		+"imgid=" + imgid 
		+"]";
	}
}