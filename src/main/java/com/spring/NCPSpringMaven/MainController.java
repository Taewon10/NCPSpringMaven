//NCPSpringMaven/src/main/java/com/spring/NCPSpringMaven/MainController.java
package com.spring.NCPSpringMaven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping(value = "/")
	public String index() {
		System.out.println("NCP");
		return "/index";
	}

}