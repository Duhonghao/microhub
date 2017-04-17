package com.microhub.controller;

import com.microhub.entity.City;
import com.microhub.mapper.CityMapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Tony on 2017/4/17 0017.
 * Druid +  mybatis 测试
 */
@RestController
@RequestMapping("/demo")
@EnableAutoConfiguration
public class CityController {

	@Resource
	private CityMapper cityMapper;

	@RequestMapping("/test")
	String test1() {
		return "hello,test1()";
	}

	@RequestMapping("/findCity2")
	City findCity2(@RequestParam String id) {
		return cityMapper.findCityById(id);
	}


}
