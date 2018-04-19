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
					$("#loginModal").modal('hide');
					window.location.reload(true);
		    	 }else{
		    		 layer.msg(data.rspMsg, {
							time : 1000
						});
		    	 }
					
				}
			});
			
		});
		$("#cancel").click(function(){
			$("#loginModal").modal('hide');
		});
		$("#yzm").click(function(){
			if($("#phoNum").val().length != 11){
				layer.msg("手机号码格式不正确", {
					time : 1000
				});
				return;
			}
			sendCode();
			$("#yzm").attr('disabled',true); 
			var num=60;
			num = count_down(num);
			timeId3=window.setTimeout("count_down("+num+")",1000);
			
		});
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
		function count_down(num){
			if(num>0){
				num -= 1;
				$("#yzm").text(num+"s");
				timeId3=window.setTimeout("count_down("+num+")",1000);
				return num;
			}else{
				window.clearTimeout(timeId3);
				$("#yzm").attr('disabled',false);
				$("#yzm").text("获取验证码");
				return 60;
			}
			
		}