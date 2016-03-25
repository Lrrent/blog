﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<title>Wu Tong-Blog</title>
<meta name="description" content="关键词  网页架构  代码 | 代码">
<meta name="author" content="Web  架构">

<!-- Mobile Specific Metas 兼容手机模式 -->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- CSS -->
<link rel="stylesheet" href="css/zerogrid.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/responsive.css">

<!-- 分页 -->
<script type="text/javascript" src="js/jquery-1.7.1.min.js" ></script>
<link rel="stylesheet" href="css/cypager.min.css" />

<!-- 焦点图 img 619-392px -->
<script src="js/jquery.img_silder.js"></script>
<script>
        $(function(){
            $('#silder').imgSilder({
				s_width:'100%', //容器宽度
				s_height:322, //容器高度
				is_showTit:true, // 是否显示图片标题 false :不显示，true :显示
				s_times:3000, //设置滚动时间
				css_link:'css/banner.css'
			});
		});
    </script>

<!-- CSS END -->

<!--[if lt IE 8]>
       <div style=' clear: both; text-align:center; position: relative;'>
         <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
           <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
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
  <!--------------Header--------------->
  <header>
    <div class="wrap-header">
      <div id="logo"> <a href="#">
        <h1>Wu  Tong</h1>
        </a>
        <p>Senior Coder Club of CT</p>
      </div>
      <nav>
        <div class="wrap-nav">
          <div class="menu">
            <ul>
              <li><a href="index.jsp">首页</a></li>
              <!-- <li><a href="blog_list.html">文章列表</a></li>-->
              <li><a href="news_list.html">资讯</a></li>
              <li><a href="web.html">Web</a></li>
              <li><a href="architecture.html">架构</a></li>
              <li><a href="technology.html">基础技术</a></li>
              <li><a href="book.html">书籍</a></li>
            </ul>
            <div id="search">
              <div class="button-search"></div>
              <input type="text" value="Search..." onFocus="if (this.value == &#39;Search...&#39;) {this.value = &#39;&#39;;}" onBlur="if (this.value == &#39;&#39;) {this.value = &#39;Search...&#39;;}">
            </div>
          </div>
        </div>
      </nav>
    </div>
  </header>
  <!--------------Header  end---------------> 
  
  <!--------------Content--------------->
  <section id="content">
  <div class="wrap-content">
    <div class="row block">
      <div id="main-content" class="col-2-3">
        <div class="wrap-col">
          <div class="silder" id="silder">
            <ul class="silder_list" id="silder_list">
              <li> <img src="http://ww3.sinaimg.cn/large/adde8400gw1eblxy40vs6j218g0g4wi7.jpg" border="0" alt="我是好吃的1"> </li>
              <li> <img src="http://ww2.sinaimg.cn/large/adde8400gw1eblxzy7emij218g0g4160.jpg" border="0" alt="我是好吃的2"> </li>
              <li> <img src="http://ww3.sinaimg.cn/large/adde8400gw1eblxxxsai8j218g0g4jux.jpg" border="0" alt="我是好吃的3"> </li>
              <li> <img src="http://ww1.sinaimg.cn/large/adde8400gw1ebly43852cj218g0g4wi0.jpg" border="0" alt="我是好吃的4"> </li>
            </ul>
          </div>
          <div style="height:20px; clear:both;"></div>
          <article>
            <div class="content"> <img src="images/img1.jpg" width="120px" height="120px"/>
              <h5><a href="blog_detail.html">开始掌管位于加州硅谷的大众北美设</a></h5>
              <p>1989年，J Mays开始掌管位于加州硅谷的大众北美设计中心，在这里，他主导设计的1994款VW Concept One概念车催生了堪称复古经甲壳虫，无聊代名词 [...]</p>
              <div style="font-size:14px;">2016-3-19-<a href="#">wutong</a> <a class="a2" href="blog_detail.html">阅读全文</a> </div>
            </div>
          </article>
          <article>
            <div class="content"> <img src="images/img1.jpg" width="120px" height="120px"/>
              <h5><a href="blog_detail.html">开始掌管位于加州硅谷的大众北美设</a></h5>
              <p>1989年，J Mays开始掌管位于加州硅谷的大众北美设计中心，在这里，他主导设计的1994款VW Concept One概念车催生了堪称复古经甲壳虫，无聊代名词 [...]</p>
              <div style="font-size:14px;">2016-3-19-<a href="#">wutong</a> <a class="a2" href="blog_detail.html">阅读全文</a> </div>
            </div>
          </article>
          <article>
            <div class="content"> <img src="images/img1.jpg" width="120px" height="120px"/>
              <h5><a href="blog_detail.html">开始掌管位于加州硅谷的大众北美设</a></h5>
              <p>1989年，J Mays开始掌管位于加州硅谷的大众北美设计中心，在这里，他主导设计的1994款VW Concept One概念车催生了堪称复古经甲壳虫，无聊代名词 [...]</p>
              <div style="font-size:14px;">2016-3-19-<a href="#">wutong</a> <a class="a2" href="blog_detail.html">阅读全文</a> </div>
            </div>
          </article>
        </div>
        
        <!--分页-->
        <div style="clear:both; height:10px;"></div>
        <div style=" " id="pagerArea" unselectable="on" onselectstart="return false;" style="-moz-user-select:none;">
      </div>
      </br>
      <div id="console" ></div>
      <!--分页--> 
      
    </div>
    <div id="sidebar" class="col-1-3">
      <div class="wrap-col">
        <div class="box">
          <div class="heading">
            <h2>个人信息</h2>
          </div>
          <div class="content"> <a href="#" target="_blank"><img src="images/zerotheme.png" style="border: 0px;"/></a>
            <p>Free Html5 Templates created by <a href="#">Zerotheme</a>. 个人信息个人信息the template for both personal and commercial use. You must keep all copyright information and credit links in the template and associated files.</p>
          </div>
        </div>
        <div class="box">
          <div class="heading">
            <h2>热门标签</h2>
          </div>
          <div class="content">
            <ul>
              <li><a href="#">个人信息</a></li>
              <li><a href="#">所有文章</a></li>
              <li><a href="#">资讯资讯资讯</a></li>
              <li><a href="#">Web 架构Web 架</a></li>
              <li><a href="#">基础技术</a></li>
            </ul>
          </div>
        </div>
        <div class="box">
          <div class="heading">
            <h2>热门文章</h2>
          </div>
          <div class="content">
            <div class="post"> <img src="images/img4.jpg" width="50px"/>
              <h4><a href="#">Lorem ipsum dolor sit</a></h4>
              <p>November 11 ,2012</p>
            </div>
            <div class="post"> <img src="images/img5.jpg" width="50px"/>
              <h4><a href="#">Lorem ipsum dolor sit</a></h4>
              <p>November 11 ,2012</p>
            </div>
            <div class="post"> <img src="images/img1.jpg" width="50px"/>
              <h4><a href="#">Lorem ipsum dolor sit</a></h4>
              <p>November 11 ,2012</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
</section>
<!--------------Content end---------------> 

<!--------------Footer--------------->
<footer>
  <div class="wrap-footer">
    <div class="row">
      <div class="col-1-3">
        <div class="wrap-col">
          <div class="box">
            <div class="heading">
              <h2>Image Gallery</h2>
            </div>
            <div class="content gallery"> <a href="#"><img src="images/img2.jpg" width="120"/></a> <a href="#"><img src="images/img3.jpg" width="120"/></a> <a href="#"><img src="images/img4.jpg" width="120"/></a> <a href="#"><img src="images/img5.jpg" width="120"/></a> <a href="#"><img src="images/img3.jpg" width="120"/></a> </div>
          </div>
        </div>
      </div>
      <div class="col-1-3">
        <div class="wrap-col">
          <div class="box">
            <div class="heading">
              <h2>About Us</h2>
            </div>
            <div class="content"> <a href="#" target="_blank"><img src="images/zerotheme.png" style="border: 0px;"/></a>
              <p><a href="#" target="_blank">Free Html5 Templates</a> created by <a href="#">Zerotheme</a>. You can use and modify the template for both personal and commercial use. You must keep all copyright information and credit links in the template and associated files.</p>
            </div>
          </div>
        </div>
      </div>
      <div class="col-1-3">
        <div class="wrap-col">
          <div class="box">
            <div class="heading">
              <h2>Contact Us</h2>
            </div>
            <div class="content">
              <p>Praesent dapibus, neque id cursus faucibus, tortor neque egestas augue.</p>
              <p>Website : <a href="#" target="_blank">www.dglives.com</a></p>
              <p>+1 (123) 444-5677 <br/>
                +1 (123) 444-5678</p>
              <p>Address: 123 TemplateAccess Rd1</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="copyright">
    <p>Copyright © 2016 - Collect from <a href="#" title="网页模板" target="_blank">个人博客</a></p>
  </div>
</footer>
</div>
</body>

<!--分页插件-->
<script type="text/javascript" src="js/cypager.min.js" ></script>
<script><!--
		$(function(){
				$("#pagerArea").cypager({pg_size:10,pg_nav_count:8,pg_total_count:194,pg_call_fun:function(count){
					$("#console").html("正在加载第("+count+")页的数据，请稍后.......");
				}});
			});
	--></script>
</html>