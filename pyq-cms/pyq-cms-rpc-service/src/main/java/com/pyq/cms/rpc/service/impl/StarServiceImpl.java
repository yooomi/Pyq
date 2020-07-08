package com.pyq.cms.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.pyq.cms.dao.mapper.StarMapper;
import com.pyq.cms.dao.model.Star;
import com.pyq.cms.dao.model.StarExample;
import com.pyq.cms.rpc.api.StarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* StarService实现
* Created by shuzheng on 2020/5/21.
*/
@Service
@Transactional
@BaseService
public class StarServiceImpl extends BaseServiceImpl<StarMapper, Star, StarExample> implements StarService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StarServiceImpl.class);

    @Autowired
    StarMapper starMapper;

}