package com.sda.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/contact", produces = "XML")
public class ContactController
{
    @RequestMapping(method = RequestMethod.GET)
    public String getContactsPage(){
        return "/contact";
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createNewContact() {
        return;
    }
}
