package com.ryanqy.mapper;

import com.ryanqy.entity.ArticleEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Intellj Idea on 3/15/16.
 *
 * @author wutong
 */
public interface ArticleMapper {

    @Select("select * from t_article where articleId = #{articleId}")
    ArticleEntity findArticleById(@Param("articleId") long articleId);
}
