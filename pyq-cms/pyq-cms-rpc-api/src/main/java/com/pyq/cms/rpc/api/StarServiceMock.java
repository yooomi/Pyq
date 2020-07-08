package com.pyq.cms.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.pyq.cms.dao.mapper.StarMapper;
import com.pyq.cms.dao.model.Star;
import com.pyq.cms.dao.model.StarExample;

/**
* 降级实现StarService接口
* Created by shuzheng on 2020/5/21.
*/
public class StarServiceMock extends BaseServiceMock<StarMapper, Star, StarExample> implements StarService {

}
