<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	request.setAttribute("basePath", basePath);
%>
<!DOCTYPE html>
<html data-dpr="1" style="font-size: 54px;">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="dns-prefetch" href="http://s.geilicdn.com/">
<link rel="dns-prefetch" href="http://wd.geilicdn.com/">
<link rel="dns-prefetch" href="http://item.weidian.com/">
<link rel="dns-prefetch" href="http://wd.api.weidian.com/">
<meta name="viewport"
	content="width=device-width,initial-scale=1,maximum-scale=1,minimum-scale=1,user-scalable=no">
<meta content="telephone=no" name="format-detection">
<meta name="apple-touch-fullscreen" content="yes">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<title>商城首页</title>
<link rel="shortcut icon" href="${basePath}assets/img/favicon.png"
	type="image/x-icon">
<link href="${basePath}appweb/css/index.min1.css" type="text/css"
	rel="stylesheet">

<!--Basic Scripts-->
<script src="${basePath}appweb/js/jquery-2.0.3.min.js"></script>
<script src="${basePath}appweb/js/bootstrap.min.js"></script>
<%-- <script src="${basePath}js/upMore/jquery.mobile.min.js"></script>
<link href="${basePath}css/jquery.mobile.1.3.2.min.css" rel="stylesheet"> --%>
<script src="${basePath}appweb/js/util.js"></script>

<link href="${basePath}appweb/css/font-awesome.min.css" rel="stylesheet" />
<link href="${basePath}appweb/css/healthMallIndex.css" type="text/css" rel="stylesheet">
<link href="${basePath}appweb/css/ringNav.css" type="text/css" rel="stylesheet">
<link rel="stylesheet" href="${basePath}appweb/css/dropload.css">

<link rel="stylesheet" href="${basePath}appweb/css/styless.css" />

<link rel="stylesheet" href="${basePath}appweb/amazeui/css/amazeui.min.css"/>
	<style>
    .get {
      background: #1E5B94;
      color: #fff;
      text-align: center;
      padding: 100px 0;
    }

    .get-title {
      font-size: 200%;
      border: 2px solid #fff;
      padding: 20px;
      display: inline-block;
    }

    .get-btn {
      background: #fff;
    }

    .detail {
      background: #fff;
    }

    .detail-h2 {
      text-align: center;
      font-size: 150%;
      margin: 40px 0;
    }

    .detail-h3 {
      color: #1f8dd6;
    }

    .detail-p {
      color: #7f8c8d;
    }

    .detail-mb {
      margin-bottom: 30px;
    }

    .hope {
      background: #0bb59b;
      padding: 50px 0;
    }

    .hope-img {
      text-align: center;
    }

    .hope-hr {
      border-color: #149C88;
    }

    .hope-title {
      font-size: 140%;
    }

    .about {
      background: #fff;
      padding: 40px 0;
      color: #7f8c8d;
    }

    .about-color {
      color: #34495e;
    }

    .about-title {
      font-size: 180%;
      padding: 30px 0 50px 0;
      text-align: center;
    }

    .footer p {
      color: #7f8c8d;
      margin: 0;
      padding: 15px 0;
      text-align: center;
      background: #2d3e50;
    }
  </style>
</head>
<body class="ignore_weixin_login" style="font-size: 12px;" >		
		<div id="loading" ><%-- <img src="${basePath}image/shopping/loadHref.gif"> --%></div>
		<div id="main_plane">
			<header class="am-topbar am-topbar-fixed-top">
  <div class="am-container">
    <h1 class="am-topbar-brand">
      <a href="#">Amaze UI</a>
    </h1>

    <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-secondary am-show-sm-only"
            data-am-collapse="{target: '#collapse-head'}"><span class="am-sr-only">导航切换</span> <span
        class="am-icon-bars"></span></button>

    <div class="am-collapse am-topbar-collapse" id="collapse-head">
      <ul class="am-nav am-nav-pills am-topbar-nav">
        <li class="am-active"><a href="#">首页</a></li>
        <li><a href="#">项目</a></li>
        <li class="am-dropdown" data-am-dropdown>
          <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
            下拉菜单 <span class="am-icon-caret-down"></span>
          </a>
          <ul class="am-dropdown-content">
            <li class="am-dropdown-header">标题</li>
            <li><a href="#">1. 默认样式</a></li>
            <li><a href="#">2. 基础设置</a></li>
            <li><a href="#">3. 文字排版</a></li>
            <li><a href="#">4. 网格系统</a></li>
          </ul>
        </li>
      </ul>

      <div class="am-topbar-right">
        <button class="am-btn am-btn-secondary am-topbar-btn am-btn-sm"><span class="am-icon-pencil"></span> 注册</button>
      </div>

      <div class="am-topbar-right">
        <button class="am-btn am-btn-primary am-topbar-btn am-btn-sm"><span class="am-icon-user"></span> 登录</button>
      </div>
    </div>
  </div>
</header>
			
		<div id="showList">
						 
		</div>
		<div id="baoxian" class="bb_10" style="width:100%;background:#fff;">
			<div class="title">
				<div class="l"></div>
				<p>医疗保险</p>
				<div class="r"></div>
			</div>
			<a>
				<img src="${basePath}image/shopping/baoxian.png"  style="width:100%;">
			</a>
		</div>
						
		<div id="wrapperIndex" class="wrapper">
			<div id="scrollerIndex" class="scroller">
				<div class="title">
					<div class="l"></div>
					<p>全部产品<p>
					<div class="r"></div>
				</div>
				<ul id="newFist"></ul>	
				<ul id="newList">
					<div class="lists"></div>	
				</ul>
								
			</div>
		</div>			
		</div>

	<!-- 下标 -->
	 <footer class="index_nav" id="footerBtn">
		<ul class="wd_nav">
		<li class="classify for_gaq">
				
			</li>
		<li class="contact for_gaq">
				<a class="index base_color"
					style="display:block;"> <span class="icon" style="padding-bottom:4px;"> 
						<img src="${basePath}appweb/image/home-icon-index-on.png">
					</span>首页
				</a>
			</li>

			<li class="dynamic for_gaq">
				<a class="sCar" href="${basePath}static/healthmall/shoppingCart.jsp"
					style="display:block"> <span class="icon" style="padding-bottom:4px"> 
						<img src="${basePath}appweb/image/home-icon-gouwuche.png">
					</span> 购物车
				</a>
			</li>
			
			<li class="store for_gaq">
				<a class="dingdan" href="${basePath}static/healthmall/userOrder.jsp"
					style="display:block"> <span class="icon" style="padding-bottom:4px"> 
						<img src="${basePath}appweb/image/home-icon-gerenzhongxin.png">
					</span>我的东福
				</a>
			</li>
			<li class="classify for_gaq">
				
			</li>
		</ul>
	</footer> 
	<%-- <div class="ringNav">
		<div class="menu_s">
	        <div class="menu">
	            <img src="${basePath}image/shopping/ringNav1.png">
	        </div>
	        <div class="item addressL">
	            <img src="${basePath}image/shopping/ringNav3.png">
	        </div>
	        <div class="item" id="service">
	            <img src="${basePath}image/shopping/ringNav6.png">
	        </div>
	        <div class="item sCar">
	            <img src="${basePath}image/shopping/ringNav5.png">
	        </div>
	        <div class="item classfiy">
	            <img src="${basePath}image/shopping/ringNav4.png">
	        </div>
    	</div>
	</div> --%>
	

	<script src="${basePath}appweb/js/dropload.min.js"></script>
	<script src="${basePath}appweb/js/autoRem.js"></script>
	<script src="${basePath}appweb/js/ringNavForH.js"></script>
	<script src="${basePath}appweb/amazeui/js/amazeui.min.js"></script>
	<script type="text/javascript">
	var basePath = '${basePath}';
	var requestPath = '${basePath}' + "admin/";
	
		
		/* 搜索 */
		$(".head_nav").click(function(){
			window.location.href="${basePath}static/healthmall/search.jsp";
		});
		
	
	
</script>
</body>
</html>