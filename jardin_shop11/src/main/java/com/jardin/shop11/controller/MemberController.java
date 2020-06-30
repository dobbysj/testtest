package com.jardin.shop11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("login")
	public String login() {
		return "user/member/login";
	}
	
}
