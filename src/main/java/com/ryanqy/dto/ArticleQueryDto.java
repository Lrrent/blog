package com.ryanqy.dto;

import com.google.common.collect.Sets;
import lombok.Data;
import lombok.experimental.Builder;

import java.util.Set;

/**
 * Created by Intellj Idea on 3/26/16.
 *
 * @author wutong
 */
@Data
@Builder
public class ArticleQueryDto {

    private Set<Long> articleIds = Sets.newHashSet();

    private int pageSize;

    private int pageIndex;

    private boolean reverseOrderByCreateTime = false;

}
