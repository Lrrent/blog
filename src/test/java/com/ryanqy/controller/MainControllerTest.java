package com.ryanqy.controller;

import com.ryanqy.Application;
import com.ryanqy.dto.ArticleQueryDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.*;

/**
 * Created by Intellj Idea on 4/10/16.
 *
 * @author wutong
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class MainControllerTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private MainController mainController;

    @Test
    public void main() throws Exception {
        ArticleQueryDto articleQueryDto = new ArticleQueryDto();
        ModelAndView modelAndView = mainController.main(articleQueryDto);
        Assert.assertTrue(modelAndView.getViewName().equals("index"));
    }

    @Test
    public void findArticleById() throws Exception {
        ModelAndView modelAndView = mainController.findArticleById(1);
        Assert.assertTrue(modelAndView.getViewName().equals("articleDetail"));
    }

}