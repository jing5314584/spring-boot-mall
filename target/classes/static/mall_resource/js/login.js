/**
 * 
 */

$.ajax({
	dataType : "json",
	url : "getShoppingCartCount",
	type : "post",
	data : {
		
	},
	error : function(data) {
	},
	success : function(data) {
			
		if(data.rspCode == '000000'){
			$("#cart_count").append("<a class=\"ps-cart__toggle\" href=\"user-cart\"><span><i id=\"count\">"+data.data+"</i></span><i class=\"ps-icon-shopping-cart\"></i></a>");
    	 }else{
    		 $("#cart_count").append("<a class=\"ps-cart__toggle\" href=\"user-cart\"><i class=\"ps-icon-shopping-cart\"></i></a>");
    	 }
		
	}
});
function userLogin() {
	var md = document.getElementById("loginmod");
	md.style.display="block";
}
$(".close").click(function(){
	var md = document.getElementById("loginmod");
	md.style.display="none";
});





function siginOut() {
			$.ajax({
				dataType : "json",
				url :  "sigin-out",
				type : "post",
				data : {
					
				},
				error : function(data) {
				},
				success : function(data) {
					if(data.rspCode == '000000'){
						
						window.location.reload(true);
					}
					
				}
			});
		};
		$("#login").click(function(){
			if($("#phoNum").val().length != 11){
				layer.msg("手机号码格式不正确", {
					time : 1000
				});
				return;
			}
			if($("#code").val().length != 4){
				layer.msg("验证码不正确", {
					time : 1000
				});
				return;
			}
			
			$.ajax({
				dataType : "json",
				url : "login",
				type : "post",
				data : {
					"userName":$("#phoNum").val(),
					"code":$("#code").val()
				},
				error : function(data) {
				},
				success : function(data) {
					/* popup(data.errorMessage);
					popup(data.user); */
				if(data.rspCode == '000000'){
					window.location.reload(true);
		    	 }else{
		    		 layer.msg(data.rspMsg, {
							time : 1000
						});
		    	 }
					
				}
			});
			
		});

		var countdown=60;
		function getMessage(obj){
			
			if($("#phoNum").val().length != 11){
				layer.msg("手机号码格式不正确", {
					time : 1000
				});
				return;
			}
			var phoNum = document.getElementById("phoNum"); 
			phoNum.setAttribute("disabled",false); /*
			$("#phoNum").attr("disabled",false);*/
			sendCode();
		    settime(obj);
		}
		
		function settime(obj) {
	        if (countdown == 0) {
	        	obj.removeAttribute("disabled");
	        	obj.value="发送验证码";
	            countdown = 60;
	            return;
	        } else {
	            $(obj).attr("disabled",true);
	            obj.value="重新发送(" + countdown + ")";
	            countdown--;
	        }
	        setTimeout(function() {
	                    settime(obj) }
	                ,1000)
	    }
		function sendCode() {
			$.ajax({
				dataType : "json",
				url : "sendRegisterCode",
				type : "post",
				data : {
					"phoneNum":$("#phoNum").val(),
					"user_agent":"7bf073e716a7e5e67b35ed4989e728b74281ae75b2f176bfc24ee1a344e698a0"
				},
				error : function(data) {
				},
				success : function(data) {
					layer.msg(data.rspMsg, {
						time : 1000
					});
				}
			});
		}
		//验证码倒计时
		