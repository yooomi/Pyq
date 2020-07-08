package com.pyq.cms.dao.mapper;

import com.pyq.cms.dao.model.Star;
import com.pyq.cms.dao.model.StarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StarMapper {
    long countByExample(StarExample example);

    int deleteByExample(StarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Star record);

    int insertSelective(Star record);

    List<Star> selectByExample(StarExample example);

    Star selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Star record, @Param("example") StarExample example);

    int updateByExample(@Param("record") Star record, @Param("example") StarExample example);

    int updateByPrimaryKeySelective(Star record);

    int updateByPrimaryKey(Star record);
}