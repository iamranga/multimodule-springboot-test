package com.cognizant.fego.servicetemplates;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicetemplatesController {

	@GetMapping("/helloservicetemplates")
	public String helloServiceWorld() {
		return "Hello Service templates world";
	}

}

