package com.cognizant.fego.cicdtemplates;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdtemplatesController {

	@GetMapping("/hellocicd")
	public String helloCiCdWorld() {
		return "Hello Ci Cd world";
	}

}

