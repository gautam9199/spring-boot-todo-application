package com.learning.springboottodoapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodoItemController {
    private final org.slf4j.Logger logger  =  org.slf4j.LoggerFactory.getLogger(TodoItemController.class);

    @GetMapping("/")
    public ModelAndView index() {
        logger.debug( "request to GET index");
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
