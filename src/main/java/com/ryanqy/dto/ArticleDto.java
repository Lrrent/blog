package com.ryanqy.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Intellj Idea on 3/15/16.
 *
 * @author wutong
 */
@Data
public class ArticleDto implements Serializable {

    /**
     * 文章id
     */
    private long articleId;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 标题
     */
    private String title;

    /**
     * 作者
     */
    private String author = "ryanqy";

    /**
     * 摘要
     */
    private String pemmican;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
