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
<html>
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
<title>一乎百医 - 健康商城</title>
<!-- Fonts-->
<!-- Fonts-->

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
<link rel="stylesheet" href="${basePath}mall_resource/css/health-mall.css">
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
						</div>
					</div>
				</div>
			</div>
			<nav class="navigation">
				<div class="container-fluid">
					<div class="navigation__column left">
						<div class="header__logo">
							<!-- 
							src="${basePath}mall_resource/${basePath}mall_resource/images/logo.png" -->
							<a class="ps-logo" href="index.html"><img
								src="http://www.qiwang-sh.com/web/style/images/logo.jpg" alt=""></a>
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
							<input class="form-control" type="text" placeholder="搜索商品…">
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
				<i class="ps-icon-customer-service"></i><strong>客服热线</strong>:
				400-809-3313
			</p>
			<p class="ps-service">
				<i class="ps-icon-customer-service"></i><strong>重要通知</strong>:
				2016年-2017年度体检套餐截至2017年12月31日全部结束，请购买体检卡还未体检的人员在2017
			</p>
			<p class="ps-service">
				<i class="ps-icon-customer-service"></i><strong>重要通知</strong>:
				年12月31日前预约体检。2018年我们即将推出2018年度体检套餐，敬请关注！
			</p>
		</div>
	</div>
	<main class="ps-main">
		<div class="ps-products-wrap pt-80 pb-80">
			<div class="ps-products" data-mh="product-listing">

				<div class="ps-product-action">
					<div class="ps-product__filter">
						<select class="ps-select selectpicker">
							<option value="1">综合排序</option>
							<option value="2">销量排序</option>
							<option value="3">价格 (低->高)</option>
							<option value="3">价格 (高->低)</option>
						</select>
						<!-- <H2>私人医生</H2> -->
					</div>
				</div>
				<div class="ps-product__columns" id="productlist">
					<c:forEach items="${v_productSubjectList}" var="v_productSubject"
						varStatus="status">
						<div class="ps-product__column">
							<div class="ps-shoe mb-30">
								<div class="ps-shoe__thumbnail">
									<a class="ps-shoe__favorite" href="#"><i
										class="ps-icon-heart"></i></a>
									<div class="box">
										<div>
											<img src="https://app.qiwang-sh.com${v_productSubject.icon}"
												alt="">
										</div>
									</div>
									<a class="ps-shoe__overlay" href="${basePath}product-detail?id=${v_productSubject.idx}"></a>
								</div>
								<div class="ps-shoe__content">
									<div class="ps-shoe__detail">
										<a class="ps-shoe__name" href="#"> ￥
											${v_productSubject.price}</a>
										<p class="ps-shoe__categories">
											<a href="#">${v_productSubject.productName}</a>
										</p>
										<!-- <span class="ps-shoe__price"></span> -->
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>



				<div class="ps-product-action">
					<div class="ps-product__filter">
						<!-- <select class="ps-select selectpicker">
                <option value="1">Shortby</option>
                <option value="2">Name</option>
                <option value="3">Price (Low to High)</option>
                <option value="3">Price (High to Low)</option>
              </select> -->
					</div>
					<div class="ps-pagination">
						<!--  <ul class="pagination">
                <li><a href="#"><i class="fa fa-angle-left"></i></a></li>
                <li class="active"><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">...</a></li>
                <li><a href="#"><i class="fa fa-angle-right"></i></a></li>
              </ul> -->
					</div>
				</div>
			</div>
			<div class="ps-sidebar" data-mh="product-listing">
				<aside class="ps-widget--sidebar ps-widget--category">
					<div class="ps-widget__header">
						<h3>分类</h3>
					</div>
					<div class="ps-widget__content">
						<ul class="ps-list--checked" id="type">
							<c:forEach items="${confProductSubjectList}"
								var="confProductSubject" varStatus="status">
								<c:choose>
									<c:when test="${status.index == 0 }">
										<li class="current" data-index="${confProductSubject.idx}"><a
											style="cursor:pointer">${confProductSubject.productSubjectName}</a></li>
									</c:when>
									<c:otherwise>
										<li data-index="${confProductSubject.idx}"><a
											style="cursor:pointer">${confProductSubject.productSubjectName}</a></li>
									</c:otherwise>
								</c:choose>
							</c:forEach>
						</ul>
					</div>
				</aside>
				<aside class="ps-widget--sidebar ps-widget--filter">
					<div class="ps-widget__header">
						<h3>价格</h3>
					</div>
					<div class="ps-widget__content">
						<div class="ac-slider" data-default-min="300"
							data-default-max="2000" data-max="3450" data-step="50"
							data-unit="￥"></div>
						<p class="ac-slider__meta">
							价格:<span class="ac-slider__value ac-slider__min"></span>-<span
								class="ac-slider__value ac-slider__max"></span>
						</p>
						<a class="ac-slider__filter ps-btn" href="#">筛选</a>
					</div>
				</aside>
				<aside class="ps-widget--sidebar ps-widget--category">
					<div class="ps-widget__header">
						<h3>品牌</h3>
					</div>
					<div class="ps-widget__content">
						<ul class="ps-list--checked">
							<li class="current"><a href="product-listing.html">Nike(521)</a></li>
							<li><a href="product-listing.html">Adidas(76)</a></li>
							<li><a href="product-listing.html">Baseball(69)</a></li>
							<li><a href="product-listing.html">Gucci(36)</a></li>
							<li><a href="product-listing.html">Dior(108)</a></li>
							<li><a href="product-listing.html">B&G(108)</a></li>
							<li><a href="product-listing.html">Louis Vuiton(47)</a></li>
						</ul>
					</div>
				</aside>
				<aside class="ps-widget--sidebar ps-widget--category">
					<div class="ps-widget__header">
						<h3>尺寸</h3>
					</div>
					<div class="ps-widget__content">
						<ul class="ps-list--checked">
							<li class="current"><a href="product-listing.html">Narrow</a></li>
							<li><a href="product-listing.html">Regular</a></li>
							<li><a href="product-listing.html">Wide</a></li>
							<li><a href="product-listing.html">Extra Wide</a></li>
						</ul>
					</div>
				</aside>
				<div class="ps-sticky desktop">
					<aside class="ps-widget--sidebar">
						<div class="ps-widget__header">
							<h3>大小</h3>
						</div>
						<div class="ps-widget__content">
							<table class="table ps-table--size">
								<tbody>
									<tr>
										<td class="active">3</td>
										<td>5.5</td>
										<td>8</td>
										<td>10.5</td>
										<td>13</td>
									</tr>
									<tr>
										<td>3.5</td>
										<td>6</td>
										<td>8.5</td>
										<td>11</td>
										<td>13.5</td>
									</tr>
									<tr>
										<td>4</td>
										<td>6.5</td>
										<td>9</td>
										<td>11.5</td>
										<td>14</td>
									</tr>
									<tr>
										<td>4.5</td>
										<td>7</td>
										<td>9.5</td>
										<td>12</td>
										<td>14.5</td>
									</tr>
									<tr>
										<td>5</td>
										<td>7.5</td>
										<td>10</td>
										<td>12.5</td>
										<td>15</td>
									</tr>
								</tbody>
							</table>
						</div>
					</aside>
					<aside class="ps-widget--sidebar">
						<div class="ps-widget__header">
							<h3>颜色</h3>
						</div>
						<div class="ps-widget__content">
							<ul class="ps-list--color">
								<li><a href="#"></a></li>
								<li><a href="#"></a></li>
								<li><a href="#"></a></li>
								<li><a href="#"></a></li>
								<li><a href="#"></a></li>
								<li><a href="#"></a></li>
								<li><a href="#"></a></li>
								<li><a href="#"></a></li>
								<li><a href="#"></a></li>
								<li><a href="#"></a></li>
								<li><a href="#"></a></li>
								<li><a href="#"></a></li>
								<li><a href="#"></a></li>
							</ul>
						</div>
					</aside>
				</div>

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
									<input class="form-control" id="phoNum" placeholder="手机号"
										value="15316028637">
									<i class="fa fa-user"></i>
								</div>
								<div class="form-group help">
									<input class="form-control" id="code" placeholder="验证码"
										value="4545">
									<i class="fa fa-lock"></i>
									<button class="fa-btn-code" id="yzm">获取验证码</button>
									<!-- 
                    <a href="#" class="fa fa-question-circle"></a> -->
								</div>
								<div class="form-group2 mg_t20">
									<button class="sub" id="login">登录</button>
									<button class="cancel" id="cancel">取消</button>
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
		src="plugins/revolution/js/jquery.themepunch.tools.min.js"></script>
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
	<script type="text/javascript" src="${basePath}mall_resource/js/login.js"></script>
	<script type="text/javascript">
var basePath = '${basePath}';
var requestPath = '${basePath}' + "admin/";

	$("ul#type").on("click", "li", function() {

		$("ul#type").each(function() {
			var y = $(this).children();
				y.removeClass("current");
		});
		$(this).addClass("current");
		var index = $(this).data('index');
		
		$(".ps-product__column").remove();
		$.ajax({
			dataType : "json",
			url : basePath + "getProductbySubject",
			type : "post",
			data : {
				"subjectIdx": index
			},
			error : function(data) {
				alert("加载商品信息失败");
			},
			success : function(data) {
				/*width=\"243。48px\" height=\"216.19px\"  */
				 $.each(data.v_productSubjectList, function(i, item) {
						$("#productlist").append(
								"<div class=\"ps-product__column\">"+
								"<div class=\"ps-shoe mb-30\">"+
									"<div class=\"ps-shoe__thumbnail\">"+
										"<a class=\"ps-shoe__favorite\" href=\"#\"><i class=\"ps-icon-heart\"></i></a> "+
										"<div class=\"box\">"+
											"<div>"+
												"<img   src=\"https://app.qiwang-sh.com"+item.icon+"\"\">"+
											"</div>"+
										"</div>"+
										"<a class=\"ps-shoe__overlay\" href=\"${basePath}product-detail?id="+item.idx+"\"></a>"+
									"</div>"+
									"<div class=\"ps-shoe__content\">"+
										"<div class=\"ps-shoe__detail\">"+
											"<a class=\"ps-shoe__name\"> ￥"+item.price+"</a>"+
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
	});
</script>
</body>
</body>
</html>