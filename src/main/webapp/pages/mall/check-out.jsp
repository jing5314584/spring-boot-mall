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
<title>一乎百医 - 确认订单</title>
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
<link rel="stylesheet" href="${basePath}mall_resource/css/check-out.css">
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
				:2016年-2017年度体检套餐截至2017年12月31日全部结束，请购买体检卡还未体
			</p>
			<p class="ps-service">
				<i class="ps-icon-customer-service"></i>
				<strong>重要通知</strong>
				:检的人员在2017年12月31日前预约体检。2018年我们即将推出2018年度体检套餐，敬请关注！
			</p>
		</div>
	</div>
	<main class="ps-main">
	<div class="ps-content pt-80 pb-80">
        <div class="ps-container">
		<div class="mg_t20">
			<h4 class="nTitle">确认收货地址</h4>
			<ul id="d_address" class="comment_box detailed_address_list clearfix">
				<li class="address_box " name="ul_address_n"
					onclick="i_address_n_click(this);" address_id="1941102"
					area_id="310101">
					<div class="contact_box">
						<span class=" inline col_666 f14">景菲菲</span>
						&nbsp;&nbsp;
						<span class=" inline col_666 f14">15316028637</span>
					</div>
					<div class="detailed_address_box">
						<p title="上海市市辖区黄浦区" class=" f14 col_666 mg_t15 w250 escp">上海市&nbsp;&nbsp;黄浦区</p>
						<p class=" f12 col_666 lineH20">南苏州路1295号</p>
					</div>
					<div class="edit_btn_box ">
						<a class="inline col_link f14 mg_r15"  data-toggle="modal" data-target="#updateAddress"
							>修改</a>
						<a class="inline col_link f14" href="javascript:;"
							onclick="delAddress('1941102')">删除</a>
					</div>
					<span class="inline default_addres ">
						<i class="inline spIcon"></i>
						<span class="inline col_666 f14">默认地址</span>
					</span>
				</li>
				<li class="address_box checked" name="ul_address_n"
					onclick="i_address_n_click(this);" address_id="1941101"
					area_id="310101">
					<div class="contact_box">
						<span class="inline col_666 f14">景朋飞</span>
						&nbsp;&nbsp;
						<span class="inline col_666 f14">15316028637</span>
					</div>
					<div class="detailed_address_box">
						<p title="上海市市辖区黄浦区"
							class=" addrarea f14 col_666 mg_t15 w250 escp">上海市&nbsp;&nbsp;黄浦区</p>
						<p class=" addraddr f12 col_666">南苏州路1295号</p>
					</div>
					<div class="edit_btn_box ">
						<a class="inline col_link f14 mg_r15" href="javascript:;"
							onclick="s_update_address('1941101','15316028637','上海市','市辖区','黄浦区','310101','0','310000','310100','',this);">修改</a>
						<a class="inline col_link f14" href="javascript:;"
							onclick="delAddress('1941101')">删除</a>
					</div>
					<span class="inline default_addres ">
						<i class="inline spIcon"></i>
						<input type="button" value="设为默认地址" class="set_def"
							address_id="1941101">
					</span>
				</li>
				<li>
					<a class="add_address_box" onclick="s_new_address();">
						<i class="inline spIcon add_address_bg mg_t40"></i>
						<br>
						<span class="inline f18 col_999 mg_t15">
							使用新地址
							<em class="upfile_btn"></em>
						</span>
					</a>
				</li>
			</ul>
		</div>
		<div class="mg_t20">
			<h4 class="nTitle">确认订单</h4>
			
			<div class="clearfix mb_20">
				<div class="comment_box  ">
					<table cellspacing="0" cellpadding="0" class="sop_table1">
						<tbody>
							<tr>
								<th align="left" colspan="2">
									 <a>
									 	<span id="J_product_name " class="inline col_999">
									 		商品
									 	</span>
									</a>
								</th>
								<th width="12%" align="center" class="col_999">单价</th>
								<th width="12%" align="center" class="col_999">数量</th>
								<th width="12%" align="right" class="col_999"><span class="mg_r20">小计</span></th>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			
			<div class="suppliergroup" data-s="130136">
				<div class="bg_fff">
					<table cellspacing="0" cellpadding="0" class="sop_table1 tablecount">
						<tbody>
							
							<tr>
								<td width="23%" align="center"><a target="_blank" href="http://www.biyao.com/products/1301365002010100001-0.html">
										<img class="border" width="100" height="100" alt="" src="http://bfs.biyao.com/group1/M00/20/29/rBACW1n5KzKAEQ2gAACyS3fgNn0273_400x400.jpg">
								</a></td>
								<td width="41%" align="left">
									<div>
										<a target="_blank" href="http://www.biyao.com/products/1301365002010100001-0.html">
											<span class="col_333">DP 免烫商务七色衬衫</span>
										</a>
										
									</div> 
									<input type="hidden" class="sizeno" value="颜色:白色DP02-01" 尺寸:38="">
									
										
										<div class="col_999 mg_t5 w300 escp">
										颜色:白色DP02-01<br>尺寸:38
										</div>
										<!-- 无模型商品和低模普通商品签字 -->
										
										<!-- 普通高模商品签字 -->
										
									
									 
									 
 										
 												<div class="refund_tips"></div>
 										

								</td>
								<td width="12%"  class="col_333"><span class="col_666">¥259</span></td>
								<td width="12%"  class="col_333 td_buy_num relative" data-weight="0.0" data-id="3291895" data-pt="0" data-pd="0" data-pc="0" designid="1301365002010100001"><span class="col_333">1</span></td>
								
								<td width="12%" ><strong class="  mg_r20">¥259</strong></td>
							</tr>
							
						</tbody>
					</table>
				</div>
				
			</div>
			
			<div class="bg_fff border mg_t30  mg_l40  mg_r40 relative">
			
			<div class="firmbox mg_t20 ">
				
				<div class="lineH30  pd_l10 pd_r20 clearfix ">
					<div class="f_r col_666 f14">
						商品总价：<span class="w80 inline t_r col_f60 pd_r5 f_z f14 " id="total_order_design_price">¥478</span>
					</div>
					<span class="inline f_r mg_r30  col_666">商品总数 <em id="productNum" class="col_f60 fb f14 f_z">2</em> 件
					</span>
				</div>
				
				<div class="clearfix">
					<ul class="firm_ul f_r mg10">
						
						<li class="f14 col_666">实际支付金额：<strong class="col_f60 ">
								<em class="f_z f18 fb inline w80 " id="total_order_price">¥478</em>
						</strong></li>
					</ul>
				</div>
			</div>
			<div class="pd_t10 t_r pd_r20 mg_b20">
				<a href="/shopcars/index.html" class=" col_999 back_pay_btn inline f16 mg_r20">返回购物车</a> <a id="submitorder" href="${basePath}/online-charge" class="inline f16 order_qr_btn t_c ">提交订单</a>
			</div>
		</div>
		</div>
		
		</div>
		</div>
		
		<br>
		<br>
		<br>
		<br>
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



	<div id="updateAddress" class="modal fade" tabindex="-1"
		role="dialog" aria-labelledby="gridModalLabel" aria-hidden="true" backdrop="static" data-keyboard="false">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="gridModalLabel">修改收货地址</h4>
				</div>
				<div class="modal-body">
					<div class="pop_bd" style="height: 250px;">
						<form id="form_address">
							<input type="hidden" id="i_address_id" value="1942781">
							<table class="per_table" width="100%" cellspacing="10">
								<tbody>
									<tr>
										<td width="20%" align="right">
											<span class="col_ee5b47"></span>
											收货人姓名：&nbsp;
										</td>
										<td width="80%">
											<input id="i_receiver" type="text" value=""
												name="i_n_receiver" maxlength="12" class="inpCom w200 permy"
												onkeypress="return ValidateSpecialCharacter()">
											<span id="receiver_msg"></span>
										</td>
									</tr>
									<tr>
										<td align="right">
											<span class="col_ee5b47"></span>
											省市：&nbsp;
										</td>
										<td>
											<div class="form-inline">
												<div data-toggle="distpicker" id="distpicker5">
												
													<div class="form-group">
														<label class="sr-only" for="province2">Province</label>
														<select class="form-select" id="province"
															></select>
													</div>
													<div class="form-group">
														<label class="sr-only" for="city2">City</label>
														<select class="form-select" id="city"
															></select>
													</div>
													<div class="form-group">
														<label class="sr-only" for="district2">District</label>
														<select class="form-select" id="district"
															></select>
													</div>
												</div>
											</div>
										</td>
									</tr>
									<tr>
										<td align="right">
											<span class="col_ee5b47 mg_t10"></span>
											街道地址：&nbsp;
										</td>
										<td>
											<input id="i_address" type="text" value="" name="i_n_address"
												maxlength="50" class="inpCom w200 permy"
												onkeypress="return ValidateSpecialCharacter()"
												onkeyup="checkAddressLength();">
											<span id="address_msg"></span>
										</td>
									</tr>
									<tr>
										<td align="right">
											<span class="col_ee5b47 mg_t10"></span>
											手机号码：&nbsp;
										</td>
										<td>
											<input id="i_phone" type="text" value="" name="i_n_phone"
												maxlength="11" class="inpCom w200 permy">
											<span id="phone_msg"></span>
										</td>
									</tr>
									<tr>
										<td></td>
										<td class="isdefault">
											<div class="openIcon inline cursor"></div>
											<input type="checkbox" id="i_default_address">
											<label id="default_address_html" class="col_000">设为默认地址</label>
										</td>
									</tr>
								</tbody>
							</table>
						</form>
					</div>


				</div>
				<div class="modal-footer">
					<button type="button" class="send_address">寄到该地址</button>
				</div>
			</div>
		</div>
	</div>
	<div class="bd-example bd-example-padded-bottom">
  <button type="button" class="btn btn-primary btn-lg" >
    Launch demo modal
  </button>
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
	<script type="text/javascript" src="${basePath}layer/layer.js"></script>
	<script src="${basePath}mall_resource/js/distpicker/distpicker.data.js"></script>
	  <script src="${basePath}mall_resource/js/distpicker/distpicker.js"></script><%-- 
	  <script src="${basePath}mall_resource/js/distpicker/main.js"></script> --%>
	<script type="text/javascript">
		var basePath = '${basePath}';
		var requestPath = '${basePath}' + "admin/";
			 /* $('#updateAddress').modal({backdrop: 'static', keyboard: false}); */
		
		/* $("#distpicker5").distpicker({
			  autoSelect: false
		});	  */
		$('#distpicker5').distpicker({
			 placeholder: false,
			    province: '浙江省',
			    city: '杭州市',
			    district: '西湖区'
			  });
		function s_new_address(){
			$('#gridModalLabel').html("请输入新地址");
			$('#i_default_address').attr("checked", true);
			$('#province').data("province","上海市");
			$('#city').data("city","上海市市辖区");
			$('#district').data("district","长宁区");
			$('#updateAddress').modal();
			
			 
		}
		
		function jia(o) {
			var sz = parseInt($(o).parent().prev().val());
			/* layer.msg(sz); */
			$(o).parent().prev().val(sz + 1);
			var i = $(o).parent().parent().data("idx");
			var c = $(o).parent().prev().val();
			getPrice(o, i, c);
		}
		function jian(o) {
			var sz = parseInt($(o).parent().next().val());
			if (sz <= 1) {
				layer.msg("不能再减少了哦", {
					time : 1000
				});
			} else {
				$(o).parent().next().val(sz - 1);
				var i = $(o).parent().parent().data("idx");
				var c = $(o).parent().next().val();
				getPrice(o, i, c);
			}

		}
		//获取加减金额
		function getPrice(o, idx, count) {
			$.ajax({
				dataType : "json",
				url : basePath + "updateShoppingCartProduct",
				type : "post",
				data : {
					"idx" : idx,
					"count" : count
				},
				error : function(data) {
				},
				success : function(data) {
					$("#total_price").text("¥" + data.price);
					$(o).parent().parent().parent().next().children().text(
							"¥" + data.selectCartPrice);
				}
			});
		}
		$('#delete').on('click', function() {
			layer.confirm('您是否要从购物车中移除所选的商品？', {
				btn : [ '确定', '取消' ]
			//按钮
			}, function() {
				$.ajax({
					dataType : "json",
					url : basePath + "deleteShoppingCartProduct",
					type : "post",
					data : {
						"productIdx" : $('#delete').data("productid")
					},
					error : function(data) {
					},
					success : function(data) {
						var jsonData = data;
						if (jsonData.result_code == 0) {
							layer.alert('删除成功！', {
								icon : 1
							});
							location.reload();

						} else {
							layer.alert('删除失败！', {
								icon : 2
							});
						}

					}
				});
			}, function() {
				//取消
			});
		});

		$("ul#type")
				.on(
						"click",
						"li",
						function() {

							$("ul#type").each(function() {
								var y = $(this).children();
								y.removeClass("current");
							});
							$(this).addClass("current");
							var index = $(this).data('index');

							$(".ps-product__column").remove();
							$
									.ajax({
										dataType : "json",
										url : basePath + "getProductbySubject",
										type : "post",
										data : {
											"subjectIdx" : index
										},
										error : function(data) {
											alert("加载商品信息失败");
										},
										success : function(data) {
											/*width=\"243。48px\" height=\"216.19px\"  */
											$
													.each(
															data.v_productSubjectList,
															function(i, item) {
																$(
																		"#productlist")
																		.append(
																				"<div class=\"ps-product__column\">"
																						+ "<div class=\"ps-shoe mb-30\">"
																						+ "<div class=\"ps-shoe__thumbnail\">"
																						+ "<a class=\"ps-shoe__favorite\" href=\"#\"><i class=\"ps-icon-heart\"></i></a> "
																						+ "<div class=\"box\">"
																						+ "<div>"
																						+ "<img   src=\"https://app.qiwang-sh.com"+item.icon+"\"\">"
																						+ "</div>"
																						+ "</div>"
																						+ "<a class=\"ps-shoe__overlay\" href=\"product-detail.html\"></a>"
																						+ "</div>"
																						+ "<div class=\"ps-shoe__content\">"
																						+ "<div class=\"ps-shoe__detail\">"
																						+ "<a class=\"ps-shoe__name\"> ￥"
																						+ item.price
																						+ "</a>"
																						+ "<p class=\"ps-shoe__categories\">"
																						+ "<a>"
																						+ item.productName
																						+ "</a>"
																						+ "</p>"
																						+

																						"</div>"
																						+ "</div>"
																						+ "</div>"
																						+ "</div>");
															});
										}
									});
						});
	</script>
</body>
</body>
</html>