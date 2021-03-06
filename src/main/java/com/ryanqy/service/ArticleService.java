package com.ryanqy.service;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.ryanqy.dto.ArticleDto;
import com.ryanqy.dto.ArticleQueryDto;
import com.ryanqy.dto.ArticleQueryResultDto;
import com.ryanqy.entity.ArticleEntity;
import com.ryanqy.mapper.ArticleMapper;
import com.ryanqy.utils.functions.ArticleEntity2DtoFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Intellj Idea on 3/15/16.
 * 文章相关操作服务
 * @author wutong
 */
@Service
public class ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    public ArticleQueryResultDto findArticles(ArticleQueryDto articleQueryDto) {
        Preconditions.checkNotNull(articleQueryDto, "argument articleQueryDto can't be null!");
        ArticleQueryResultDto articleQueryResultDto = new ArticleQueryResultDto();
        articleQueryResultDto.setArticleQueryDto(articleQueryDto);
        List<ArticleEntity> articleEntities = articleMapper.findArticles(articleQueryDto);
        if (CollectionUtils.isEmpty(articleEntities)) {
            return articleQueryResultDto;
        }
        List<ArticleDto> articleDtoList = Lists.transform(articleEntities, ArticleEntity2DtoFunction.INSTANCE);
        Map<Long, ArticleDto> result = Maps.newHashMap();
        for (ArticleDto articleDto : articleDtoList) {
            result.put(articleDto.getArticleId(), articleDto);
        }

        articleQueryResultDto.setArticleDtoMap(result);

        int totalSize = articleMapper.findArticlesCount(articleQueryDto);
        articleQueryResultDto.setTotalSize(totalSize);

        return articleQueryResultDto;
    }

}
