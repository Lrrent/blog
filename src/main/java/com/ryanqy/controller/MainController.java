package com.ryanqy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Intellj Idea on 3/15/16.
 *
 * @author wutong
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping("/")
    public String main() {
        return "index";
    }

    @RequestMapping("/index")
    public String main1() {
        return "index1";
    }

}
