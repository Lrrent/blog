package com.ryanqy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Intellj Idea on 3/15/16.
 * 博客文章实体
 *
 * @author wutong
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleEntity {

    /**
     * 文章id
     */
    private long articleId;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章类型
     */
    private int articleType;

    /**
     * 标题
     */
    private String title;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
