package com.ryanqy.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Intellj Idea on 3/15/16.
 * 博客文章实体
 * @author wutong
 */
@Data
public class ArticleEntity implements Serializable{

    /**
     * 文章id
     */
    private long articleId;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
