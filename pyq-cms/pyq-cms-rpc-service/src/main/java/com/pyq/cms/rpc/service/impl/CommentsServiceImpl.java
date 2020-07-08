package com.pyq.cms.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.pyq.cms.dao.mapper.CommentsMapper;
import com.pyq.cms.dao.model.Comments;
import com.pyq.cms.dao.model.CommentsExample;
import com.pyq.cms.rpc.api.CommentsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CommentsService实现
* Created by shuzheng on 2020/5/21.
*/
@Service
@Transactional
@BaseService
public class CommentsServiceImpl extends BaseServiceImpl<CommentsMapper, Comments, CommentsExample> implements CommentsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommentsServiceImpl.class);

    @Autowired
    CommentsMapper commentsMapper;

}