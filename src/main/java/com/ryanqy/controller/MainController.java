package com.ryanqy.controller;

import com.google.common.collect.Lists;
import com.ryanqy.dto.ArticleDto;
import com.ryanqy.dto.ArticleQueryDto;
import com.ryanqy.service.ArticleService;
import com.ryanqy.utils.functions.ArticleDto2IndexArticleVoFunction;
import com.ryanqy.vo.IndexArticleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by Intellj Idea on 3/15/16.
 *
 * @author wutong
 */
@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/")
    public ModelAndView main() {
        ArticleQueryDto articleQueryDto = ArticleQueryDto.builder().reverseOrderByCreateTime(true)
                .pageSize(4).pageIndex(0).build();
        Map<Long, ArticleDto> longArticleDtoMap = articleService.findArticleByIds(articleQueryDto);
        List<IndexArticleVo> indexArticleVoList = Lists.transform(Lists.newArrayList(longArticleDtoMap.values()), ArticleDto2IndexArticleVoFunction.INSTANCE);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("articles", indexArticleVoList);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/index")
    public String main1() {
        return "index1";
    }

}
