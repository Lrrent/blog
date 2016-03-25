package com.ryanqy.utils.functions;

import com.google.common.base.Function;
import com.ryanqy.dto.ArticleDto;
import com.ryanqy.vo.SimpleArticleVo;
import org.joda.time.DateTime;
import org.springframework.cglib.beans.BeanCopier;

/**
 * Created by Intellj Idea on 3/25/16.
 *
 * @author wutong
 */
public class ArticleDto2IndexArticleVoFunction implements Function<ArticleDto, SimpleArticleVo> {

    private static final BeanCopier COPIER = BeanCopier.create(ArticleDto.class, SimpleArticleVo.class, false);

    public static final ArticleDto2IndexArticleVoFunction INSTANCE = new ArticleDto2IndexArticleVoFunction();

    private ArticleDto2IndexArticleVoFunction() {

    }

    @Override
    public SimpleArticleVo apply(ArticleDto articleDto) {
        if (articleDto == null) {
            return null;
        }
        SimpleArticleVo simpleArticleVo = new SimpleArticleVo();
        COPIER.copy(articleDto, simpleArticleVo, null);
        simpleArticleVo.setCreateTime(new DateTime(articleDto.getCreateTime()).toString("yyyy-MM-dd"));
        return simpleArticleVo;
    }
}
