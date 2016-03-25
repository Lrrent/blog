package com.ryanqy.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Intellj Idea on 3/25/16.
 *
 * @author wutong
 */
@Data
public class IndexArticleVo implements Serializable{

    /**
     * 文章id
     */
    private long articleId;

    /**
     * 作者
     */
    private String author;

    /**
     * 标题
     */
    private String title;

    /**
     * 摘要
     */
    private String pemmican;

    /**
     * 创建时间
     */
    private String createTime;

}
