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
<title>一乎百医- 一乎百医APP</title>
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
<link rel="stylesheet" href="${basePath}mall_resource/css/yhby-app.css">
<link rel="stylesheet" href="${basePath}mall_resource/css/login.css">
<link rel="stylesheet" href="${basePath}mall_resource/css/slick.css">
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
							<%
								if (session.getAttribute("userIdx") != null
										&& !session.getAttribute("userIdx").toString().equals("0")) {
							%>
							<div class="btn-group ps-dropdown">
								<a class="dropdown-toggle" data-toggle="dropdown"
									aria-haspopup="true" aria-expanded="false"
									style="cursor:pointer"><i
									class="fa fa-user-o fa-2x color_8161d1 mg_t10 mg_r10"></i> <%=session.getAttribute("userName")%></a>
								<ul class="dropdown-menu">
									<li id="sigin-out"><a style="cursor:pointer"><i
											class="fa fa-sign-out fa-2x color_8161d1"></i> 退出</a></li>
								</ul>
							</div>
							<%
								} else {
							%>
							<a style="cursor:pointer" data-toggle="modal"
								data-target="#loginModal"><i
								class="fa fa-sign-in fa-2x color_8161d1 mg_t10 mg_r10"></i> 登陆</a>
							<%
								}
							%>
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
						<a class="ps-logo" href="index.html"><img
							src="http://www.qiwang-sh.com/web/style/images/logo.jpg" alt=""></a>
					</div>
				</div>
				<div class="navigation__column center">
					<ul class="main-menu menu">
						<li class="menu-item">
								<a href="${basePath}index.html">首页</a>
							</li>
							<li class="current-menu-item">
								<a href="javascript:;">一乎百医APP</a>
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
					<div class="ps-search--header">
						<input class="form-control" type="text" placeholder="搜索商品…">
						<button>
							<i class="ps-icon-search"></i>
						</button>
					</div>
					<div class="ps-cart">
						<%
							if (session.getAttribute("userIdx") != null
									&& !session.getAttribute("userIdx").toString().equals("0")) {
						%>
						<a class="ps-cart__toggle" href="${basePath}user-cart"><span><i
								id="count">0</i></span><i class="ps-icon-shopping-cart"></i></a>
						<%
							} else {
						%>
						<a class="ps-cart__toggle" href="${basePath}user-cart"><i
							class="ps-icon-shopping-cart"></i></a>
						<%
							}
						%>
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
				2016年-2017年度体检套餐截至2017年12月31日全部结束，请购买体检卡还未体检的
			</p>
			<p class="ps-service">
				<i class="ps-icon-customer-service"></i><strong>重要通知</strong>:
				人员在2017年12月31日前预约体检。2018年我们即将推出2018年度体检套餐，敬请关注！
			</p>
		</div>
	</div>
	<main class="ps-main">
		<div class="commonwai font1" style="padding-top:0px;">

			<!----index_1_over---->

			<div class="index_1wai index_1wai1">
				<div class="commonbox index_1">
					<div class="index_1_left" style="opacity: 1; left: 0px;">
						<img src="${basePath}mall_resource/images/yhby/img22.jpg">
					</div>
					<div class="index_1_right" style="opacity: 1; left: 0px;">
						<div class="index_title font48">一乎百医APP</div>
						<div class="ms font14">
							一乎百医不仅全国首创移动问诊平台标准化模式， 更倾力推出私人医生健康管理体系，联合医疗领域顶尖的专家及医疗资源，<span
								class="font16" style="color:#ff974f">构建成全方位解决健康方案的权威平台！ </span>
						</div>
						<div class="appbox">
							<div class="appbox_left">
								<div class="erweima">
									<img src="${basePath}mall_resource/images/yhby/code.jpg"
										class="img1"> <img
										src="${basePath}mall_resource/images/yhby/code.jpg">
								</div>
								<h4 class="font16">扫一扫下载手机客户端</h4>
								<p>与权威专家一对一在线沟通，预约转诊！</p>
							</div>
							<div class="appbox_right font22">
								<ul>
									<li>健康体检</li>
									<li>远程读片</li>
									<li>在线咨询</li>
									<li>专家会诊</li>
									<li>预约转诊</li>
									<li>一站式就医</li>
								</ul>
							</div>
						</div>
						<div class="index_1_right_btn">
							<a
								href="http://a.app.qq.com/o/simple.jsp?pkgname=com.qiwang.doctors&amp;title=Android下载"
								class="android"><img
								src="${basePath}mall_resource/images/yhby/indexbtn1.png"></a>
							<a
								href="http://a.app.qq.com/o/simple.jsp?pkgname=com.qiwang.doctors&amp;title=IPhone下载"
								class="android mr"><img
								src="${basePath}mall_resource/images/yhby/indexbtn2.png"></a>
						</div>

					</div>

					<div class="clear"></div>
				</div>
			</div>
			<!-- <script>
				$(".index_1wai").ready(function() {
					$(".index_1 .index_1_left").animate({
						opacity : "1",
						left : "0px",
					}, 1000);
					$(".index_1 .index_1_right").animate({
						opacity : "1",
						left : "0px",
					}, 1000);

				});
			</script> -->
			<!----index_1_over---->

			<div class="napp1">
				<div class="commonbox">
					<div class="napp1_left">
						<div class="wen font48">一乎百医是什么？</div>
						<br>
						<h3 class="font24">中国权威专业的移动问诊平台</h3>
						<div class="da font20">&nbsp; &nbsp; &nbsp; &nbsp; “一乎百医”
							集健康体检、在线咨询、预约转诊、远程读片、专家会诊等多种健康服务于一体，以京沪三甲医院的权威专家资源为核心，通过线上健康咨询和线下就医的方式围绕“私人医生”的概念为用户提供从预防、诊疗、到康复的全方位健康管理服务。</div>
					</div>
					<div class="napp1_right">
						<img src="${basePath}mall_resource/images/yhby/img23.jpg">
					</div>
					<div class="clear"></div>
				</div>
			</div>
			<!----app_1_over---->
			<!----app_2---->
			<div class="app2">
				<div class="commonbox">
					<div class="app2_left">
						&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
						&nbsp; &nbsp; &nbsp; &nbsp;<img src="${basePath}mall_resource/images/yhby/img25.jpg">
					</div>
					<div class="app2_right">
						<div class="app2_right_title font48">
							专业团队<span style="">T</span>eam
						</div>
						<div class="ms font20">&nbsp; &nbsp; &nbsp; &nbsp;
							为用户提供权威专业的医疗信息服务及诊疗解决方案。 平台三千名专家均来自一线城市三甲医院主任/副主任（教
							授/副教授）级别以上专家团队。</div>
					</div>
					<div class="clear"></div>
				</div>
			</div>
			<!----app_2_over---->
			<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</p>
			<!----app_1---->
			<div class="napp1">
				<div class="commonbox">
					<div class="napp1_left">
						<h3 class="font48">一乎之间，百医相伴！</h3>
						<div class="da font24">&nbsp; &nbsp; &nbsp;
							&nbsp;与权威专家一对一在线沟通，预约转诊！</div>
					</div>
					<div class="napp1_right">
						<img src="${basePath}mall_resource/images/yhby/img24.jpg">
					</div>
					<div class="clear"></div>
				</div>
			</div>
			<!----app_1_over---->
			<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</p>
			<!----app_2---->
			<div class="app2">
				<div class="commonbox">
					<div class="app2_left">
						&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
						&nbsp; &nbsp; &nbsp; &nbsp;<img src="${basePath}mall_resource/images/yhby/img26.jpg">
					</div>
					<div class="app2_right">
						<div class="big font36">权威</div>
						<div class="ms font20">平台三千名专家100%来自国内一线城市三甲医院，主任/副主任（教授/副教授）级别以上专家团队。</div>
						<div class="big font36">高效</div>
						<div class="ms font20">有问必答平台医生10分钟内响应；
							针对重疾解决就医难题，专家就医绿色生命通道，赢得最佳治疗时间。</div>
						<div class="big font36">严谨</div>
						<div class="ms font20">建立健康档案，根据检查报告，病例信息，专家回复有据可依。</div>
						<div class="big font36">为爱 积分</div>
						<div class="ms font20">关注一乎百医，登录App，发起、回复论坛话题赢得健康币（1健康币=1元，可用于支付：咨询问题、问题加急、
							线下服务）。</div>
						<div class="big font36">健康 护航</div>
						<div class="ms font20">持健康卡可在线预约全国各大中城市体检；同时获赠多种免费健康增值服务。</div>
					</div>
					<div class="clear"></div>
				</div>
			</div>
			<!----app_3---->
			<div class="app3">
				<div class="commonbox">
					<div class="app3_top">
						<h3 class="font30">What's New</h3>
						<div class="ms font18">
							<p>2.0.3版本升级信息：</p>
							<p>1、与泰然集团合作，新增企业专属通道。</p>
							<p>2、新增在线客服，让沟通更快捷。</p>
							<p>3、增加统一订单支付通道，让支付更便捷。</p>
						</div>
					</div>
					<div class="app3_bottom">
						<div class="app3_bottom_left">
							&nbsp; &nbsp; &nbsp; &nbsp; <img src="${basePath}mall_resource/images/yhby/img3.jpg">
						</div>
						<div class="app3_bottom_right font20">
							<div class="app3_bottom_right1">
								&nbsp; &nbsp; &nbsp; &nbsp; 下载一乎百医<br>手机版
							</div>
							<div class="app3_bottom_right1 app3_bottom_right2 font30">使用流程</div>
							<div class="app3_bottom_right1 app3_bottom_right3">
								&nbsp; &nbsp; &nbsp; &nbsp;填写<br>注册信息
							</div>
							<div class="app3_bottom_right1 app3_bottom_right4">
								&nbsp; &nbsp; &nbsp; &nbsp;进入首页<br>健康卡会员专享
							</div>
							<div class="app3_bottom_right1 app3_bottom_right5">
								&nbsp; &nbsp; &nbsp; &nbsp;输入<br>卡号和密码
							</div>
							<div class="app3_bottom_right1 app3_bottom_right6">
								&nbsp; &nbsp; &nbsp; &nbsp; 选择<br>健康卡套餐
							</div>
						</div>
						<div class="clear"></div>
					</div>
					<div class="clear"></div>
				</div>
			</div>
			<!----app_3_over---->


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
									<input class="form-control" id="phoNum" placeholder="手机号"
										value="15316028637"> <i class="fa fa-user"></i>
								</div>
								<div class="form-group help">
									<input class="form-control" id="code" placeholder="验证码"
										value="4545"> <i class="fa fa-lock"></i>
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
	<script type="text/javascript"
		src="${basePath}mall_resource/js/login.js"></script>
	<script type="text/javascript">
		$("#loginModal").modal('hide');
		$("#send_message").click(function() {
			var name = $("#name").val();
			var phone = $("#phone").val();
			var message = $("#message").val();
			if (name == '') {
				layer.msg("请填写您的姓名", {
					time : 1000
				});
				return;
			}
			if (phone == '') {
				layer.msg("请填写您的联系方式", {
					time : 1000
				});
				return;
			}
			if (message == '') {
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