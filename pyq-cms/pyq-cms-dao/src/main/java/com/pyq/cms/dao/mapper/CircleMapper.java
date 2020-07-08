package com.pyq.cms.dao.mapper;

import com.pyq.cms.dao.model.Circle;
import com.pyq.cms.dao.model.CircleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CircleMapper {
    long countByExample(CircleExample example);

    int deleteByExample(CircleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Circle record);

    int insertSelective(Circle record);

    List<Circle> selectByExample(CircleExample example);

    Circle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Circle record, @Param("example") CircleExample example);

    int updateByExample(@Param("record") Circle record, @Param("example") CircleExample example);

    int updateByPrimaryKeySelective(Circle record);

    int updateByPrimaryKey(Circle record);
}