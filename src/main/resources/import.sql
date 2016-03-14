CREATE TABLE IF NOT EXISTS  t_article (
  articleId  INT PRIMARY KEY AUTO_INCREMENT COMMENT '文章Id',
  content    TEXT COMMENT '文章内容',
  createTime TIMESTAMP DEFAULT '1991-03-16 10:30:23' COMMENT '创建时间',
  updateTime TIMESTAMP DEFAULT '1991-03-16 10:30:23' ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
);

INSERT INTO t_article (content, createTime, updateTime) VALUES ('SAN FRANCISCO', now(), now());


