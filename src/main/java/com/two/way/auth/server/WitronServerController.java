package com.two.way.auth.server;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("witron/server")
public class WitronServerController {

	@GetMapping("/snap")
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	public String getSnap() {
		return "Returing witorn server inventory snapshot!!";
	}
}
