<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>blog header</title>
</head>
<body>
<header>
    <div class="wrap-header">
        <div id="logo">
            <a href="#"><h1>疯狂的程序员</h1></a>
            <p>一个看似正经的程序员博客网站</p>
        </div>
        <nav>
            <div class="wrap-nav">
                <div class="menu">
                    <ul>
                        <li><a href="/">首页</a></li>
                        <li><a href="/?articleType=1">资讯</a></li>
                        <li><a href="?articleType=2">Web</a></li>
                        <li><a href="?articleType=3">架构</a></li>
                        <li><a href="?articleType=4">基础技术</a></li>
                        <li><a href="?articleType=5">书籍</a></li>
                    </ul>
                    <div id="search">
                        <div class="button-search"></div>
                        <input title="search" type="text" value="Search..." onFocus="if (this.value == &#39;Search...&#39;) {this.value = &#39;&#39;;}" onBlur="if (this.value == &#39;&#39;) {this.value = &#39;Search...&#39;;}">
                    </div>
                </div>
            </div>
        </nav>
    </div>
</header>
</body>
</html>
