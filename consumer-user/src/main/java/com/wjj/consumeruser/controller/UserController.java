package com.wjj.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("buy")
    public String buyTicket(@RequestParam String name){
        String ticket = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return name + "购买了" + ticket;
    }
}
