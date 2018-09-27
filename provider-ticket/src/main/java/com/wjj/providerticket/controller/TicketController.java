package com.wjj.providerticket.controller;

import com.wjj.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {


    @Autowired
    TicketService ticketService;

    @GetMapping("ticket")
    public String getTicket(){
        return ticketService.getTicket();
    }
}
