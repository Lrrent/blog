package com.ryanqy.mapper.provider;

import com.google.common.base.Joiner;
import com.ryanqy.dto.ArticleQueryDto;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.CollectionUtils;

import java.util.Map;

/**
 * Created by Intellj Idea on 3/26/16.
 *
 * @author wutong
 */
public class ArticleProvider {

    public String findArticles(Map<String, Object> parameters) {
        ArticleQueryDto articleQueryDto = (ArticleQueryDto) parameters.get("articleQueryDto");
        SQL sql = new SQL();
        sql.SELECT("*");
        sql.FROM("t_article");
        if (!CollectionUtils.isEmpty(articleQueryDto.getArticleIds())) {
            sql.WHERE("articleId in (" + Joiner.on(",").skipNulls().join(articleQueryDto.getArticleIds()) + ")");
        }
        if (articleQueryDto.getArticleType() != null) {
            sql.WHERE("articleType = " + articleQueryDto.getArticleType());
        }
        if (articleQueryDto.getReverseOrderByCreateTime() != null && articleQueryDto.getReverseOrderByCreateTime()) {
            sql.ORDER_BY("createTime asc");
        }
        if (articleQueryDto.getPageIndex() != null && articleQueryDto.getPageSize() != null) {
            return sql.toString() + " limit " + articleQueryDto.getPageIndex() + " , " + articleQueryDto.getPageSize();
        }
        return sql.toString();
    }

}
