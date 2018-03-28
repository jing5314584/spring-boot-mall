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
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="maximum-scale=1.0,minimum-scale=1.0,user-scalable=0,width=device-width,initial-scale=1.0"/>
    <meta name="format-detection" content="telephone=no,email=no,date=no,address=no">
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="${basePath}appweb/aui/css/aui.css" />
    <style type="text/css">
        #demo {
            width: 4rem;
            height: 4rem;
            position: absolute;
            left: 50%;
            top: 50%;
            margin-left: -2rem;
            margin-top: -2rem;
            background-color: #e0e0e0;
            border-radius: 50%;
            line-height: 4rem;
            text-align: center;
            color: #212121;
            font-size: 1.2rem;
        }
    </style>
</head>
<body>
    <div id="demo">1</div>
    <footer class="aui-bar aui-bar-tab" id="footer">
        <div class="aui-bar-tab-item aui-active" tapmode>
            <i class="aui-iconfont aui-icon-home"></i>
            <div class="aui-bar-tab-label">首页</div>
            
        </div>
 
        <div class="aui-bar-tab-item" tapmode>
            <div class="aui-badge">99</div>
            <i class="aui-iconfont aui-icon-cart"></i>
            <div class="aui-bar-tab-label">购物车</div>
        </div>
        <div class="aui-bar-tab-item" tapmode>
            <div class="aui-dot"></div>
            <i class="aui-iconfont aui-icon-my"></i>
            <div class="aui-bar-tab-label">我的</div>
        </div>
    </footer>
</body>
<script type="text/javascript" src="${basePath}appweb/aui/script/api.js" ></script>
<script type="text/javascript" src="${basePath}appweb/aui/script/aui-tab.js" ></script>
<script type="text/javascript">
    apiready = function(){
        api.parseTapmode();
    }
    var tab = new auiTab({
        element:document.getElementById("footer")
    },function(ret){
        console.log(ret);
        if(ret){
            document.getElementById("demo").textContent = ret.index;
        }
    });
</script>
</html>