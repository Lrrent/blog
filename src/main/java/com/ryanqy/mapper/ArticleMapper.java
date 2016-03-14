package com.ryanqy.mapper;

import com.ryanqy.entity.ArticleEntity;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Intellj Idea on 3/15/16.
 *
 * @author wutong
 */
@Component
public class ArticleMapper {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public ArticleEntity findArticleById(long articleId) {
        return this.sqlSessionTemplate.selectOne("findArticleById", articleId);
    }

}
