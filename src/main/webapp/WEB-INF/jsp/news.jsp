﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="en">
<!--<![endif]-->
<head>

  <!-- Basic Page Needs
    ================================================== -->
  <meta charset="utf-8">
  <title>疯狂的程序员</title>
  <meta name="description" content="Java Redis Mysql">
  <meta name="author" content="疯狂的程序员">

  <!-- Mobile Specific Metas 兼容手机模式 -->
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

  <!-- CSS -->
  <link rel="stylesheet" href="css/zerogrid.css">
  <link rel="stylesheet" href="css/index.css">
  <link rel="stylesheet" href="css/responsive.css">
  <link rel="stylesheet" href="css/cypager.min.css"/>
  <!-- CSS END -->

  <!-- 分页 -->
  <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>

  <!-- 焦点图 img 619-392px -->
  <script src="js/jquery.img_silder.js"></script>
  <script>
    $(function () {
      $('#silder').imgSilder({
        s_width: '100%', //容器宽度
        s_height: 322, //容器高度
        is_showTit: true, // 是否显示图片标题 false :不显示，true :显示
        s_times: 3000, //设置滚动时间
        css_link: 'css/banner.css'
      });
    });
  </script>

  <!--[if lt IE 8]>
  <div style=' clear: both; text-align:center; position: relative;'>
    <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
      <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0"
           height="42" width="820"
           alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today."/>
    </a>
  </div>
  <![endif]-->

  <!--[if lt IE 9]>
  <script src="js/html5.js"></script>
  <script src="js/css3-mediaqueries.js"></script>
  <![endif]-->

  <!--浏览器中显示的ICON-->
  <link href='./images/favicon.ico' rel='icon' type='image/x-icon'/>
</head>

<body>
<div class="wrap-body zerogrid">

  <%@ include file="header.jsp" %>

  <section id="content">
    <div class="wrap-content">
      <div class="row block">
        <div id="main-content" class="col-2-3">
          <div class="wrap-col">
            <div style="height:20px; clear:both;"></div>
            <c:forEach items="${articles}" var="article">
              <article>
                <div class="content"><img src="images/img1.jpg" width="120px" height="120px"/>
                  <h5><a href="articleDetail.jsp">${article.title}</a></h5>
                  <p>${article.summary}[...]</p>
                  <div style="font-size:14px;">
                      ${article.createTime}-<a href="#">${article.author}</a> <a class="a2" href="/findArticleById?articleId=${article.articleId}">阅读全文</a>
                  </div>
                </div>
              </article>
            </c:forEach>
          </div>

          <!--分页-->
          <div style="clear:both; height:10px;"></div>
          <div style=" " id="pagerArea" unselectable="on" onselectstart="return false;" style="-moz-user-select:none;"></div>
          </br>
          <div id="console"></div>
          <!--分页-->

        </div>
        <%@include file="sideBar.jsp" %>
      </div>
    </div>
  </section>

  <%@ include file="footer.jsp" %>
</div>
</body>

<!--分页插件-->
<script type="text/javascript" src="js/cypager.min.js"></script>
<script>
  <!--
  $(function () {
    $("#pagerArea").cypager({
      pg_size: 10, pg_nav_count: 8, pg_total_count: 194, pg_call_fun: function (count) {
        $("#console").html("正在加载第(" + count + ")页的数据，请稍后.......");
      }
    });
  });
  -->
</script>
</html>
