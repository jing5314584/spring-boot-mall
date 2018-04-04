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
<title>一乎百医 - 在线支付</title>
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
<link rel="stylesheet"
	href="${basePath}mall_resource/css/online-charge.css">
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
							<a href="${basePath}register">
								<img src="${basePath}mall_resource/images/flag/register.svg"
									width="25px" height="25px" alt="">
								注册
							</a>
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
							<a class="ps-logo" href="index.html">
								<img src="http://www.qiwang-sh.com/web/style/images/logo.jpg"
									alt="">
							</a>
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
							<a class="ps-cart__toggle" href="#">
								<span>
									<i>20</i>
								</span>
								<i class="ps-icon-shopping-cart"></i>
							</a>
							<div class="ps-cart__listing">
								<div class="ps-cart__content">
									<div class="ps-cart-item">
										<a class="ps-cart-item__close" href="#"></a>
										<div class="ps-cart-item__thumbnail">
											<a href="product-detail.html"></a>
											<img src="${basePath}mall_resource/images/cart-preview/1.jpg"
												alt="">
										</div>
										<div class="ps-cart-item__content">
											<a class="ps-cart-item__title" href="product-detail.html">Amazin’
												Glazin’</a>
											<p>
												<span>
													Quantity:
													<i>12</i>
												</span>
												<span>
													Total:
													<i>£176</i>
												</span>
											</p>
										</div>
									</div>
									<div class="ps-cart-item">
										<a class="ps-cart-item__close" href="#"></a>
										<div class="ps-cart-item__thumbnail">
											<a href="product-detail.html"></a>
											<img src="${basePath}mall_resource/images/cart-preview/2.jpg"
												alt="">
										</div>
										<div class="ps-cart-item__content">
											<a class="ps-cart-item__title" href="product-detail.html">The
												Crusty Croissant</a>
											<p>
												<span>
													Quantity:
													<i>12</i>
												</span>
												<span>
													Total:
													<i>£176</i>
												</span>
											</p>
										</div>
									</div>
									<div class="ps-cart-item">
										<a class="ps-cart-item__close" href="#"></a>
										<div class="ps-cart-item__thumbnail">
											<a href="product-detail.html"></a>
											<img src="${basePath}mall_resource/images/cart-preview/3.jpg"
												alt="">
										</div>
										<div class="ps-cart-item__content">
											<a class="ps-cart-item__title" href="product-detail.html">The
												Rolling Pin</a>
											<p>
												<span>
													Quantity:
													<i>12</i>
												</span>
												<span>
													Total:
													<i>£176</i>
												</span>
											</p>
										</div>
									</div>
								</div>
								<div class="ps-cart__total">
									<p>
										Number of items:
										<span>36</span>
									</p>
									<p>
										Item Total:
										<span>£528.00</span>
									</p>
								</div>
								<div class="ps-cart__footer">
									<a class="ps-btn" href="cart.html">
										Check out
										<i class="ps-icon-arrow-left"></i>
									</a>
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
				<i class="ps-icon-customer-service"></i>
				<strong>客服热线</strong>
				: 400-809-3313
			</p>
			<p class="ps-service">
				<i class="ps-icon-customer-service"></i>
				<strong>重要通知</strong>
				: 2016年-2017年度体检套餐截至2017年12月31日全部结束，请购买体检卡还未体检的人员在2017
			</p>
			<p class="ps-service">
				<i class="ps-icon-customer-service"></i>
				<strong>重要通知</strong>
				: 年12月31日前预约体检。2018年我们即将推出2018年度体检套餐，敬请关注！
			</p>
		</div>
	</div>
	<main class="ps-main">

		<div class="ps-content pt-80 pb-80">
			<div class="ps-container">
				<div class="wrap  ie78 mg_t20 bg_fff mg_b40 online_info_box">
					<div class="shoppingBox  t_c">
						<div class="suc_bg inline"></div>
						<div class="sop_tip inline">
							<p class="f18 col_523 t_l" id="hintID">订单提交成功，马上付款~</p>
							<p class=" t_l lineH24 mg_t20">
								<span class="f12 inline col_666">应付金额：</span>
								<span class="f12 col_f60 inline fb">219</span>
								<span class="f12 inline  col_666">元</span>
							</p>

							<p class="col_666 lineH24 f12 t_l">生产周期：7天</p>
							<p class=" t_l lineH24">
								<span class="inline f12 col_666">收货人：景朋飞 15316028637 </span>
								<span class="inline f12 col_666 mg_l40">收货地址：上海市市辖区黄浦区南苏州路1295号</span>
							</p>

						</div>
					</div>
					<div class="shoppingBox pd_t10  bd_top_e8 bg_fff">
						<h4 class="order_title_n relative pd_b10">
							<span class="pd_l15 inline f16 col_523">请选择支付方式完成付款</span>
							<!-- <a href="#" class="get_paid_btn inline" onclick="getPaid();">找人代付</a> -->
						</h4>
						<form id="form33" action="/order/pay" method="post"
							target="_blank">
							<input type="hidden" name="order_id_list"
								value="MTIyMDEyMjY5MjgyODM4ODI0">

							<input type="hidden" id="pay_type" name="pay_type" value="1">
							<input type="hidden" id="bank_type" name="bank_type"
								value="DEFAULT">
							<input type="hidden" name="totalprice" value="219">
						</form>
						<div class="payment_list">
							<ul class="paymentTab mg_t15">
								<li class="checked f14">支付平台</li>
							</ul>
							<ul class="clearfix payIconBox pd20" id="paytype">
							<!-- 支付宝平台-->
								<li>
									<label class="radioLable checked"
										data-paytype="1">
										<i class="radioIcon inline mg_l15"></i>
										<i class="bank_new bk21  inline mg_l15"></i>
									</label>
								</li>
								<!-- 微信扫码支付平台 -->
								<li>
									<label class="radioLable"data-paytype="2">
										<i class="radioIcon inline mg_l15"></i>
										<i class="bank_new bk20  inline mg_l15"></i>
									</label>
								</li>
								

							</ul>
						</div>


						<div class="t_c pd20  bd_top_e8 relative">
							<!-- 			<span class="inline get_paid_link"><span class="inline col_666 f14">您还可以：</span><a href="###" onclick="getPaid();" class="get_paid_btn col_724 inline f14">找人代付</a></span> -->
							<a href="#" id="pay" class="confirm_120 inline col_fff f18">确认支付</a>
						</div>
					</div>
					<div id="paymaodian"></div>
				</div>


			</div>
		</div>

		<div class="ps-subscribe">
			<div class="ps-container">
				<div class="row">
					<div class="col-lg-3 col-md-12 col-sm-12 col-xs-12 ">
						<h3>
							<i class="fa fa-envelope"></i>
							Sign up to Newsletter
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
							...and receive
							<span>$20</span>
							coupon for first shopping.
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
									<a class="ps-logo" href="index.html">
										<img src="${basePath}mall_resource/images/logo-white.png"
											alt="">
									</a>
									<h3 class="ps-widget__title">Address Office 1</h3>
								</header>
								<footer>
									<p>
										<strong>460 West 34th Street, 15th floor, New York</strong>
									</p>
									<p>
										Email:
										<a href='mailto:support@store.com'>support@store.com</a>
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
										Email:
										<a href='mailto:support@store.com'>support@store.com</a>
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
										<li>
											<a href="#">Coupon Code</a>
										</li>
										<li>
											<a href="#">SignUp For Email</a>
										</li>
										<li>
											<a href="#">Site Feedback</a>
										</li>
										<li>
											<a href="#">Careers</a>
										</li>
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
										<li>
											<a href="#">Order Status</a>
										</li>
										<li>
											<a href="#">Shipping and Delivery</a>
										</li>
										<li>
											<a href="#">Returns</a>
										</li>
										<li>
											<a href="#">Payment Options</a>
										</li>
										<li>
											<a href="#">Contact Us</a>
										</li>
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
										<li>
											<a href="#">Shoes</a>
										</li>
										<li>
											<a href="#">Clothing</a>
										</li>
										<li>
											<a href="#">Accessries</a>
										</li>
										<li>
											<a href="#">Football Boots</a>
										</li>
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
								&copy;
								<a href="#">NOUTHEMES</a>
								, Inc. All rights Resevered. Design by
								<a href="#"> Alena Studio</a>
							</p>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 ">
							<ul class="ps-social">
								<li>
									<a href="#">
										<i class="fa fa-facebook"></i>
									</a>
								</li>
								<li>
									<a href="#">
										<i class="fa fa-google-plus"></i>
									</a>
								</li>
								<li>
									<a href="#">
										<i class="fa fa-twitter"></i>
									</a>
								</li>
								<li>
									<a href="#">
										<i class="fa fa-instagram"></i>
									</a>
								</li>
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
	<script type="text/javascript" src="${basePath}layer/layer.js"></script>
	<script type="text/javascript">
		var basePath = '${basePath}';
		var requestPath = '${basePath}' + "admin/";
		var paytype = 1;
		$("ul#paytype").on("click", "li", function() {
			$("ul#paytype").each(function() {
				var y = $(this).children().children();
				y.removeClass("checked");
			});
			$(this).children().addClass("checked");
			paytype = $(this).children().data("paytype");
		});
		
		$("#pay").on("click",function(){
			alert(paytype);
			
		});
	</script>
</body>
</body>
</html>