package com.ryanqy.service;

import com.ryanqy.dto.ArticleDto;
import com.ryanqy.entity.ArticleEntity;
import com.ryanqy.mapper.ArticleMapper;
import com.ryanqy.utils.functions.ArticleEntity2DtoFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Created by Intellj Idea on 3/15/16.
 *
 * @author wutong
 */
@Service
public class ArticleUpdateService {

    @Autowired
    private ArticleMapper articleMapper;

    public ArticleDto findArticleById(long id) {
        if (id <= 0) {
            return null;
        }
        ArticleEntity articleEntity = articleMapper.findArticleById(id);
        if (Objects.isNull(articleEntity)) {
            return null;
        }
        return ArticleEntity2DtoFunction.INSTANCE.apply(articleEntity);
    }


}
