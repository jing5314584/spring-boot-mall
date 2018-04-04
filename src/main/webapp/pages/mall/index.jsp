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
<link
	href="https://fonts.googleapis.com/css?family=Archivo+Narrow:300,400,700%7CMontserrat:300,400,500,600,700,800,900"
	rel="stylesheet">
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
							<li class="menu-item">
								<a href="index.html">首页</a>
							</li>
							<li class="menu-item">
								<a href="#">一乎百医APP</a>
							</li>
							<li class="menu-item">
								<a href="#">私人医生</a>
							</li>
							<li class="menu-item">
								<a href="${basePath}healthMall">健康商城</a>
							</li>
							<li class="menu-item ">
								<a href="#">新闻动态</a>
							</li>
							<li class="menu-item">
								<a href="#">联系我们</a>
							</li>
						</ul>
				</div>
				
				<div class="navigation__column right">
					<form class="ps-search--header" action="do_action" method="post">
						<input class="form-control" type="text"
							placeholder="搜索商品…">
						<button>
							<i class="ps-icon-search"></i>
						</button>
					</form>
					<div class="ps-cart">
						<a class="ps-cart__toggle" href="#"><span><i>20</i></span><i
							class="ps-icon-shopping-cart"></i></a>
						<div class="ps-cart__listing">
							<div class="ps-cart__content">
								<div class="ps-cart-item">
									<a class="ps-cart-item__close" href="#"></a>
									<div class="ps-cart-item__thumbnail">
										<a href="product-detail.html"></a><img
											src="${basePath}mall_resource/images/cart-preview/1.jpg"
											alt="">
									</div>
									<div class="ps-cart-item__content">
										<a class="ps-cart-item__title" href="product-detail.html">Amazin’
											Glazin’</a>
										<p>
											<span>Quantity:<i>12</i></span><span>Total:<i>£176</i></span>
										</p>
									</div>
								</div>
								<div class="ps-cart-item">
									<a class="ps-cart-item__close" href="#"></a>
									<div class="ps-cart-item__thumbnail">
										<a href="product-detail.html"></a><img
											src="${basePath}mall_resource/images/cart-preview/2.jpg"
											alt="">
									</div>
									<div class="ps-cart-item__content">
										<a class="ps-cart-item__title" href="product-detail.html">The
											Crusty Croissant</a>
										<p>
											<span>Quantity:<i>12</i></span><span>Total:<i>£176</i></span>
										</p>
									</div>
								</div>
								<div class="ps-cart-item">
									<a class="ps-cart-item__close" href="#"></a>
									<div class="ps-cart-item__thumbnail">
										<a href="product-detail.html"></a><img
											src="${basePath}mall_resource/images/cart-preview/3.jpg"
											alt="">
									</div>
									<div class="ps-cart-item__content">
										<a class="ps-cart-item__title" href="product-detail.html">The
											Rolling Pin</a>
										<p>
											<span>Quantity:<i>12</i></span><span>Total:<i>£176</i></span>
										</p>
									</div>
								</div>
							</div>
							<div class="ps-cart__total">
								<p>
									Number of items:<span>36</span>
								</p>
								<p>
									Item Total:<span>£528.00</span>
								</p>
							</div>
							<div class="ps-cart__footer">
								<a class="ps-btn" href="cart.html">Check out<i
									class="ps-icon-arrow-left"></i></a>
							</div>
						</div>
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
						<li class="current"><a href="#" data-filter="*">All <sup>8</sup></a></li>
						<li><a href="#" data-filter=".nike">Nike <sup>1</sup></a></li>
						<li><a href="#" data-filter=".adidas">Adidas <sup>1</sup></a></li>
						<li><a href="#" data-filter=".men">Men <sup>1</sup></a></li>
						<li><a href="#" data-filter=".women">Women <sup>1</sup></a></li>
						<li><a href="#" data-filter=".kids">Kids <sup>4</sup></a></li>
					</ul>
				</div>
				<div class="ps-section__content pb-50">
					<div class="masonry-wrapper" data-col-md="4" data-col-sm="2"
						data-col-xs="1" data-gap="30" data-radio="100%">
						<div class="ps-masonry">
							<div class="grid-sizer"></div>
							<div class="grid-item kids">
								<div class="grid-item__content-wrapper">
									<div class="ps-shoe mb-30">
										<div class="ps-shoe__thumbnail">
											<div class="ps-badge">
												<span>New</span>
											</div>
											<div class="ps-badge ps-badge--sale ps-badge--2nd">
												<span>-35%</span>
											</div>
											<a class="ps-shoe__favorite" href="#"><i
												class="ps-icon-heart"></i></a><img
												src="${basePath}mall_resource/images/shoe/1.jpg" alt=""><a
												class="ps-shoe__overlay" href="product-detail.html"></a>
										</div>
										<div class="ps-shoe__content">
											<div class="ps-shoe__variants">
												<div class="ps-shoe__variant normal">
													<img src="${basePath}mall_resource/images/shoe/2.jpg"
														alt=""><img
														src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/5.jpg" alt="">
												</div>
												<select class="ps-rating ps-shoe__rating">
													<option value="1">1</option>
													<option value="1">2</option>
													<option value="1">3</option>
													<option value="1">4</option>
													<option value="2">5</option>
												</select>
											</div>
											<div class="ps-shoe__detail">
												<a class="ps-shoe__name" href="#">Air Jordan 7 Retro</a>
												<p class="ps-shoe__categories">
													<a href="#">Men shoes</a>,<a href="#"> Nike</a>,<a href="#">
														Jordan</a>
												</p>
												<span class="ps-shoe__price"> <del>£220</del> £ 120
												</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="grid-item nike">
								<div class="grid-item__content-wrapper">
									<div class="ps-shoe mb-30">
										<div class="ps-shoe__thumbnail">
											<a class="ps-shoe__favorite" href="#"><i
												class="ps-icon-heart"></i></a><img
												src="${basePath}mall_resource/images/shoe/2.jpg" alt=""><a
												class="ps-shoe__overlay" href="product-detail.html"></a>
										</div>
										<div class="ps-shoe__content">
											<div class="ps-shoe__variants">
												<div class="ps-shoe__variant normal">
													<img src="${basePath}mall_resource/images/shoe/2.jpg"
														alt=""><img
														src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/5.jpg" alt="">
												</div>
												<select class="ps-rating ps-shoe__rating">
													<option value="1">1</option>
													<option value="1">2</option>
													<option value="1">3</option>
													<option value="1">4</option>
													<option value="2">5</option>
												</select>
											</div>
											<div class="ps-shoe__detail">
												<a class="ps-shoe__name" href="#">Air Jordan 7 Retro</a>
												<p class="ps-shoe__categories">
													<a href="#">Men shoes</a>,<a href="#"> Nike</a>,<a href="#">
														Jordan</a>
												</p>
												<span class="ps-shoe__price"> £ 120</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="grid-item adidas">
								<div class="grid-item__content-wrapper">
									<div class="ps-shoe mb-30">
										<div class="ps-shoe__thumbnail">
											<a class="ps-shoe__favorite" href="#"><i
												class="ps-icon-heart"></i></a><img
												src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><a
												class="ps-shoe__overlay" href="product-detail.html"></a>
										</div>
										<div class="ps-shoe__content">
											<div class="ps-shoe__variants">
												<div class="ps-shoe__variant normal">
													<img src="${basePath}mall_resource/images/shoe/2.jpg"
														alt=""><img
														src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/5.jpg" alt="">
												</div>
												<select class="ps-rating ps-shoe__rating">
													<option value="1">1</option>
													<option value="1">2</option>
													<option value="1">3</option>
													<option value="2">4</option>
													<option value="2">5</option>
												</select>
											</div>
											<div class="ps-shoe__detail">
												<a class="ps-shoe__name" href="#">Air Jordan 7 Retro</a>
												<p class="ps-shoe__categories">
													<a href="#">Men shoes</a>,<a href="#"> Nike</a>,<a href="#">
														Jordan</a>
												</p>
												<span class="ps-shoe__price"> £ 120</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="grid-item kids">
								<div class="grid-item__content-wrapper">
									<div class="ps-shoe mb-30">
										<div class="ps-shoe__thumbnail">
											<div class="ps-badge ps-badge--sale">
												<span>-35%</span>
											</div>
											<a class="ps-shoe__favorite" href="#"><i
												class="ps-icon-heart"></i></a><img
												src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><a
												class="ps-shoe__overlay" href="product-detail.html"></a>
										</div>
										<div class="ps-shoe__content">
											<div class="ps-shoe__variants">
												<div class="ps-shoe__variant normal">
													<img src="${basePath}mall_resource/images/shoe/2.jpg"
														alt=""><img
														src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/5.jpg" alt="">
												</div>
												<select class="ps-rating ps-shoe__rating">
													<option value="1">1</option>
													<option value="1">2</option>
													<option value="1">3</option>
													<option value="1">4</option>
													<option value="2">5</option>
												</select>
											</div>
											<div class="ps-shoe__detail">
												<a class="ps-shoe__name" href="#">Air Jordan 7 Retro</a>
												<p class="ps-shoe__categories">
													<a href="#">Men shoes</a>,<a href="#"> Nike</a>,<a href="#">
														Jordan</a>
												</p>
												<span class="ps-shoe__price"> <del>£220</del> £ 120
												</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="grid-item men">
								<div class="grid-item__content-wrapper">
									<div class="ps-shoe mb-30">
										<div class="ps-shoe__thumbnail">
											<a class="ps-shoe__favorite" href="#"><i
												class="ps-icon-heart"></i></a><img
												src="${basePath}mall_resource/images/shoe/5.jpg" alt=""><a
												class="ps-shoe__overlay" href="product-detail.html"></a>
										</div>
										<div class="ps-shoe__content">
											<div class="ps-shoe__variants">
												<div class="ps-shoe__variant normal">
													<img src="${basePath}mall_resource/images/shoe/2.jpg"
														alt=""><img
														src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/5.jpg" alt="">
												</div>
												<select class="ps-rating ps-shoe__rating">
													<option value="1">1</option>
													<option value="1">2</option>
													<option value="1">3</option>
													<option value="1">4</option>
													<option value="2">5</option>
												</select>
											</div>
											<div class="ps-shoe__detail">
												<a class="ps-shoe__name" href="#">Air Jordan 7 Retro</a>
												<p class="ps-shoe__categories">
													<a href="#">Men shoes</a>,<a href="#"> Nike</a>,<a href="#">
														Jordan</a>
												</p>
												<span class="ps-shoe__price"> £ 120</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="grid-item women">
								<div class="grid-item__content-wrapper">
									<div class="ps-shoe mb-30">
										<div class="ps-shoe__thumbnail">
											<a class="ps-shoe__favorite" href="#"><i
												class="ps-icon-heart"></i></a><img
												src="${basePath}mall_resource/images/shoe/6.jpg" alt=""><a
												class="ps-shoe__overlay" href="product-detail.html"></a>
										</div>
										<div class="ps-shoe__content">
											<div class="ps-shoe__variants">
												<div class="ps-shoe__variant normal">
													<img src="${basePath}mall_resource/images/shoe/2.jpg"
														alt=""><img
														src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/5.jpg" alt="">
												</div>
												<select class="ps-rating ps-shoe__rating">
													<option value="1">1</option>
													<option value="1">2</option>
													<option value="1">3</option>
													<option value="1">4</option>
													<option value="2">5</option>
												</select>
											</div>
											<div class="ps-shoe__detail">
												<a class="ps-shoe__name" href="#">Air Jordan 7 Retro</a>
												<p class="ps-shoe__categories">
													<a href="#">Men shoes</a>,<a href="#"> Nike</a>,<a href="#">
														Jordan</a>
												</p>
												<span class="ps-shoe__price"> £ 120</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="grid-item kids">
								<div class="grid-item__content-wrapper">
									<div class="ps-shoe mb-30">
										<div class="ps-shoe__thumbnail">
											<a class="ps-shoe__favorite" href="#"><i
												class="ps-icon-heart"></i></a><img
												src="${basePath}mall_resource/images/shoe/7.jpg" alt=""><a
												class="ps-shoe__overlay" href="product-detail.html"></a>
										</div>
										<div class="ps-shoe__content">
											<div class="ps-shoe__variants">
												<div class="ps-shoe__variant normal">
													<img src="${basePath}mall_resource/images/shoe/2.jpg"
														alt=""><img
														src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/5.jpg" alt="">
												</div>
												<select class="ps-rating ps-shoe__rating">
													<option value="1">1</option>
													<option value="1">2</option>
													<option value="1">3</option>
													<option value="1">4</option>
													<option value="2">5</option>
												</select>
											</div>
											<div class="ps-shoe__detail">
												<a class="ps-shoe__name" href="#">Air Jordan 7 Retro</a>
												<p class="ps-shoe__categories">
													<a href="#">Men shoes</a>,<a href="#"> Nike</a>,<a href="#">
														Jordan</a>
												</p>
												<span class="ps-shoe__price"> £ 120</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="grid-item kids">
								<div class="grid-item__content-wrapper">
									<div class="ps-shoe mb-30">
										<div class="ps-shoe__thumbnail">
											<a class="ps-shoe__favorite" href="#"><i
												class="ps-icon-heart"></i></a><img
												src="${basePath}mall_resource/images/shoe/8.jpg" alt=""><a
												class="ps-shoe__overlay" href="product-detail.html"></a>
										</div>
										<div class="ps-shoe__content">
											<div class="ps-shoe__variants">
												<div class="ps-shoe__variant normal">
													<img src="${basePath}mall_resource/images/shoe/2.jpg"
														alt=""><img
														src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><img
														src="${basePath}mall_resource/images/shoe/5.jpg" alt="">
												</div>
												<select class="ps-rating ps-shoe__rating">
													<option value="1">1</option>
													<option value="1">2</option>
													<option value="1">3</option>
													<option value="1">4</option>
													<option value="2">5</option>
												</select>
											</div>
											<div class="ps-shoe__detail">
												<a class="ps-shoe__name" href="#">Air Jordan 7 Retro</a>
												<p class="ps-shoe__categories">
													<a href="#">Men shoes</a>,<a href="#"> Nike</a>,<a href="#">
														Jordan</a>
												</p>
												<span class="ps-shoe__price"> £ 120</span>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="ps-section--offer">
			<div class="ps-column">
				<a class="ps-offer" href="product-listing.html"><img
					src="${basePath}mall_resource/images/banner/home-banner-1.png"
					alt=""></a>
			</div>
			<div class="ps-column">
				<a class="ps-offer" href="product-listing.html"><img
					src="${basePath}mall_resource/images/banner/home-banner-2.png"
					alt=""></a>
			</div>
		</div>
		<div class="ps-section--sale-off ps-section pt-80 pb-40">
			<div class="ps-container">
				<div class="ps-section__header mb-50">
					<h3 class="ps-section__title" data-mask="Sale off">- Hot Deal
						Today</h3>
				</div>
				<div class="ps-section__content">
					<div class="row">
						<div class="col-lg-6 col-md-12 col-sm-12 col-xs-12 ">
							<div class="ps-hot-deal">
								<h3>Nike DUNK Max 95 OG</h3>
								<p class="ps-hot-deal__price">
									Only: <span>£155</span>
								</p>
								<ul class="ps-countdown" data-time="December 13, 2017 15:37:25">
									<li><span class="hours"></span>
									<p>Hours</p></li>
									<li class="divider">:</li>
									<li><span class="minutes"></span>
									<p>minutes</p></li>
									<li class="divider">:</li>
									<li><span class="seconds"></span>
									<p>Seconds</p></li>
								</ul>
								<a class="ps-btn" href="#">Order Today<i
									class="ps-icon-next"></i></a>
							</div>
						</div>
						<div class="col-lg-6 col-md-12 col-sm-12 col-xs-12 ">
							<div class="ps-hotspot">
								<a class="point first active" href="javascript:;"><i
									class="fa fa-plus"></i>
									<div class="ps-hotspot__content">
										<p class="heading">JUMP TO HEADER</p>
										<p>Dynamic Fit Collar en la zona del tobillo que une la
											parte inferior de la pierna y el pie sin reducir la libertad
											de movimiento.</p>
									</div></a><a class="point second" href="javascript:;"><i
									class="fa fa-plus"></i>
									<div class="ps-hotspot__content">
										<p class="heading">JUMP TO HEADER</p>
										<p>Dynamic Fit Collar en la zona del tobillo que une la
											parte inferior de la pierna y el pie sin reducir la libertad
											de movimiento.</p>
									</div></a><a class="point third" href="javascript:;"><i
									class="fa fa-plus"></i>
									<div class="ps-hotspot__content">
										<p class="heading">JUMP TO HEADER</p>
										<p>Dynamic Fit Collar en la zona del tobillo que une la
											parte inferior de la pierna y el pie sin reducir la libertad
											de movimiento.</p>
									</div></a><img src="${basePath}mall_resource/images/hot-deal.png" alt="">
							</div>
						</div>
					</div>
				</div>
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
						data-owl-mousedrag="on">
						<div class="ps-shoes--carousel">
							<div class="ps-shoe">
								<div class="ps-shoe__thumbnail">
									<div class="ps-badge">
										<span>New</span>
									</div>
									<a class="ps-shoe__favorite" href="#"><i
										class="ps-icon-heart"></i></a><img
										src="${basePath}mall_resource/images/shoe/1.jpg" alt=""><a
										class="ps-shoe__overlay" href="product-detail.html"></a>
								</div>
								<div class="ps-shoe__content">
									<div class="ps-shoe__variants">
										<div class="ps-shoe__variant normal">
											<img src="${basePath}mall_resource/images/shoe/2.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/5.jpg" alt="">
										</div>
										<select class="ps-rating ps-shoe__rating">
											<option value="1">1</option>
											<option value="1">2</option>
											<option value="1">3</option>
											<option value="1">4</option>
											<option value="2">5</option>
										</select>
									</div>
									<div class="ps-shoe__detail">
										<a class="ps-shoe__name" href="product-detai.html">Air
											Jordan 7 Retro</a>
										<p class="ps-shoe__categories">
											<a href="#">Men shoes</a>,<a href="#"> Nike</a>,<a href="#">
												Jordan</a>
										</p>
										<span class="ps-shoe__price"> £ 120</span>
									</div>
								</div>
							</div>
						</div>
						<div class="ps-shoes--carousel">
							<div class="ps-shoe">
								<div class="ps-shoe__thumbnail">
									<div class="ps-badge">
										<span>New</span>
									</div>
									<div class="ps-badge ps-badge--sale ps-badge--2nd">
										<span>-35%</span>
									</div>
									<a class="ps-shoe__favorite" href="#"><i
										class="ps-icon-heart"></i></a><img
										src="${basePath}mall_resource/images/shoe/2.jpg" alt=""><a
										class="ps-shoe__overlay" href="product-detail.html"></a>
								</div>
								<div class="ps-shoe__content">
									<div class="ps-shoe__variants">
										<div class="ps-shoe__variant normal">
											<img src="${basePath}mall_resource/images/shoe/2.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/5.jpg" alt="">
										</div>
										<select class="ps-rating ps-shoe__rating">
											<option value="1">1</option>
											<option value="1">2</option>
											<option value="1">3</option>
											<option value="1">4</option>
											<option value="2">5</option>
										</select>
									</div>
									<div class="ps-shoe__detail">
										<a class="ps-shoe__name" href="product-detai.html">Air
											Jordan 7 Retro</a>
										<p class="ps-shoe__categories">
											<a href="#">Men shoes</a>,<a href="#"> Nike</a>,<a href="#">
												Jordan</a>
										</p>
										<span class="ps-shoe__price"> <del>£220</del> £ 120
										</span>
									</div>
								</div>
							</div>
						</div>
						<div class="ps-shoes--carousel">
							<div class="ps-shoe">
								<div class="ps-shoe__thumbnail">
									<div class="ps-badge">
										<span>New</span>
									</div>
									<a class="ps-shoe__favorite" href="#"><i
										class="ps-icon-heart"></i></a><img
										src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><a
										class="ps-shoe__overlay" href="product-detail.html"></a>
								</div>
								<div class="ps-shoe__content">
									<div class="ps-shoe__variants">
										<div class="ps-shoe__variant normal">
											<img src="${basePath}mall_resource/images/shoe/2.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/5.jpg" alt="">
										</div>
										<select class="ps-rating ps-shoe__rating">
											<option value="1">1</option>
											<option value="1">2</option>
											<option value="1">3</option>
											<option value="1">4</option>
											<option value="2">5</option>
										</select>
									</div>
									<div class="ps-shoe__detail">
										<a class="ps-shoe__name" href="product-detai.html">Air
											Jordan 7 Retro</a>
										<p class="ps-shoe__categories">
											<a href="#">Men shoes</a>,<a href="#"> Nike</a>,<a href="#">
												Jordan</a>
										</p>
										<span class="ps-shoe__price"> £ 120</span>
									</div>
								</div>
							</div>
						</div>
						<div class="ps-shoes--carousel">
							<div class="ps-shoe">
								<div class="ps-shoe__thumbnail">
									<a class="ps-shoe__favorite" href="#"><i
										class="ps-icon-heart"></i></a><img
										src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><a
										class="ps-shoe__overlay" href="product-detail.html"></a>
								</div>
								<div class="ps-shoe__content">
									<div class="ps-shoe__variants">
										<div class="ps-shoe__variant normal">
											<img src="${basePath}mall_resource/images/shoe/2.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/5.jpg" alt="">
										</div>
										<select class="ps-rating ps-shoe__rating">
											<option value="1">1</option>
											<option value="1">2</option>
											<option value="1">3</option>
											<option value="1">4</option>
											<option value="2">5</option>
										</select>
									</div>
									<div class="ps-shoe__detail">
										<a class="ps-shoe__name" href="product-detai.html">Air
											Jordan 7 Retro</a>
										<p class="ps-shoe__categories">
											<a href="#">Men shoes</a>,<a href="#"> Nike</a>,<a href="#">
												Jordan</a>
										</p>
										<span class="ps-shoe__price"> £ 120</span>
									</div>
								</div>
							</div>
						</div>
						<div class="ps-shoes--carousel">
							<div class="ps-shoe">
								<div class="ps-shoe__thumbnail">
									<div class="ps-badge">
										<span>New</span>
									</div>
									<a class="ps-shoe__favorite" href="#"><i
										class="ps-icon-heart"></i></a><img
										src="${basePath}mall_resource/images/shoe/5.jpg" alt=""><a
										class="ps-shoe__overlay" href="product-detail.html"></a>
								</div>
								<div class="ps-shoe__content">
									<div class="ps-shoe__variants">
										<div class="ps-shoe__variant normal">
											<img src="${basePath}mall_resource/images/shoe/2.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/5.jpg" alt="">
										</div>
										<select class="ps-rating ps-shoe__rating">
											<option value="1">1</option>
											<option value="1">2</option>
											<option value="1">3</option>
											<option value="1">4</option>
											<option value="2">5</option>
										</select>
									</div>
									<div class="ps-shoe__detail">
										<a class="ps-shoe__name" href="product-detai.html">Air
											Jordan 7 Retro</a>
										<p class="ps-shoe__categories">
											<a href="#">Men shoes</a>,<a href="#"> Nike</a>,<a href="#">
												Jordan</a>
										</p>
										<span class="ps-shoe__price"> £ 120</span>
									</div>
								</div>
							</div>
						</div>
						<div class="ps-shoes--carousel">
							<div class="ps-shoe">
								<div class="ps-shoe__thumbnail">
									<a class="ps-shoe__favorite" href="#"><i
										class="ps-icon-heart"></i></a><img
										src="${basePath}mall_resource/images/shoe/6.jpg" alt=""><a
										class="ps-shoe__overlay" href="product-detail.html"></a>
								</div>
								<div class="ps-shoe__content">
									<div class="ps-shoe__variants">
										<div class="ps-shoe__variant normal">
											<img src="${basePath}mall_resource/images/shoe/2.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/3.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/4.jpg" alt=""><img
												src="${basePath}mall_resource/images/shoe/5.jpg" alt="">
										</div>
										<select class="ps-rating ps-shoe__rating">
											<option value="1">1</option>
											<option value="1">2</option>
											<option value="1">3</option>
											<option value="1">4</option>
											<option value="2">5</option>
										</select>
									</div>
									<div class="ps-shoe__detail">
										<a class="ps-shoe__name" href="product-detai.html">Air
											Jordan 7 Retro</a>
										<p class="ps-shoe__categories">
											<a href="#">Men shoes</a>,<a href="#"> Nike</a>,<a href="#">
												Jordan</a>
										</p>
										<span class="ps-shoe__price"> £ 120</span>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="ps-features pt-80 pb-80 bg--cover" data-background="${basePath}mall_resource/images/background/parallax.jpg">
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
						<a class="ps-morelink text-uppercase" href="#">View all post<i
							class="fa fa-long-arrow-right"></i></a>
					</div>
				</div>
				<div class="ps-section__content">
					<div class="row">
						<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12 ">
							<div class="ps-post">
								<div class="ps-post__thumbnail">
									<a class="ps-post__overlay" href="blog-detail.html"></a><img
										src="${basePath}mall_resource/images/blog/1.jpg" alt="">
								</div>
								<div class="ps-post__content">
									<a class="ps-post__title" href="blog-detail.html">“一乎之间，百医相伴”上海站举行</a>
									<p class="ps-post__meta">
										<!-- <span>By:<a class="mr-5" href="blog.html">Alena
												Studio</a></span> -<span class="ml-5">Jun 10, 2017</span> -->
												<span>时间：2016-05-15</span>
									</p>
									<p>016年5月14日，“一乎之间，百医相伴——泰然全国医疗专家问诊活动”上海站在上海斯格威铂尔曼大酒店举行，本站邀请到的两位医生分别是上海中医药大学附属曙光医院中医科主任医师余安胜，以及上海...</p>
									<a class="ps-morelink" href="blog-detail.html">详情<i
										class="fa fa-long-arrow-right"></i></a>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12 ">
							<div class="ps-post">
								<div class="ps-post__thumbnail">
									<a class="ps-post__overlay" href="blog-detail.html"></a><img
										src="${basePath}mall_resource/images/blog/2.jpg" alt="">
								</div>
								<div class="ps-post__content">
									<a class="ps-post__title" href="blog-detail.html">全国医疗专家问诊活动在杭州站拉开序幕</a>
									<p class="ps-post__meta">
										<span>时间：2016-04-19</span>
									</p>
									<p>016年4月16日，“一乎百医”和“泰然金融”合作的首场线下活动率先在杭州友谊社区举行，虽然没有隆重的启动仪式，但对于活动的专业性定位丝毫没有怠慢，本次活动邀请了浙江省人民医院心血管内科主任医…</p>
									<a class="ps-morelink" href="blog-detail.html">详情<i
										class="fa fa-long-arrow-right"></i></a>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12 ">
							<div class="ps-post">
								<div class="ps-post__thumbnail">
									<a class="ps-post__overlay" href="blog-detail.html"></a><img
										src="${basePath}mall_resource/images/blog/3.jpg" alt="">
								</div>
								<div class="ps-post__content">
									<a class="ps-post__title" href="blog-detail.html">上海启旺健康管理有限公司获得A轮融资</a>
									<p class="ps-post__meta">
										<span>时间：2016-02-01</span>
									</p>
									<p>上海启旺健康管理有限公司（简称：启旺）旗下APP“一乎百医”2015年4月一经上线便得到多方投资人的关注，2016年2月获得泰然金融集团3000万A轮投资，这是启旺一个新的起点。‍‍‍泰然金融集团（简称：泰然金融）是…</p>
									<a class="ps-morelink" href="blog-detail.html">详情<i
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
					<form action="product-listing.html" method="post">
						<div class="form-group">
							<label>姓名<span>*</span></label> <input class="form-control"
								type="text">
						</div>
						<div class="form-group">
							<label>邮箱<span>*</span></label> <input class="form-control"
								type="email">
						</div>
						<div class="form-group">
							<label>您的留言<span>*</span></label>
							<textarea class="form-control" rows="4"></textarea>
						</div>
						<div class="form-group text-center">
							<button class="ps-btn">
								发送<i class="fa fa-angle-right"></i>
							</button>
						</div>
					</form>
				</footer>
			</div>
		</div>
		<div class="ps-subscribe">
			<div class="ps-container">
				<div class="row">
					<div class="col-lg-3 col-md-12 col-sm-12 col-xs-12 ">
						<h3>
							<i class="fa fa-envelope"></i>Sign up to Newsletter
						</h3>
					</div>
					<div class="col-lg-5 col-md-7 col-sm-12 col-xs-12 ">
						<form class="ps-subscribe__form" action="do_action" method="post">
							<input class="form-control" type="text" placeholder="">
							<button>Sign up now</button>
						</form>
					</div>
					<div class="col-lg-4 col-md-5 col-sm-12 col-xs-12 ">
						<p>
							...and receive <span>$20</span> coupon for first shopping.
						</p>
					</div>
				</div>
			</div>
		</div>
		<div class="ps-footer bg--cover"
			data-background="${basePath}mall_resource/images/background/parallax.jpg">
			<div class="ps-footer__content">
				<div class="ps-container">
					<div class="row">
						<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12 ">
							<aside class="ps-widget--footer ps-widget--info">
								<header>
									<a class="ps-logo" href="index.html"><img
										src="${basePath}mall_resource/images/logo-white.png" alt=""></a>
									<h3 class="ps-widget__title">Address Office 1</h3>
								</header>
								<footer>
									<p>
										<strong>460 West 34th Street, 15th floor, New York</strong>
									</p>
									<p>
										Email: <a href='mailto:support@store.com'>support@store.com</a>
									</p>
									<p>Phone: +323 32434 5334</p>
									<p>Fax: ++323 32434 5333</p>
								</footer>
							</aside>
						</div>
						<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12 ">
							<aside class="ps-widget--footer ps-widget--info second">
								<header>
									<h3 class="ps-widget__title">Address Office 2</h3>
								</header>
								<footer>
									<p>
										<strong>PO Box 16122 Collins Victoria 3000 Australia</strong>
									</p>
									<p>
										Email: <a href='mailto:support@store.com'>support@store.com</a>
									</p>
									<p>Phone: +323 32434 5334</p>
									<p>Fax: ++323 32434 5333</p>
								</footer>
							</aside>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-4 col-xs-12 ">
							<aside class="ps-widget--footer ps-widget--link">
								<header>
									<h3 class="ps-widget__title">Find Our store</h3>
								</header>
								<footer>
									<ul class="ps-list--link">
										<li><a href="#">Coupon Code</a></li>
										<li><a href="#">SignUp For Email</a></li>
										<li><a href="#">Site Feedback</a></li>
										<li><a href="#">Careers</a></li>
									</ul>
								</footer>
							</aside>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-4 col-xs-12 ">
							<aside class="ps-widget--footer ps-widget--link">
								<header>
									<h3 class="ps-widget__title">Get Help</h3>
								</header>
								<footer>
									<ul class="ps-list--line">
										<li><a href="#">Order Status</a></li>
										<li><a href="#">Shipping and Delivery</a></li>
										<li><a href="#">Returns</a></li>
										<li><a href="#">Payment Options</a></li>
										<li><a href="#">Contact Us</a></li>
									</ul>
								</footer>
							</aside>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-4 col-xs-12 ">
							<aside class="ps-widget--footer ps-widget--link">
								<header>
									<h3 class="ps-widget__title">Products</h3>
								</header>
								<footer>
									<ul class="ps-list--line">
										<li><a href="#">Shoes</a></li>
										<li><a href="#">Clothing</a></li>
										<li><a href="#">Accessries</a></li>
										<li><a href="#">Football Boots</a></li>
									</ul>
								</footer>
							</aside>
						</div>
					</div>
				</div>
			</div>
			<div class="ps-footer__copyright">
				<div class="ps-container">
					<div class="row">
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 ">
							<p>
								&copy; <a href="#">NOUTHEMES</a>, Inc. All rights Resevered.
								Design by <a href="#"> Alena Studio</a>
							</p>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 ">
							<ul class="ps-social">
								<li><a href="#"><i class="fa fa-facebook"></i></a></li>
								<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
								<li><a href="#"><i class="fa fa-twitter"></i></a></li>
								<li><a href="#"><i class="fa fa-instagram"></i></a></li>
							</ul>
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
</body>
</html>