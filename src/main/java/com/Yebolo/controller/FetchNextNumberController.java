package com.Yebolo.controller;

import com.Yebolo.dto.Response;
import com.Yebolo.service.FetchNextNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FetchNextNumberController {

    @Autowired
    private FetchNextNumberService fetchNextNumberService;

    @GetMapping("/fetchNextNumber")
    public Response fetchNextNumber(@RequestBody Integer number){
        return fetchNextNumberService.fetchNextNumber(number);
    }

}
