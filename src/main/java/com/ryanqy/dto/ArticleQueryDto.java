package com.ryanqy.dto;

import com.google.common.collect.Sets;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

import java.util.Set;

/**
 * Created by Intellj Idea on 3/26/16.
 *
 * @author wutong
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleQueryDto {

    /**
     * 文章Id
     */
    private Set<Long> articleIds = Sets.newHashSet();

    /**
     * 文章类型
     * @see ArticleType
     */
    private ArticleType articleType;

    /**
     * 分页大小
     */
    private int pageSize;

    /**
     * 分页索引
     */
    private int pageIndex = -1;

    /**
     * 是否按照创建时间逆序
     */
    private boolean reverseOrderByCreateTime = false;

}
