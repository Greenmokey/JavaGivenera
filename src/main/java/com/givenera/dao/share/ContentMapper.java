package com.givenera.dao.share;

import com.givenera.share.entity.Content;

public interface ContentMapper {
    int deleteByPrimaryKey(String appreciationId);

    int insert(com.test.bean.ContentWithBLOBs record);

    int insertSelective(com.test.bean.ContentWithBLOBs record);

    com.test.bean.ContentWithBLOBs selectByPrimaryKey(String appreciationId);

    int updateByPrimaryKeySelective(com.test.bean.ContentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(com.test.bean.ContentWithBLOBs record);

    int updateByPrimaryKey(Content record);
}