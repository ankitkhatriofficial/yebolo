package com.Yebolo.service.impl;

import com.Yebolo.dto.Response;
import com.Yebolo.service.FetchNextNumberService;
import org.springframework.stereotype.Service;

@Service
public class FetchNextNumberServiceImpl implements FetchNextNumberService {


    @Override
    public Response fetchNextNumber(Integer number) {
        int temp = 0, count = 0;
        String s = String.valueOf(number);
        if(s != null){
            while(s.length() > 1){
                temp = 0;
                for(int i =0; i< s.length();i++){
                    temp += (s.charAt(i) - '0');
                }
                s = temp + "";
                count++;
            }
            return new Response(number, count);
        }
        return null;
    }
}
