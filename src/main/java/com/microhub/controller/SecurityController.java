package com.microhub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/4/17 0017.
 */


@Controller
@RequestMapping("/sec")
public class SecurityController {


	@RequestMapping("/")
	public String index() {
		return "sec/index";
	}
	@RequestMapping("/hello")
	public String hello() {
		return "sec/hello";
	}
	@RequestMapping("/login")
	public String login() {
		return "sec/login";
	}
}
