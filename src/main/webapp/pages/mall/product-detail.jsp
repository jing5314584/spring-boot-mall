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
<link href="${basePath}mall_resource/apple-touch-icon.png"
	rel="apple-touch-icon">
<link href="favicon.png" rel="icon">
<meta name="author" content="Nghia Minh Luong">
<meta name="keywords" content="Default Description">
<meta name="description" content="Default keyword">
<title>Shoe - Homepage</title>
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
							<a href="${basePath}register"><img
								src="${basePath}mall_resource/images/flag/register.svg"
								width="25px" height="25px" alt=""> 注册</a>
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
							<li class="menu-item"><a
								href="index.html">首页</a></li>
							<li class="menu-item menu-item-has-children has-mega-menu"><a
								href="#">一乎百医APP</a>
								<div class="mega-menu">
									<div class="mega-wrap">
										<div class="mega-column">
											<ul class="mega-item mega-features">
												<li><a href="product-listing.html">NEW RELEASES</a></li>
												<li><a href="product-listing.html">FEATURES SHOES</a></li>
												<li><a href="product-listing.html">BEST SELLERS</a></li>
												<li><a href="product-listing.html">NOW TRENDING</a></li>
												<li><a href="product-listing.html">SUMMER
														ESSENTIALS</a></li>
												<li><a href="product-listing.html">MOTHER'S DAY
														COLLECTION</a></li>
												<li><a href="product-listing.html">FAN GEAR</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">Shoes</h4>
											<ul class="mega-item">
												<li><a href="product-listing.html">All Shoes</a></li>
												<li><a href="product-listing.html">Running</a></li>
												<li><a href="product-listing.html">Training & Gym</a></li>
												<li><a href="product-listing.html">Basketball</a></li>
												<li><a href="product-listing.html">Football</a></li>
												<li><a href="product-listing.html">Soccer</a></li>
												<li><a href="product-listing.html">Baseball</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">CLOTHING</h4>
											<ul class="mega-item">
												<li><a href="product-listing.html">Compression &
														Nike Pro</a></li>
												<li><a href="product-listing.html">Tops & T-Shirts</a></li>
												<li><a href="product-listing.html">Polos</a></li>
												<li><a href="product-listing.html">Hoodies &
														Sweatshirts</a></li>
												<li><a href="product-listing.html">Jackets & Vests</a></li>
												<li><a href="product-listing.html">Pants & Tights</a></li>
												<li><a href="product-listing.html">Shorts</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">Accessories</h4>
											<ul class="mega-item">
												<li><a href="product-listing.html">Compression &
														Nike Pro</a></li>
												<li><a href="product-listing.html">Tops & T-Shirts</a></li>
												<li><a href="product-listing.html">Polos</a></li>
												<li><a href="product-listing.html">Hoodies &
														Sweatshirts</a></li>
												<li><a href="product-listing.html">Jackets & Vests</a></li>
												<li><a href="product-listing.html">Pants & Tights</a></li>
												<li><a href="product-listing.html">Shorts</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">BRAND</h4>
											<ul class="mega-item">
												<li><a href="product-listing.html">NIKE</a></li>
												<li><a href="product-listing.html">Adidas</a></li>
												<li><a href="product-listing.html">Dior</a></li>
												<li><a href="product-listing.html">B&G</a></li>
											</ul>
										</div>
									</div>
								</div></li>
							<li class="menu-item"><a href="#">私人医生</a></li>
							<li class="menu-item"><a href="${basePath}healthMall">健康商城</a></li>
							<li class="menu-item menu-item-has-children dropdown"><a
								href="#">新闻动态</a>
								<ul class="sub-menu">
									<li class="menu-item menu-item-has-children dropdown"><a
										href="blog-grid.html">Blog-grid</a>
										<ul class="sub-menu">
											<li class="menu-item"><a href="blog-grid.html">Blog
													Grid 1</a></li>
											<li class="menu-item"><a href="blog-grid-2.html">Blog
													Grid 2</a></li>
										</ul></li>
									<li class="menu-item"><a href="blog-list.html">Blog
											List</a></li>
								</ul></li>
							<li class="menu-item menu-item-has-children dropdown"><a
								href="#">联系我们</a>
								<ul class="sub-menu">
									<li class="menu-item"><a href="contact-us.html">Contact
											Us #1</a></li>
									<li class="menu-item"><a href="contact-us.html">Contact
											Us #2</a></li>
								</ul></li>
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
							<a class="ps-cart__toggle" href="${basePath}user-cart"><span><i>20</i></span><i
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
									<a class="ps-btn" href="${basePath}user-cart">Check out<i
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
		
		<div class="test">
        <div class="container">
          <div class="row">
                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4 ">
                </div>
          </div>
        </div>
      </div>
		<div class="ps-product--detail pt-60">
        <div class="ps-container">
          <div class="row">
            <div class="col-lg-10 col-md-12 col-lg-offset-1">
              <div class="ps-product__thumbnail">
                <div class="ps-product__preview">
                  <div class="ps-product__variants">
                  	<c:forEach items="${baseInfoList}" var="confImageText">
							<div class="item">
								<img src="https://app.qiwang-sh.com${confImageText}" />
							</div>
						</c:forEach>
                    <!-- <div class="item"><img src="images/shoe-detail/1.jpg" alt=""></div>
                    <div class="item"><img src="images/shoe-detail/2.jpg" alt=""></div>
                    <div class="item"><img src="images/shoe-detail/3.jpg" alt=""></div>
                    <div class="item"><img src="images/shoe-detail/3.jpg" alt=""></div>
                    <div class="item"><img src="images/shoe-detail/3.jpg" alt=""></div> -->
                  </div>
                </div>
                <div class="ps-product__image">
                	<c:forEach items="${baseInfoList}" var="confImageText">

							<div class="item"><img class="zoom" src="https://app.qiwang-sh.com${confImageText}" alt="" data-zoom-image="https://app.qiwang-sh.com${confImageText}"></div>
						</c:forEach>
                </div>
              </div>
              <div class="ps-product__thumbnail--mobile">
                <div class="ps-product__main-img"><img src="https://app.qiwang-sh.com${product.icon}" alt=""></div>
                <div class="ps-product__preview owl-slider" data-owl-auto="true" data-owl-loop="true" data-owl-speed="5000" data-owl-gap="20" data-owl-nav="true" data-owl-dots="false" data-owl-item="3" data-owl-item-xs="3" data-owl-item-sm="3" data-owl-item-md="3" data-owl-item-lg="3" data-owl-duration="1000" data-owl-mousedrag="on">
                <c:forEach items="${baseInfoList}" var="confImageText">
							<img src="https://app.qiwang-sh.com${confImageText}" alt="">
						</c:forEach></div>
              </div>
              <div class="ps-product__info">
                <div class="ps-product__rating">
                  <select class="ps-rating">
                    <option value="1">1</option>
                    <option value="1">2</option>
                    <option value="1">3</option>
                    <option value="1">4</option>
                    <option value="2">5</option>
                  </select><!-- <a href="#">(Read all 8 reviews)</a> -->
                </div>
                <h1>${product.productName}</h1>
                <!-- <p class="ps-product__category"><a href="#"> Men shoes</a>,<a href="#"> Nike</a>,<a href="#"> Jordan</a></p> -->
                <h3 class="ps-product__price">${product.price} <del>${product.marketPrice}</del></h3>
                <!-- <div class="ps-product__block ps-product__quickview">
                  <h4>QUICK REVIEW</h4>
                  <p>The Nike Free RN 2017 Men's Running Shoe weighs less than previous versions and features an updated knit material…</p>
                </div> -->
                <!-- <div class="ps-product__block ps-product__style">
                  <h4>CHOOSE YOUR STYLE</h4>
                  <ul>
                    <li><a href="product-detail.html"><img src="images/shoe/sidebar/1.jpg" alt=""></a></li>
                    <li><a href="product-detail.html"><img src="images/shoe/sidebar/2.jpg" alt=""></a></li>
                    <li><a href="product-detail.html"><img src="images/shoe/sidebar/3.jpg" alt=""></a></li>
                    <li><a href="product-detail.html"><img src="images/shoe/sidebar/2.jpg" alt=""></a></li>
                  </ul>
                </div> -->
                <div class="ps-product__block ps-product__size">
                  <h4>购买数量<!-- <a href="#">Size chart</a> --></h4>
                  <div class="form-group">
                    <input class="form-control" type="number" value="1">
                  </div>
                </div>
                <div class="ps-product__shopping"><a class="ps-btn mb-10" href="${basePath}user-cart">加入购物车<i class="ps-icon-next"></i></a>
                  <div class="ps-product__actions"><a class="mr-10" href="whishlist.html"><i class="ps-icon-heart"></i></a><a href="compare.html"><i class="ps-icon-share"></i></a></div>
                </div>
              </div>
              <div class="clearfix"></div>
              <div class="ps-product__content mt-50">
                <ul class="tab-list" role="tablist">
                  <li class="active"><a href="#tab_01" aria-controls="tab_01" role="tab" data-toggle="tab">商品详情</a></li>
                  <li><a href="#tab_02" aria-controls="tab_02" role="tab" data-toggle="tab">规格参数</a></li>
                  <li><a href="#tab_03" aria-controls="tab_03" role="tab" data-toggle="tab">反馈建议</a></li>
                </ul>
              </div>
              <div class="tab-content mb-60">
                <div class="tab-pane active" role="tabpanel" id="tab_01">
                <div class="c_hide">
						${productDetail.processInfo}</div>
                </div>
                <div class="tab-pane" role="tabpanel" id="tab_02">
                  <div class="c_hide" style="width:100%;margin:0 auto">
						<%-- <img src="${basePath}image/shopping/canshu.png"> --%>
						${productDetail.productParameter}
					</div>
                </div>
                <div class="tab-pane" role="tabpanel" id="tab_03">
                  <div class="form-group">
                    <textarea class="form-control" rows="6" placeholder="请输入您的建议与反馈..."></textarea>
                  </div>
                  <div class="form-group">
                    <button class="ps-btn" type="button">提交</button>
                  </div>
                </div>
              </div>
            </div>
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
										"<a class=\"ps-shoe__overlay\" href=\"product-detail.html\"></a>"+
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