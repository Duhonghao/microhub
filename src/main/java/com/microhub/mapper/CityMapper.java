package com.microhub.mapper;

import com.microhub.entity.City;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2017/4/17 0017.
 */
public interface CityMapper {


	@Select("select * from city where id = #{id}")
	City findCityById(@Param("id") String id);
}
