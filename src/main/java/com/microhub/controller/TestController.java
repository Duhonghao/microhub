package com.microhub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tony on 2017/4/17 0017.
 */
@Controller
public class TestController {


	@RequestMapping(value = {"/", "/index"})
	public String index(Model model) {
		model.addAttribute("name", "Tony");
		return "index";
	}


	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> json() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Tony");
		map.put("age", "18");
		map.put("sex", "man");
		return map;
	}


}
