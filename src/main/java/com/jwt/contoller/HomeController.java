package com.jwt.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/welcome")
	public String welcome() {
		String text = "This is private Controller you can no access this controller";
		return text;
	}
	@RequestMapping("/getUser")
	public String getUser() {
		return "{\"name\":\"Jatender Khatri\"}";
	}
}
