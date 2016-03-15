package com.ryanqy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Intellj Idea on 3/15/16.
 *
 * @author wutong
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @RequestMapping("/main")
    public String main() {
        return "main";
    }

}
