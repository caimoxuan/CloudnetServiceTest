package com.cmx.test.service.impl;

import org.springframework.stereotype.Service;

import com.cmx.test.base.BaseServiceImpl;
import com.cmx.test.entity.Goods;
import com.cmx.test.service.GoodService;

@Service("goodService")
public class GoodServiceImpl extends BaseServiceImpl<Goods> implements GoodService{

}
