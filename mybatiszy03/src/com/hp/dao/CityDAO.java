package com.hp.dao;

import com.hp.entity.City;
import com.hp.entity.CityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CityDAO {
    long countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

    List<Map> dongTaiCantonalSelectCity(Map map);
}