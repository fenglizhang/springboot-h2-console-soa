package com.zlf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@Controller
public class Application {

	@RequestMapping("")
	public String home() {
		// return "xiaozhang ,Hello World!";
		return "/index";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

}