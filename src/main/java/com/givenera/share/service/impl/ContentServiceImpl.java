package com.givenera.share.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.givenera.dao.share.ContentMapper;
import com.givenera.share.service.ContentService;

@Service("contentService")
public class ContentServiceImpl implements ContentService {
	
	@Resource
	private ContentMapper contentMapper;

	public com.test.bean.ContentWithBLOBs getAppreciationById(String appreciationId) {
		return this.contentMapper.selectByPrimaryKey(appreciationId);
	}
}
