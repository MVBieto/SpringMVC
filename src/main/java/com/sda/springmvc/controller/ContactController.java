package com.sda.springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/contact")
public class ContactController {
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getContactsPage(){
        /*Vital thing to contain both: Model and View*/
        ModelAndView modelAndView = new ModelAndView();
        /*data container */
        ModelMap map = new ModelMap();
        map.addAttribute("name", "Miquel");
        map.addAttribute("age", "29");
        map.addAttribute("course", "Java");
        /*populating my ModelAndView*/
        modelAndView.addAllObjects(map);
        modelAndView.setViewName("/contact");
        return modelAndView;
    }
}