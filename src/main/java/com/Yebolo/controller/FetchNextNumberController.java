package com.Yebolo.controller;

import com.Yebolo.dto.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FetchNextNumberController {

    @GetMapping("/fetchNextNumber")
    public Response fetchNextNumber(){

    }

}
