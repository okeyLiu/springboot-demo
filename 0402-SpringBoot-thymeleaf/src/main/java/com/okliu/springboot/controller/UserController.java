package com.okliu.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.okliu.springboot.entity.User;

@Controller
public class UserController {

	@RequestMapping("/i18n")
	public String index() {
		return "index-i18n";
	}
	
	@RequestMapping("/index")
	public String index(Model model) {
		List<User> users = Arrays.asList(
				new User(1001,"李菲","lifei@163.com"),
				new User(1002,"王菲","wangfei@163.com"),
				new User(1003,"张菲","zhangfei@163.com"),
				new User(1004,"刘菲","liufei@163.com"),
				new User(1006,"孙菲","sunfei@163.com")
		);
		model.addAttribute("users", users);
		return "index";//返回视图的逻辑名称  resources/templates/index.html
	}
	
}
