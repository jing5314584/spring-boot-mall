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
							<a class="ps-logo" href="index.html">
								<img src="http://www.qiwang-sh.com/web/style/images/logo.jpg"
									alt="">
							</a>
						</div>
					</div>
					<div class="navigation__column center">
						<ul class="main-menu menu">
							<li class="menu-item">
								<a href="${basePath}index.html">首页</a>
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
						<form class="ps-search--header" action="do_action" method="post">
							<input class="form-control" type="text" placeholder="搜索商品…">
							<button>
								<i class="ps-icon-search"></i>
							</button>
						</form>
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
			<c:forEach items="${addresseList}" var="addresse"
						varStatus="status">
						<c:choose>
				<c:when test="${status.index == 0 }">
				<li class="address_box checked" name="ul_address_n"
					onclick="i_address_n_click(this);" data-idx="${addresse.idx}">
				</c:when>
				<c:otherwise>
					<li class="address_box " name="ul_address_n"
					onclick="i_address_n_click(this);" data-idx="${addresse.idx}">
				</c:otherwise>
				</c:choose>
					<div class="contact_box">
						<span class=" inline col_666 f14">${addresse.receive}</span>
						&nbsp;&nbsp;
						<span class=" inline col_666 f14">${addresse.phone}</span>
					</div>
					<div class="detailed_address_box">
						<p title="${addresse.receiveAddressProvince}${addresse.receiveAddressCity}${addresse.receiveAddressArea}" class=" f14 col_666 mg_t15 w250 escp">${addresse.receiveAddressProvince}&nbsp;${addresse.receiveAddressCity}&nbsp;${addresse.receiveAddressArea}</p>
						<p class=" f12 col_666 lineH20">${addresse.receiveAddressDetail}</p>
					</div>
					<div class="edit_btn_box ">
						<a class="inline col_link f14 mg_r15" href="javascript:;" id="updateaddress" data-idx="${addresse.idx}" data-receive="${addresse.receive}" data-phone="${addresse.phone}"
						 data-detail="${addresse.receiveAddressDetail}" data-province="${addresse.receiveAddressProvince}"
						 data-city="${addresse.receiveAddressCity}"
						 data-area="${addresse.receiveAddressArea}"
							>修改</a> 
						<a class="inline col_link f14" href="javascript:;" onclick='deleteaddress(this);'  id="deleteaddress" data-idx="${addresse.idx}">删除</a>
					</div>
					<!-- <span class="inline default_addres ">
						<i class="inline spIcon"></i>
						<span class="inline col_666 f14">默认地址</span>
					</span> -->
				</li>
				</c:forEach>
				<!-- <li class="address_box checked" name="ul_address_n"
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
				</li> -->
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
						<c:forEach items="${shoppingCartList}" var="shoppingcart"
						varStatus="status">
							
							<tr>
								<td width="23%" align="center"><a target="_blank" href="${basePath}product-detail?id=${shoppingcart.productIdx}">
										<img class="border" width="100" height="100" alt="" src="http://app.qiwang-sh.com${shoppingcart.icon}">
								</a></td>
								<td width="41%" align="left">
									<div>
										<a target="_blank" href="${basePath}product-detail?id=${shoppingcart.productIdx}">
											<span class="col_333">${shoppingcart.productName }</span>
										</a>
										
									</div> 
									<!-- <input type="hidden" class="sizeno" value="颜色:白色DP02-01" 尺寸:38="">
									
										
										<div class="col_999 mg_t5 w300 escp">
										颜色:白色DP02-01<br>尺寸:38
										</div>
										无模型商品和低模普通商品签字
										
										普通高模商品签字
										
									
									 
									 
 										
 												<div class="refund_tips"></div> -->
 										
								</td>
								<td width="12%"  class="col_333"><span class="col_666">¥${shoppingcart.productPrice}</span></td>
								<td width="12%"  class="col_333 td_buy_num relative" data-weight="0.0" data-id="3291895" data-pt="0" data-pd="0" data-pc="0" designid="1301365002010100001"><span class="col_333">${shoppingcart.productNum}</span></td>
								
								<td width="12%" ><strong class="  mg_r20">¥${shoppingcart.productNum*shoppingcart.productPrice}</strong></td>
							</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				
			</div>
			
			<div class="bg_fff border mg_t30  mg_l40  mg_r40 relative">
			
			<div class="firmbox mg_t20 ">
				
				<div class="lineH30  pd_l10 pd_r20 clearfix ">
					<div class="f_r col_666 f14">
						商品总价：<span class="w80 inline t_r col_f60 pd_r5 f_z f14 " id="total_order_design_price">¥${selectProductPrice}</span>
					</div>
					<span class="inline f_r mg_r30  col_666">商品总数 <em id="productNum" class="col_f60 fb f14 f_z">${count}</em> 件
					</span>
				</div>
				
				<div class="clearfix">
					<ul class="firm_ul f_r mg10">
						
						<li class="f14 col_666">实际支付金额：<strong class="col_f60 ">
								<em class="f_z f18 fb inline w80 " id="total_order_price">¥${selectProductPrice}</em>
						</strong></li>
					</ul>
				</div>
			</div>
			<div class="pd_t10 t_r pd_r20 mg_b20">
				<a href="${basePath}user-cart" class=" col_999 back_pay_btn inline f16 mg_r20">返回购物车</a> <a id="submitorder" href="javascript:;"  onclick="submitOrder();" class="inline f16 order_qr_btn t_c ">提交订单</a>
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


	<input type="hidden" id="i_address_id" value="${addressIdx}">
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
											详细地址：&nbsp;
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
										
									</tr>
								</tbody>
							</table>
						</form>
					</div>


				</div>
				<input type="hidden" id="update_idx" value="0">
				<div class="modal-footer">
					<button type="button" class="send_address" onclick="update();">寄到该地址</button>
				</div>
			</div>
		</div>
	</div>
	<div class="bd-example bd-example-padded-bottom">
  <button type="button" class="btn btn-primary btn-lg" >
    Launch demo modal
  </button>
</div>
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
	</script>
<script type="text/javascript"
		src="${basePath}mall_resource/js/login.js"></script>
	<script type="text/javascript">
			 /* $('#updateAddress').modal({backdrop: 'static', keyboard: false}); */
		
		var getEventTarget = function() {
			if (window.event) {
				return window.event;
			} else {
				var e = arguments.callee.caller;
				while (e.caller != null) {
					e = e.caller;
				}
				return e.arguments[0];
			}
		};
		
		$("#distpicker5").distpicker({
			autoSelect : false
		});
		$('#updateaddress').click(function(event) {
			/* alert($(this).data("idx")); */
			$("#i_receiver").val($(this).data("receive"));
			$("#i_phone").val($(this).data("phone"));
			$("#i_address").val($(this).data("detail"));
			$("#update_idx").val($(this).data("idx"));

			$('#updateAddress').modal();
			event.stopPropagation();

		});
		
		function deleteaddress(o) {
			 layer.confirm('确定要删除这个地址吗？', {
					btn : [ '确定', '取消' ]
				//按钮
				}, function() {
					 $.ajax({
						dataType : "json",
						url : basePath + "deleteAddressForHealthMall",
						type : "post",
						data : {
							"addressIdx" : $(o).data("idx")
						},
						error : function(data) {
						},
						success : function(data) {
							var jsonData = data;
							if (jsonData.result_code == 0) {
								layer.alert('删除成功！', {icon: 1});
								location.reload();

							} else {
								layer.alert('删除失败！', {icon: 2});
							}

						}
					});  
				}, function() {
					//取消
				});
			var e = getEventTarget();
			e.stopPropagation();
		}
		/* $('#deleteaddress').click(function(event){
			alert($(this).data("idx"));
			event.stopPropagation();
			
		});  */
		function update() {
			var idx = $("#update_idx").val();
			var name = $("#i_receiver").val();
			var phone = $("#i_phone").val();
			var s1 = $("#province").val();
			var s2 = $("#city").val();
			var s3 = $("#district").val();
			var detail_add = $("#i_address").val();

			if (name == '') {
				layer.msg("请填写姓名", {
					time : 1000
				});
				return;
			}
			if (phone == '') {
				layer.msg("请填写手机号", {
					time : 1000
				});
				return;
			}
			if (s1 == '') {
				layer.msg("没有选择省份", {
					time : 1000
				});
				return;
			}
			if (s2 == '') {
				layer.msg("没有选择城市", {
					time : 1000
				});
				return;
			}
			if (s3 == '') {
				layer.msg("没有选择地区", {
					time : 1000
				});
				return;
			}
			if (detail_add == '') {
				layer.msg("请填写详细地址", {
					time : 1000
				});
				return;
			}
			if (idx == 0) {
				$.ajax({
					dataType : "json",
					url : basePath + "addAddressForHealthMall",
					type : "post",
					data : {
						"name" : name,
						"phone" : phone,
						"sheng" : s1,
						"chengshi" : s2,
						"diqu" : s3,
						"address" : detail_add
					},
					error : function(data) {
					},
					success : function(data) {
						var jsonData = data;
						if (jsonData.result_code == 0) {
							window.location.reload(true);
						} else {
							layer.msg(jsonData.errorString, {
								time : 1000
							});
						}
					}
				});
			} else {
				$.ajax({
					dataType : "json",
					url : basePath + "updateAddressForHealthMall",
					type : "post",
					data : {
						"addressIdx" : idx,
						"name" : name,
						"phone" : phone,
						"sheng" : s1,
						"chengshi" : s2,
						"diqu" : s3,
						"address" : detail_add
					},
					error : function(data) {
					},
					success : function(data) {
						var jsonData = data;
						if (jsonData.result_code == 0) {
							window.location.reload(true);
						} else {
							layer.msg(jsonData.errorString, {
								time : 1000
							});
						}
					}
				});
			}

		}
		function i_address_n_click(o) {
			$("ul#d_address").each(function() {
				var y = $(this).children();
				y.removeClass("checked");
			});
			$(o).addClass("checked");
			$("#i_address_id").val($(o).data("idx"));
		}
		function s_new_address() {
			$('#gridModalLabel').html("请输入新地址");
			$("#i_receiver").val("");
			$("#i_phone").val("");
			$("#i_address").val("");
			$("#update_idx").val("0");
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
		function submitOrder() {
			if($("#i_address_id").val() == 0){
				layer.msg("参数错误请重新提交订单", {
					time : 1000
				});
			}
			$.ajax({
				dataType : "json",
				url : basePath + "addOrderNew",
				type : "post",
				data : {
					"addressIdx" : $("#i_address_id").val()
				},
				error : function(data) {
				},
				success : function(data) {
					if(data.result_code == 0){
						window.location.href=basePath+"online-charge?orderId="+data.orderIdx;
					}else{
						layer.msg(data.error_string, {
							time : 1000
						});
					}
				}
			});
		}
	</script>
</body>
</body>
</html>