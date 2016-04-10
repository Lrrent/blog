package com.ryanqy.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by Intellj Idea on 4/10/16.
 *
 * @author wutong
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleVo {

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
     * 文章类型
     */
    private int articleType;

    /**
     * 作者
     */
    private String author = "Ryanqy";

    /**
     * 摘要
     */
    private String summary;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

}
