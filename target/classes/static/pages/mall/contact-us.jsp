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
<title>一乎百医- 私人医生</title>
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
							<li class="current-menu-item">
								<a href="javascript:;">联系我们</a>
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
		<div class="ps-contact ps-contact--2 ps-section pt-80 pb-80">
        <div class="ps-container">
          <div class="row">
                <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12 ">
                  <div class="ps-section__header pt-50">
                    <h2 class="ps-section__title" data-mask="Contact">- 联系我们</h2>
                    <div class="ps-contact__form" action="do_action" method="post">
                      <div class="form-group">
                        <label>姓名 <sub>*</sub></label>
                        <input class="form-control" type="text" placeholder="" id="name">
                      </div>
                      <div class="form-group">
                        <label>手机号 <sub>*</sub></label>
                        <input class="form-control" type="email" placeholder="" id="phone">
                      </div>
                      <div class="form-group mb-25">
                        <label>您的留言 <sub>*</sub></label>
                        <textarea class="form-control" rows="6" id="message"></textarea>
                      </div>
                      <div class="form-group">
                        <button class="ps-btn" id="send_message">发送<i class="ps-icon-next"></i></button>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12 ">
                  <div id="contact-map" data-address="New York, NY" data-title="Shoe Store!" data-zoom="17"></div>
                </div>
          </div>
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
		<script type="text/javascript"
		src="${basePath}mall_resource/js/jquery.pagination.js"></script>
	<script type="text/javascript">
	
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