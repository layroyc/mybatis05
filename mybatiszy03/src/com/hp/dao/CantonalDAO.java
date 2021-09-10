package com.hp.dao;

import com.hp.entity.Cantonal;
import com.hp.entity.CantonalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CantonalDAO {
    long countByExample(CantonalExample example);

    int deleteByExample(CantonalExample example);

    int deleteByPrimaryKey(Integer qid);

    int insert(Cantonal record);

    int insertSelective(Cantonal record);

    List<Cantonal> selectByExample(CantonalExample example);

    Cantonal selectByPrimaryKey(Integer qid);

    int updateByExampleSelective(@Param("record") Cantonal record, @Param("example") CantonalExample example);

    int updateByExample(@Param("record") Cantonal record, @Param("example") CantonalExample example);

    int updateByPrimaryKeySelective(Cantonal record);

    int updateByPrimaryKey(Cantonal record);
}