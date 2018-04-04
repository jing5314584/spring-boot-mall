/**
 * 
 */

$.ajax({
	dataType : "json",
	url : basePath + "getShoppingCartCount",
	type : "post",
	data : {
		
	},
	error : function(data) {
	},
	success : function(data) {
		if(data.result_code == 0){
			$("#count").text(data.res);
		}
		
	}
});
$("#sigin-out").click(function() {
			$.ajax({
				dataType : "json",
				url : basePath + "sigin-out",
				type : "post",
				data : {
					
				},
				error : function(data) {
				},
				success : function(data) {
					if(data.result_code == 0){
						
						window.location.reload(true);
					}
					
				}
			});
		});
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
				url : basePath + "login",
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
					if(data.result_code == 0){
						$("#loginModal").modal('hide');
						window.location.reload(true);
					}else{
						layer.msg(data.error_string, {
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
				url : basePath + "sendRegisterCode",
				type : "post",
				data : {
					"phoneNum":$("#phoNum").val(),
					"user_agent":"7bf073e716a7e5e67b35ed4989e728b74281ae75b2f176bfc24ee1a344e698a0"
				},
				error : function(data) {
				},
				success : function(data) {
					layer.msg(data.error_string, {
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