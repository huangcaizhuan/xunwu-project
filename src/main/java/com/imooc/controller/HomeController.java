package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 首页
 * @author hcz
 * 2018.9.26
 */
@Controller
public class HomeController {
	@GetMapping("/")
	public String index(){
		return "index";
	}

}
