package com.pyq.cms.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.pyq.cms.dao.mapper.CircleMapper;
import com.pyq.cms.dao.model.Circle;
import com.pyq.cms.dao.model.CircleExample;

/**
* 降级实现CircleService接口
* Created by shuzheng on 2020/5/21.
*/
public class CircleServiceMock extends BaseServiceMock<CircleMapper, Circle, CircleExample> implements CircleService {

}
