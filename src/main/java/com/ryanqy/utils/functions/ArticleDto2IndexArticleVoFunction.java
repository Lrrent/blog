package com.ryanqy.utils.functions;

import com.google.common.base.Function;
import com.ryanqy.dto.ArticleDto;
import com.ryanqy.vo.IndexArticleVo;
import org.springframework.cglib.beans.BeanCopier;

/**
 * Created by Intellj Idea on 3/25/16.
 *
 * @author wutong
 */
public class ArticleDto2IndexArticleVoFunction implements Function<ArticleDto, IndexArticleVo> {

    private static final BeanCopier COPIER = BeanCopier.create(ArticleDto.class, IndexArticleVo.class, false);

    public static final ArticleDto2IndexArticleVoFunction INSTANCE = new ArticleDto2IndexArticleVoFunction();

    private ArticleDto2IndexArticleVoFunction() {

    }

    @Override
    public IndexArticleVo apply(ArticleDto articleDto) {
        if (articleDto == null) {
            return null;
        }
        IndexArticleVo indexArticleVo = new IndexArticleVo();
        COPIER.copy(articleDto, indexArticleVo, null);
//        Instant instant = articleDto.getCreateTime().toInstant();
        return indexArticleVo;
    }
}
