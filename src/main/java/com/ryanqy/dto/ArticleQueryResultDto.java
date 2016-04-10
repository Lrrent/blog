package com.ryanqy.dto;

import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Created by Intellj Idea on 4/10/16.
 *
 * @author wutong
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleQueryResultDto {

    private ArticleQueryDto articleQueryDto;

    private Map<Long, ArticleDto> articleDtoMap = Maps.newHashMap();

    private int totalSize;

}
