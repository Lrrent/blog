package com.ryanqy.controller;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.ryanqy.dto.ArticleDto;
import com.ryanqy.dto.ArticleQueryDto;
import com.ryanqy.dto.ArticleQueryResultDto;
import com.ryanqy.dto.ArticleType;
import com.ryanqy.service.ArticleService;
import com.ryanqy.utils.functions.ArticleDto2ArticleVoFunction;
import com.ryanqy.vo.ArticleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
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
        initArticleQueryDtoPageSettings(articleQueryDto);
        ArticleQueryResultDto articleQueryResultDto = articleService.findArticles(articleQueryDto);
        Map<Long, ArticleDto> longArticleDtoMap = articleQueryResultDto.getArticleDtoMap();
        List<ArticleVo> simpleArticleVoList = Lists.transform(Lists.newArrayList(longArticleDtoMap.values()), ArticleDto2ArticleVoFunction.INSTANCE);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("articles", simpleArticleVoList);
        if (articleQueryDto.getArticleType() == null) {
            modelAndView.setViewName("index");
        } else if (articleQueryDto.getArticleType() == ArticleType.NEWS) {
            modelAndView.setViewName("news");
        } else if (articleQueryDto.getArticleType() == ArticleType.WEB) {
            modelAndView.setViewName("web");
        } else if (articleQueryDto.getArticleType() == ArticleType.ARCHITECTURE) {
            modelAndView.setViewName("architecture");
        } else if (articleQueryDto.getArticleType() == ArticleType.TECHNOLOGY) {
            modelAndView.setViewName("technology");
        } else if (articleQueryDto.getArticleType() == 5) {
            modelAndView.setViewName("book");
        }
        modelAndView.addObject("totalSize", articleQueryResultDto.getTotalSize());
        modelAndView.addObject("pageSize", articleQueryResultDto.getArticleQueryDto().getPageSize());
        return modelAndView;
    }

    private void initArticleQueryDtoPageSettings(ArticleQueryDto articleQueryDto) {
        articleQueryDto.setReverseOrderByCreateTime(true);
        articleQueryDto.setPageSize(4);
        articleQueryDto.setPageIndex(0);
    }

    @RequestMapping("/findArticleById")
    public ModelAndView findArticleById(long articleId) {
        ArticleQueryDto articleQueryDto = new ArticleQueryDto();
        articleQueryDto.setArticleIds(Sets.newHashSet(articleId));
        ArticleQueryResultDto articleQueryResultDto = articleService.findArticles(articleQueryDto);
        Map<Long, ArticleDto> longArticleDtoMap = articleQueryResultDto.getArticleDtoMap();
        if (CollectionUtils.isEmpty(longArticleDtoMap) || longArticleDtoMap.entrySet().size() != 1) {
            return null;
        }
        ArticleVo articleVo = ArticleDto2ArticleVoFunction.INSTANCE.apply(longArticleDtoMap.get(articleId));
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("article", articleVo);
        modelAndView.setViewName("articleDetail");
        return modelAndView;
    }

}
