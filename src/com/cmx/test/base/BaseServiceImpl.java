package com.cmx.test.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.cmx.test.entity.PageView;

public class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	protected BaseDao<T> dao;

	@Override
	public Integer add(T t) throws Exception {

		Integer id = dao.add(t);
		return id;
	}

	@Override
	public void delete(String id) throws Exception { 

		dao.delete(id);
	}

	@Override
	public void modify(T t) throws Exception {

		dao.modify(t);
	}

	@Override
	public List<T> query(T t) throws Exception {

		List<T> rowRecord = dao.query(t);
		return rowRecord;
	}

	@Override
	public PageView<T> queryPage(PageView<T> pageView, T t) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("paging", pageView);
		map.put("t", t);
		List<T> rowRecord = dao.query(map);
		pageView.setRecord(rowRecord);
		return pageView;
	}

}