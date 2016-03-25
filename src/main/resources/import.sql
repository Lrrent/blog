
DROP TABLE t_article;

CREATE TABLE `t_article` (
  `articleId` int(11) NOT NULL AUTO_INCREMENT COMMENT '文章Id',
  `content` text COMMENT '文章内容',
  `title` varbinary(500) DEFAULT NULL COMMENT '文章标题',
  `pemmican` varbinary(500) DEFAULT NULL COMMENT '文章摘要',
  `createTime` timestamp NOT NULL DEFAULT '1991-03-16 10:30:23' COMMENT '创建时间',
  `updateTime` timestamp NOT NULL DEFAULT '1991-03-16 10:30:23' ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`articleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO t_article (title, pemmican, content, createTime, updateTime) VALUES
  ('开始掌管位于加州硅谷的大众北美设', '1989年，J Mays开始掌管位于加州硅谷的大众北美设计中心，在这里，他主导设计的1994款VW Concept One概念车催生了堪称复古经甲壳虫，无聊代名词',
   '1989年，J Mays开始掌管位于加州硅谷的大众北美设计中心，在这里，他主导设计的1994款VW Concept One概念车催生了堪称复古经典的「New Beetle 」大众新甲壳虫，他与ACCD的同学Freeman Thomas一起设计的1995款Audi TT概念车已是奥迪三代TT小跑车的精神鼻祖，而这两款车成功让现代大众与奥迪摆脱了「设计无聊代名词 」的身份。',
   now(), now());



