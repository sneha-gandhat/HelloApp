package com.SpringHello.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/helloApplication")	
	public String displayMsg() {
		return "Hello World Application.......!!!!!";
	}

}
