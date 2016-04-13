package com.ryanqy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Intellj Idea on 4/13/16.
 *
 * @author wutong
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/index");

        return modelAndView;
    }


}
