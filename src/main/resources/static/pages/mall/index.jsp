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
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="format-detection" content="telephone=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<link href="${basePath}mall_resource/images/favicon.png"
	rel="shortcut icon">
<link href="favicon.png" rel="icon">
<meta name="author" content="Nghia Minh Luong">
<meta name="keywords" content="Default Description">
<meta name="description" content="Default keyword">
<title>一乎百医</title>
<!-- Fonts-->
<!-- <link
	href="https://fonts.googleapis.com/css?family=Archivo+Narrow:300,400,700%7CMontserrat:300,400,500,600,700,800,900"
	rel="stylesheet"> -->
<link rel="stylesheet"
	href="${basePath}mall_resource/plugins/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${basePath}mall_resource/plugins/ps-icon/style.css">
<!-- CSS Library-->
<link rel="stylesheet"
	href="${basePath}mall_resource/plugins/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${basePath}mall_resource/plugins/owl-carousel/assets/owl.carousel.css">
<link rel="stylesheet"
	href="${basePath}mall_resource/plugins/jquery-bar-rating/dist/themes/fontawesome-stars.css">
<link rel="stylesheet"
	href="${basePath}mall_resource/plugins/slick/slick/slick.css">
<link rel="stylesheet"
	href="${basePath}mall_resource/plugins/bootstrap-select/dist/css/bootstrap-select.min.css">
<link rel="stylesheet"
	href="${basePath}mall_resource/plugins/Magnific-Popup/dist/magnific-popup.css">
<link rel="stylesheet"
	href="${basePath}mall_resource/plugins/jquery-ui/jquery-ui.min.css">
<link rel="stylesheet"
	href="${basePath}mall_resource/plugins/revolution/css/settings.css">
<link rel="stylesheet"
	href="${basePath}mall_resource/plugins/revolution/css/layers.css">
<link rel="stylesheet"
	href="${basePath}mall_resource/plugins/revolution/css/navigation.css">
<!-- Custom-->
<link rel="stylesheet" href="${basePath}mall_resource/css/style.css">
<link rel="stylesheet" href="${basePath}mall_resource/css/index.css">
<link rel="stylesheet" href="${basePath}mall_resource/css/login.css">
<!--HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries-->
<!--WARNING: Respond.js doesn't work if you view the page via file://-->
<!--[if lt IE 9]><script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script><script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script><![endif]-->
</head>

<!--[if IE 7]><body class="ie7 lt-ie8 lt-ie9 lt-ie10"><![endif]-->
<!--[if IE 8]><body class="ie8 lt-ie9 lt-ie10"><![endif]-->
<!--[if IE 9]><body class="ie9 lt-ie10"><![endif]-->
<body class="ps-loading">
	<div class="header--sidebar"></div>
	<header class="header">
		<div class="header__top">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-6 col-md-8 col-sm-6 col-xs-12 ">
						<!-- <p>460 West 34th Street, 15th floor, New York - Hotline:
							804-377-3580 - 804-399-3580</p> -->
					</div>
					<div class="col-lg-6 col-md-4 col-sm-6 col-xs-12 ">
					
						<div class="header__actions">
						<% if(session.getAttribute("userIdx") != null && !session.getAttribute("userIdx").toString().equals("0")){%>
						<div class="btn-group ps-dropdown">
						<a class="dropdown-toggle"  data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="cursor:pointer" ><i class="fa fa-user-o fa-2x color_8161d1 mg_t10 mg_r10"></i>
											<%=session.getAttribute("userName")%></a>
											<ul class="dropdown-menu">
									<li id="sigin-out"><a style="cursor:pointer"  ><i class="fa fa-sign-out fa-2x color_8161d1"></i>
											退出</a></li>
								</ul>
								</div>
						<%}else{ %>
						<a style="cursor:pointer" data-toggle="modal" data-target="#loginModal"><i class="fa fa-sign-in fa-2x color_8161d1 mg_t10 mg_r10"></i>
											登陆</a>
						<%} %>			
							<%-- <div class="btn-group ps-dropdown">
								<a class="dropdown-toggle" href="#" data-toggle="dropdown"
									aria-haspopup="true" aria-expanded="false">个人中心<i
									class="fa fa-angle-down"></i></a>
								<ul class="dropdown-menu">
									<li><a href="${basePath}login"><img
											src="${basePath}mall_resource/images/flag/log-in.svg" alt="">
											登陆</a></li>
									<li><a href="#"><img
											src="${basePath}mall_resource/images/flag/register.svg"
											alt=""> 注册</a></li>
								</ul>
							</div> --%>
							
						</div>
						
					</div>
				</div>
			</div>
		</div>
		<nav class="navigation">
			<div class="container-fluid">
				<div class="navigation__column left">
					<div class="header__logo">
						<!-- 
							src="${basePath}mall_resource/images/logo.png" -->
						<a class="ps-logo" href="index.html"><img src="http://www.qiwang-sh.com/web/style/images/logo.jpg" alt=""></a>
					</div>
				</div>
				<div class="navigation__column center">
					<ul class="main-menu menu">
							<li class="current-menu-item">
								<a href="javascript:;">首页</a>
							</li>
							<li class="menu-item">
								<a href="${basePath}yhby-App.html">一乎百医APP</a>
							</li>
							<li class="menu-item">
								<a href="${basePath}doctorList.html">私人医生</a>
							</li>
							<li class="menu-item">
								<a href="${basePath}healthMall.html">健康商城</a>
							</li>
							<li class="menu-item ">
								<a href="${basePath}news.html">新闻动态</a>
							</li>
							<li class="menu-item">
								<a href="${basePath}contactUs.html">联系我们</a>
							</li>
						</ul>
				</div>
				
				<div class="navigation__column right">
					<div class="ps-search--header" >
						<input class="form-control" type="text"
							placeholder="搜索商品…">
						<button>
							<i class="ps-icon-search"></i>
						</button>
					</div>
					<div class="ps-cart">
						<% if(session.getAttribute("userIdx") != null && !session.getAttribute("userIdx").toString().equals("0")){%>
							<a class="ps-cart__toggle" href="${basePath}user-cart"><span><i id="count">0</i></span><i
								class="ps-icon-shopping-cart"></i></a>
						<%}else{ %>
						<a class="ps-cart__toggle" href="${basePath}user-cart"><i
								class="ps-icon-shopping-cart"></i></a>
						<%} %>
						</div>
					<div class="menu-toggle">
						<span></span>
					</div>
				</div>
			</div>
		</nav>
	</header>
	<div class="header-services">
		<div class="ps-services owl-slider" data-owl-auto="true"
			data-owl-loop="true" data-owl-speed="7000" data-owl-gap="0"
			data-owl-nav="true" data-owl-dots="false" data-owl-item="1"
			data-owl-item-xs="1" data-owl-item-sm="1" data-owl-item-md="1"
			data-owl-item-lg="1" data-owl-duration="1000" data-owl-mousedrag="on">
			<p class="ps-service">
				<i class="ps-icon-customer-service"></i><strong>客服热线</strong>: 400-809-3313
			</p>
			<p class="ps-service">
				<i class="ps-icon-customer-service"></i><strong>重要通知</strong>: 2016年-2017年度体检套餐截至2017年12月31日全部结束，请购买体检卡还未体检的人员在2017
			</p>
			<p class="ps-service">
				<i class="ps-icon-customer-service"></i><strong>重要通知</strong>: 年12月31日前预约体检。2018年我们即将推出2018年度体检套餐，敬请关注！
			</p>
		</div>
	</div>
	<main class="ps-main">
		<div class="ps-banner">
			<div class="rev_slider fullscreenbanner" id="home-banner">
				<ul>
					<li class="ps-banner" data-index="rs-2972" data-transition="random"
						data-slotamount="default" data-hideafterloop="0"
						data-hideslideonmobile="off" data-rotate="0"><img
						class="rev-slidebg"
						src="${basePath}mall_resource/images/yhby/1.jpg" alt=""
						data-bgposition="center center" data-bgfit="cover"
						data-bgrepeat="no-repeat" data-bgparallax="5" data-no-retina>
						<!-- <div class="tp-caption ps-banner__header" id="layer-1"
							data-x="left" data-hoffset="['-60','15','15','15']"
							data-y="['middle','middle','middle','middle']"
							data-voffset="['-150','-120','-150','-170']"
							data-width="['none','none','none','400']" data-type="text"
							data-responsive_offset="on"
							data-frames="[{&quot;delay&quot;:1000,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
							<p>
								March 2002 <br> Nike SB Dunk Low Pro
							</p>
						</div>
						<div class="tp-caption ps-banner__title" id="layer21"
							data-x="['left','left','left','left']"
							data-hoffset="['-60','15','15','15']"
							data-y="['middle','middle','middle','middle']"
							data-voffset="['-60','-40','-50','-70']" data-type="text"
							data-responsive_offset="on"
							data-textAlign="['center','center','center','center']"
							data-frames="[{&quot;delay&quot;:1200,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
							<p class="text-uppercase">SUBA</p>
						</div>
						<div class="tp-caption ps-banner__description" id="layer211"
							data-x="['left','left','left','left']"
							data-hoffset="['-60','15','15','15']"
							data-y="['middle','middle','middle','middle']"
							data-voffset="['30','50','50','50']" data-type="text"
							data-responsive_offset="on"
							data-textAlign="['center','center','center','center']"
							data-frames="[{&quot;delay&quot;:1200,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
							<p>
								Supa wanted something that was going to rep his East Coast <br>
								roots and, more specifically, his hometown of <br /> New York
								City in a big way.
							</p>
						</div>
						<a class="tp-caption ps-btn" id="layer31" href="#"
						data-x="['left','left','left','left']"
						data-hoffset="['-60','15','15','15']"
						data-y="['middle','middle','middle','middle']"
						data-voffset="['120','140','200','200']" data-type="text"
						data-responsive_offset="on"
						data-textAlign="['center','center','center','center']"
						data-frames="[{&quot;delay&quot;:1500,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">Purchase
							Now<i class="ps-icon-next"></i>
					</a> --></li>
					<li class="ps-banner ps-banner--white" data-index="rs-100"
						data-transition="random" data-slotamount="default"
						data-hideafterloop="0" data-hideslideonmobile="off"
						data-rotate="0"><img class="rev-slidebg"
						src="${basePath}mall_resource/images/yhby/4.jpg" alt=""
						data-bgposition="center center" data-bgfit="cover"
						data-bgrepeat="no-repeat" data-bgparallax="5" data-no-retina>
						<!-- <div class="tp-caption ps-banner__header" id="layer20"
							data-x="left" data-hoffset="['-60','15','15','15']"
							data-y="['middle','middle','middle','middle']"
							data-voffset="['-150','-120','-150','-170']"
							data-width="['none','none','none','400']" data-type="text"
							data-responsive_offset="on"
							data-frames="[{&quot;delay&quot;:1000,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
							<p>
								BEST ITEM <br> THIS SUMMER
							</p>
						</div>
						<div class="tp-caption ps-banner__title" id="layer339"
							data-x="['left','left','left','left']"
							data-hoffset="['-60','15','15','15']"
							data-y="['middle','middle','middle','middle']"
							data-voffset="['-60','-40','-50','-70']" data-type="text"
							data-responsive_offset="on"
							data-textAlign="['center','center','center','center']"
							data-frames="[{&quot;delay&quot;:1200,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
							<p class="text-uppercase">Recovery</p>
						</div>
						<div class="tp-caption ps-banner__description" id="layer2-14"
							data-x="['left','left','left','left']"
							data-hoffset="['-60','15','15','15']"
							data-y="['middle','middle','middle','middle']"
							data-voffset="['30','50','50','50']" data-type="text"
							data-responsive_offset="on"
							data-textAlign="['center','center','center','center']"
							data-frames="[{&quot;delay&quot;:1200,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
							<p>
								Supa wanted something that was going to rep his East Coast <br>
								roots and, more specifically, his hometown of <br /> New York
								City in a big way.
							</p>
						</div>
						<a class="tp-caption ps-btn" id="layer364" href="#"
						data-x="['left','left','left','left']"
						data-hoffset="['-60','15','15','15']"
						data-y="['middle','middle','middle','middle']"
						data-voffset="['120','140','200','200']" data-type="text"
						data-responsive_offset="on"
						data-textAlign="['center','center','center','center']"
						data-frames="[{&quot;delay&quot;:1500,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">Purchase
							Now<i class="ps-icon-next"></i>
					</a> --></li>
					<%-- <li class="ps-banner ps-banner--white" data-index="rs-100" data-transition="random"
						data-slotamount="default" data-hideafterloop="0"
						data-hideslideonmobile="off" data-rotate="0"><img
						class="rev-slidebg"
						src="${basePath}mall_resource/images/yhby/3.jpg" alt=""
						data-bgposition="center center" data-bgfit="cover"
						data-bgrepeat="no-repeat" data-bgparallax="5" data-no-retina>
						</li> --%>
				</ul>
			</div>
		</div>
		<div
			class="ps-section--features-product ps-section masonry-root pt-100 pb-100">
			<div class="ps-container">
				<div class="ps-section__header mb-50">
					<h3 class="ps-section__title" data-mask="features">- 热门商品</h3>
					<ul class="ps-masonry__filter">
						<!-- <li class="current"><a href="#" data-filter="*">All <sup>8</sup></a></li>
						<li><a href="#" data-filter=".nike">Nike <sup>1</sup></a></li>
						<li><a href="#" data-filter=".adidas">Adidas <sup>1</sup></a></li>
						<li><a href="#" data-filter=".men">Men <sup>1</sup></a></li>
						<li><a href="#" data-filter=".women">Women <sup>1</sup></a></li>
						<li><a href="#" data-filter=".kids">Kids <sup>4</sup></a></li> -->
					</ul>
				</div>
				<div class="ps-section__content pb-50">
					<div class="masonry-wrapper" data-col-md="4" data-col-sm="2"
						data-col-xs="1" data-gap="30" data-radio="100%">
						
						<div class="ps-masonry" id="hotproduct">
							
							
							
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="ps-section--offer">
			<div class="ps-column">
				<a class="ps-offer" href="${basePath}product-detail?id=304"><img 
					src="${basePath}mall_resource/images/banner/index_banner_1.jpg"
					alt=""></a>
			</div>
			<div class="ps-column">
				<a class="ps-offer" href="${basePath}product-detail?id=309"><img 
					src="${basePath}mall_resource/images/banner/index_banner_2.jpg"
					alt=""></a>
			</div>
		</div>
		
		<div class="ps-section ps-section--top-sales ps-owl-root pt-80 pb-80">
			<div class="ps-container">
				<div class="ps-section__header mb-50">
					<div class="row">
						<div class="col-lg-9 col-md-9 col-sm-12 col-xs-12 ">
							<h3 class="ps-section__title" data-mask="BEST SALE">- 主推商品</h3>
						</div>
						<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12 ">
							<div class="ps-owl-actions">
								<a class="ps-prev" href="#"><i class="ps-icon-arrow-right"></i></a><a
									class="ps-next" href="#"><i class="ps-icon-arrow-left"></i></a>
							</div>
						</div>
					</div>
				</div>
				<div class="ps-section__content">
					<div class="ps-owl--colection owl-slider" data-owl-auto="true"
						data-owl-loop="true" data-owl-speed="5000" data-owl-gap="30"
						data-owl-nav="false" data-owl-dots="false" data-owl-item="4"
						data-owl-item-xs="1" data-owl-item-sm="2" data-owl-item-md="3"
						data-owl-item-lg="4" data-owl-duration="1000"
						data-owl-mousedrag="on" id="zhuproduct">
						
						
					</div>
				</div>
			</div>
		</div>
		<div class="ps-features pt-80 pb-80 bg--cover" data-background="${basePath}mall_resource/images/background/index_background_01.jpg">
        <div class="ps-container">
          <div class="row">
                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 ">
                  <div class="ps-iconbox ps-iconbox--inverse">
                    <div class="ps-iconbox__header"><i class="ps-icon-delivery"></i>
                      <h3>免费送货</h3>
                      <p>全部免除运费.</p>
                    </div>
                    <div class="ps-iconbox__content">
                      <p>想要跟踪一个包?从您的订单中找到跟踪信息和订单细节。</p>
                    </div>
                  </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 ">
                  <div class="ps-iconbox ps-iconbox--inverse">
                    <div class="ps-iconbox__header"><i class="ps-icon-money"></i>
                      <h3>100% 退换.</h3>
                      <p>收货后30天内.</p>
                    </div>
                    <div class="ps-iconbox__content">
                      <p>你可以在30天内退回大部分未开封的商品，以获得全额退款。</p>
                    </div>
                  </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 ">
                  <div class="ps-iconbox ps-iconbox--inverse">
                    <div class="ps-iconbox__header"><i class="ps-icon-customer-service"></i>
                      <h3>支持 24/7.</h3>
                      <p>全程在线服务.</p>
                    </div>
                    <div class="ps-iconbox__content">
                      <p>我们提供24/7客户热线，所以如果你有问题，你永远不会孤单.</p>
                    </div>
                  </div>
                </div>
          </div>
        </div>
      </div>
		<div class="ps-section ps-home-blog pt-80 pb-80">
			<div class="ps-container">
				<div class="ps-section__header mb-50">
					<h2 class="ps-section__title" data-mask="News">- 我们的故事</h2>
					<div class="ps-section__action">
						<a class="ps-morelink text-uppercase" href="${basePath}news.html">我们的故事<i
							class="fa fa-long-arrow-right"></i></a>
					</div>
				</div>
				<div class="ps-section__content">
					<div class="row">
						<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12 ">
							<div class="ps-post">
								<div class="ps-post__thumbnail">
									<a class="ps-post__overlay" href="news-detail.html?d=1"></a><img
										src="${basePath}mall_resource/images/yhby/new_1.png" alt="">
								</div>
								<div class="ps-post__content">
									<a class="ps-post__title" href="news-detail.html?d=1">“一乎之间，百医相伴”上海站举行</a>
									<p class="ps-post__meta">
										<!-- <span>By:<a class="mr-5" href="blog.html">Alena
												Studio</a></span> -<span class="ml-5">Jun 10, 2017</span> -->
												<span>时间：2016-05-15</span>
									</p>
									<p>2016年5月14日，“一乎之间，百医相伴——泰然全国医疗专家问诊活动”上海站在上海斯格威铂尔曼大酒店举行，本站邀请到的两位医生分别是上海中医药大学附属曙光医院中医科主任医师余安胜，以及上海...</p>
									<a class="ps-morelink" href="news-detail.html?d=1">详情<i
										class="fa fa-long-arrow-right"></i></a>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12 ">
							<div class="ps-post">
								<div class="ps-post__thumbnail">
									<a class="ps-post__overlay" href="news-detail.html?d=2"></a><img
										src="${basePath}mall_resource/images/yhby/new_2.png" alt="">
								</div>
								<div class="ps-post__content">
									<a class="ps-post__title" href="news-detail.html?d=2">全国医疗专家问诊活动在杭州站拉开序幕</a>
									<p class="ps-post__meta">
										<span>时间：2016-04-19</span>
									</p>
									<p>2016年4月16日，“一乎百医”和“泰然金融”合作的首场线下活动率先在杭州友谊社区举行，虽然没有隆重的启动仪式，但对于活动的专业性定位丝毫没有怠慢，本次活动邀请了浙江省人民医院心血管内科主任医…</p>
									<a class="ps-morelink" href="news-detail.html?d=2">详情<i
										class="fa fa-long-arrow-right"></i></a>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12 ">
							<div class="ps-post">
								<div class="ps-post__thumbnail">
									<a class="ps-post__overlay" href="news-detail.html?d=3"></a><img
										src="${basePath}mall_resource/images/yhby/new_3.png" alt="">
								</div>
								<div class="ps-post__content">
									<a class="ps-post__title" href="news-detail.html?d=3">上海启旺健康管理有限公司获得A轮融资</a>
									<p class="ps-post__meta">
										<span>时间：2016-02-01</span>
									</p>
									<p>上海启旺健康管理有限公司（简称：启旺）旗下APP“一乎百医”2015年4月一经上线便得到多方投资人的关注，2016年2月获得泰然金融集团3000万A轮投资，这是启旺一个新的起点。‍‍‍泰然金融集团（简称：泰然金融）是…</p>
									<a class="ps-morelink" href="news-detail.html?d=3">详情<i
										class="fa fa-long-arrow-right"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="ps-home-contact">
			<div id="contact-map" data-address="New York, NY"
				data-title="BAKERY LOCATION!" data-zoom="17"></div>
			<div class="ps-home-contact__form">
				<header>
					<h3>联系我们</h3>
					<p>了解我们的公司概况，公司文化，
可持续发展的动力,和更多.</p>
				</header>
				<footer>
					
						<div class="form-group">
							<label>姓名<span>*</span></label> <input class="form-control"
								type="text" id="name">
						</div>
						<div class="form-group">
							<label>手机号<span>*</span></label> <input class="form-control"
								type="text" id="phone">
						</div>
						<div class="form-group">
							<label>您的留言<span>*</span></label>
							<textarea class="form-control" rows="4" id="message"></textarea>
						</div>
						<div class="form-group text-center">
							<button class="ps-btn" id="send_message">
								发送<i class="fa fa-angle-right"></i>
							</button>
						</div>
					
				</footer>
			</div>
		</div>
		<div class="ps-subscribe">
			<div class="ps-container">
				
			</div>
		</div>
		
		<div class="ps-footer bg--cover"
			data-background="${basePath}mall_resource/images/background/index_background_01.jpg">
			<div class="ps-footer__copyright">
				<div class="ps-container">
					<div class="row">
						<div class="col-xs-12 ">
							<p>
								&copy; 联系电话：400-809-3313 地址：徐汇区斜土路768号5楼D座（致远大厦）
							</p>
						</div>
						
					</div>
					<div class="row">
						<div class="col-xs-12 ">
							<p>
								&copy; 版权所有 ©上海启旺健康管理有限公司 2014-2016 Corporation. All Rights
									Reserved.
							</p>
						</div>
						
					</div>
				</div>
			</div>
		</div>
	</main>
	<div id="loginModal" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
     <div class="container">
    <div class="row">
        <div class="col-md-offset-2 col-md-8">
            <div class="form-horizontal">
                <span class="heading">用户登录</span>
                <div class="form-group">
                    <input class="form-control" id="phoNum" placeholder="手机号" value="15316028637">
                    <i class="fa fa-user"></i>
                </div>
                <div class="form-group help">
                    <input  class="form-control" id="code" placeholder="验证码" value="4545">
                    <i class="fa fa-lock"></i>
                    <button class="fa-btn-code" id="yzm">获取验证码</button>
                     <!-- 
                    <a href="#" class="fa fa-question-circle"></a> -->
                </div>
                <div class="form-group2 mg_t20">
                    <button  class="sub" id="login">登录</button>
                    <button  class="cancel" id="cancel">取消</button>
                </div>
            </div>
        </div>
    </div>
</div>
    </div>
  </div>
</div>
	<!-- JS Library-->
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/jquery/dist/jquery.min.js"></script>
	<script type="text/javascript">
var basePath = '${basePath}';
$.ajax({
	dataType : "json",
	url : basePath + "getProductListBytype",
	type : "post",
	data : {
		"type" : 2
	},
	error : function(data) {
		layer.msg("加载商品信息失败", {
			time : 1000
		});
	},
	success : function(data) {
		$("#zhuproduct").children().remove();
		$.each(data.res, function(i, item) {
			  $("#zhuproduct").append(
						"<div class=\"ps-shoes--carousel\">"+
						"<div class=\"ps-shoe\">"+
						"<div class=\"ps-shoe__thumbnail\">"+
						"<a class=\"ps-shoe__favorite\" ><i class=\"ps-icon-heart\"></i></a>"+
						"<div class=\"box\">"+
						"<div>"+
							"<img   src=\"https://app.qiwang-sh.com"+item.icon+"\"\">"+
						"</div>"+
					"</div>"+
						"<a class=\"ps-shoe__overlay\" href=\"${basePath}product-detail?id="+item.idx+"\"></a>"+
					"</div>"+
					"<div class=\"ps-shoe__content\">"+
						"<div class=\"ps-shoe__variants\">"+
						"</div>"+
						"<div class=\"ps-shoe__detail\">"+
							"<a class=\"ps-shoe__name\">￥"+item.price+"</a>"+
							"<p class=\"ps-shoe__categories\">"+
								"<a>"+item.productName+"</a>"+
							"</p>"+
						"</div>"+
					"</div>"+
						"</div>"+
					"</div>"
			);  
		});
	}
});
</script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/bootstrap/dist/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/jquery-bar-rating/dist/jquery.barrating.min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/owl-carousel/owl.carousel.min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/gmap3.min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/imagesloaded.pkgd.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/isotope.pkgd.min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/bootstrap-select/dist/js/bootstrap-select.min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/jquery.matchHeight-min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/slick/slick/slick.min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/elevatezoom/jquery.elevatezoom.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/Magnific-Popup/dist/jquery.magnific-popup.min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/jquery-ui/jquery-ui.min.js"></script>
	<script type="text/javascript"
		src="http://ditu.google.cn/maps/api/js?key=AIzaSyAx39JFH5nhxze1ZydH-Kl8xXM3OK4fvcg&amp;region=GB"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/revolution/js/jquery.themepunch.tools.min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/revolution/js/jquery.themepunch.revolution.min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/revolution/js/extensions/revolution.extension.video.min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/revolution/js/extensions/revolution.extension.slideanims.min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/revolution/js/extensions/revolution.extension.layeranimation.min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/revolution/js/extensions/revolution.extension.navigation.min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/revolution/js/extensions/revolution.extension.parallax.min.js"></script>
	<script type="text/javascript"
		src="${basePath}mall_resource/plugins/revolution/js/extensions/revolution.extension.actions.min.js"></script>
	<!-- Custom scripts-->
	<script type="text/javascript"
		src="${basePath}mall_resource/js/main.js"></script>
	<script type="text/javascript" src="${basePath}layer/layer.js"></script>
	<script type="text/javascript">
	var basePath = '${basePath}';
	</script>
	<script type="text/javascript" src="${basePath}mall_resource/js/login.js"></script>
	<script type="text/javascript">
	
	$.ajax({
		dataType : "json",
		url : basePath + "getProductListBytype",
		type : "post",
		data : {
			"type" : 1
		},
		error : function(data) {
			layer.msg("加载商品信息失败", {
				time : 1000
			});
		},
		success : function(data) {
			$("#hotproduct").children().remove();
			$.each(data.res, function(i, item) {
				  $("#hotproduct").append(
						"<div class=\"grid-item\">"+
							"<div class=\"grid-item__content-wrapper\">"+
								"<div class=\"ps-shoe mb-30\">"+
								"<div class=\"ps-shoe__thumbnail\">"+
									"<a class=\"ps-shoe__favorite\" ><i class=\"ps-icon-heart\"></i></a>"+
									"<div class=\"box\">"+
									"<div>"+
										"<img   src=\"https://app.qiwang-sh.com"+item.icon+"\"\">"+
									"</div>"+
								"</div>"+
									"<a class=\"ps-shoe__overlay\" href=\"${basePath}product-detail?id="+item.idx+"\"></a>"+
								"</div>"+
								"<div class=\"ps-shoe__content\">"+
									"<div class=\"ps-shoe__variants\">"+
									"</div>"+
									"<div class=\"ps-shoe__detail\">"+
										"<a class=\"ps-shoe__name\">￥"+item.price+"</a>"+
										"<p class=\"ps-shoe__categories\">"+
											"<a>"+item.productName+"</a>"+
										"</p>"+
									"</div>"+
								"</div>"+
							"</div>"+
						"</div>"+
					"</div>"
				
				);  
			});
		}
	});
	
	$("#loginModal").modal('hide');
	$("#send_message").click(function(){
		var name=$("#name").val();
		var phone=$("#phone").val();
		var message=$("#message").val();
		if(name == ''){
			layer.msg("请填写您的姓名", {
				time : 1000
			});
			return;
		}
		if(phone == ''){
			layer.msg("请填写您的联系方式", {
				time : 1000
			});
			return;
		}
		if(message == ''){
			layer.msg("请填写您的留言", {
				time : 1000
			});
			return;
		}
		layer.msg("发送成功，稍后会有工作人员与您联系！", {
			time : 1000
		});
		$("#name").val("");
		$("#phone").val("");
		$("#message").val("");
	});
	</script>
</body>
</html>