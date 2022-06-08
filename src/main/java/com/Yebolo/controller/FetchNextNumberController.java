package com.Yebolo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Yebolo.dto.Response;
import com.Yebolo.service.FetchNextNumberService;

@RestController
public class FetchNextNumberController {

	@Autowired
	private FetchNextNumberService fetchNextNumberService;

	@PostMapping("/fetchNextNumber")
	public Response fetchNextNumber(@RequestBody Integer number) {
		return fetchNextNumberService.fetchNextNumber(number);
	}

}
