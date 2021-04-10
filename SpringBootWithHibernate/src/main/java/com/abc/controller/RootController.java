package com.abc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RootController {

	// get All Records
	@GetMapping("/product/all")
	public ResponseEntity<?> getAll() {
		ResponseEntity<?> resp = null;
			resp = new ResponseEntity<String>("Hi, This is test", HttpStatus.OK);
		return resp;
	}
}
