package com.ryanqy.mapper.provider;

import com.google.common.base.Joiner;
import com.ryanqy.dto.ArticleQueryDto;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by Intellj Idea on 3/26/16.
 *
 * @author wutong
 */
public class ArticleProvider {

    public String findArticleByIds(ArticleQueryDto articleQueryDto) {
        SQL sql = new SQL();
        sql.SELECT("*");
        sql.WHERE("articleId in (" + Joiner.on(",").skipNulls().join(articleQueryDto.getArticleIds()) + ")");
        if (articleQueryDto.isReverseOrderByCreateTime()) {
            sql.ORDER_BY("createTime asc");
        }
        return sql.toString() + " limit " + articleQueryDto.getPageIndex() + " , " + articleQueryDto.getPageSize();
    }

}
