package com.ryanqy.vo;

import lombok.Data;

/**
 * Created by Intellj Idea on 3/25/16.
 * 文章视图对象,用户各个页面检索时,显示文章的信息
 * @author wutong
 */
@Data
public class SimpleArticleVo {

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
