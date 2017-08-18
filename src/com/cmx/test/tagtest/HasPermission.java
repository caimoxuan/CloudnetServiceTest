package com.cmx.test.tagtest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class HasPermission extends BodyTagSupport{
	
	private String link;
	
	@Override
	public int doStartTag()throws JspException{
		
		System.out.println("进入doStart()" + link);
		
		
			return BodyTagSupport.SKIP_BODY;
		
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	

}
