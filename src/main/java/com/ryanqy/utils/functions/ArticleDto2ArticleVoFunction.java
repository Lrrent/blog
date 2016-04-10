package com.ryanqy.utils.functions;

import com.google.common.base.Function;
import com.ryanqy.dto.ArticleDto;
import com.ryanqy.vo.ArticleVo;
import org.joda.time.DateTime;
import org.springframework.cglib.beans.BeanCopier;

/**
 * Created by Intellj Idea on 3/25/16.
 *
 * @author wutong
 */
public class ArticleDto2ArticleVoFunction implements Function<ArticleDto, ArticleVo> {

    private static final BeanCopier COPIER = BeanCopier.create(ArticleDto.class, ArticleVo.class, false);

    public static final ArticleDto2ArticleVoFunction INSTANCE = new ArticleDto2ArticleVoFunction();

    private ArticleDto2ArticleVoFunction() {

    }

    @Override
    public ArticleVo apply(ArticleDto articleDto) {
        if (articleDto == null) {
            return null;
        }
        ArticleVo articleVo = new ArticleVo();
        COPIER.copy(articleDto, articleVo, null);
        articleVo.setCreateTime(new DateTime(articleDto.getCreateTime()).toString("yyyy-MM-dd"));
        return articleVo;
    }
}
