package com.ryanqy.utils.functions;

import com.google.common.base.Function;
import com.ryanqy.dto.ArticleDto;
import com.ryanqy.entity.ArticleEntity;
import org.springframework.cglib.beans.BeanCopier;

/**
 * Created by Intellj Idea on 3/15/16.
 *
 * @author wutong
 */
public class ArticleEntity2DtoFunction implements Function<ArticleEntity,ArticleDto> {

    public static final ArticleEntity2DtoFunction INSTANCE = new ArticleEntity2DtoFunction();

    private ArticleEntity2DtoFunction() {

    }

    private static final BeanCopier COPIER = BeanCopier.create(ArticleEntity.class, ArticleDto.class, false);

    @Override
    public ArticleDto apply(ArticleEntity articleEntity) {
        if (articleEntity == null) {
            return null;
        }
        ArticleDto articleDto = new ArticleDto();
        COPIER.copy(articleEntity, articleDto, null);
        return articleDto;
    }

}
