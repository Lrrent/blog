package com.ryanqy.controller;

import com.google.common.collect.Lists;
import com.ryanqy.dto.ArticleDto;
import com.ryanqy.dto.ArticleQueryDto;
import com.ryanqy.service.ArticleService;
import com.ryanqy.utils.functions.ArticleDto2IndexArticleVoFunction;
import com.ryanqy.vo.SimpleArticleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView main(ArticleQueryDto articleQueryDto) {
        if (!articleQueryDto.isReverseOrderByCreateTime()) {
            articleQueryDto.setReverseOrderByCreateTime(true);
        }
        if (articleQueryDto.getPageSize() == 0) {
            articleQueryDto.setPageSize(4);
        }
        if (articleQueryDto.getPageIndex() == -1) {
            articleQueryDto.setPageIndex(0);
        }
        Map<Long, ArticleDto> longArticleDtoMap = articleService.findArticleByIds(articleQueryDto);
        List<SimpleArticleVo> simpleArticleVoList = Lists.transform(Lists.newArrayList(longArticleDtoMap.values()), ArticleDto2IndexArticleVoFunction.INSTANCE);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("articles", simpleArticleVoList);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/findArticles")
    public List<SimpleArticleVo> findArticles(@RequestBody ArticleQueryDto articleQueryDto) {

        return Lists.newArrayList();
    }

}
