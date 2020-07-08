package com.pyq.cms.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.pyq.cms.dao.mapper.CommentsMapper;
import com.pyq.cms.dao.model.Comments;
import com.pyq.cms.dao.model.CommentsExample;

/**
* 降级实现CommentsService接口
* Created by shuzheng on 2020/5/21.
*/
public class CommentsServiceMock extends BaseServiceMock<CommentsMapper, Comments, CommentsExample> implements CommentsService {

}
