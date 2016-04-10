package com.ryanqy.mapper;

import com.ryanqy.dto.ArticleQueryDto;
import com.ryanqy.entity.ArticleEntity;
import com.ryanqy.mapper.provider.ArticleProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * Created by Intellj Idea on 3/15/16.
 *
 * @author wutong
 */
public interface ArticleMapper {

    @SelectProvider(method = "findArticles", type = ArticleProvider.class)
    List<ArticleEntity> findArticles(@Param("articleQueryDto") ArticleQueryDto articleQueryDto);

    @SelectProvider(method = "findArticlesCount", type = ArticleProvider.class)
    int findArticlesCount(@Param("articleQueryDto") ArticleQueryDto articleQueryDto);

}
