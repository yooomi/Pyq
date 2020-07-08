package com.pyq.cms.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.pyq.cms.dao.mapper.UserMapper;
import com.pyq.cms.dao.model.User;
import com.pyq.cms.dao.model.UserExample;

/**
* 降级实现UserService接口
* Created by shuzheng on 2020/5/21.
*/
public class UserServiceMock extends BaseServiceMock<UserMapper, User, UserExample> implements UserService {

}
