package com.pyq.cms.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.pyq.cms.dao.mapper.CircleMapper;
import com.pyq.cms.dao.model.Circle;
import com.pyq.cms.dao.model.CircleExample;
import com.pyq.cms.rpc.api.CircleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CircleService实现
* Created by shuzheng on 2020/5/21.
*/
@Service
@Transactional
@BaseService
public class CircleServiceImpl extends BaseServiceImpl<CircleMapper, Circle, CircleExample> implements CircleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CircleServiceImpl.class);

    @Autowired
    CircleMapper circleMapper;

}