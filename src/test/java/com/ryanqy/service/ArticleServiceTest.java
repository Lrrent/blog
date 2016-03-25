package com.ryanqy.service;

import com.ryanqy.Application;
import com.ryanqy.dto.ArticleDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Intellj Idea on 3/15/16.
 *
 * @author wutong
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ArticleServiceTest {

    @Autowired
    private ArticleService articleService;

    @Test
    public void testFindArticleById() throws Exception {
        ArticleDto articleDto = articleService.findArticleById(1);
        Assert.assertNotNull(articleDto);
        Assert.assertNotNull(articleDto.getContent());
        Assert.assertTrue("SAN FRANCISCO".equals(articleDto.getContent()));
    }
}