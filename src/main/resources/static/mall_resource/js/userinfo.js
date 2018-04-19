$.ajax({
	dataType : "json",
	url : "is-login",
	type : "post",
	data : {

	},
	error : function(data) {
	},
	success : function(data) {
		$("#heads").children().remove(); 
		if (data.rspCode == '000000') {
			$("#heads").append(
					"<div class=\"btn-group ps-dropdown\">"+
			"<a class=\"dropdown-toggle\"  data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"cursor:pointer\" ><i class=\"fa fa-user-o fa-2x color_8161d1 mg_t10 mg_r10\"></i>"+
			data.data+"</a>"+
								"<ul class=\"dropdown-menu\">"+
						"<li onclick=\"siginOut();\"><a style=\"cursor:pointer\"  ><i class=\"fa fa-sign-out fa-2x color_8161d1\"></i>"+
								"退出</a></li>"+
					"</ul>"+
					"</div>");
		}else{
			$("#heads").append(
					"<a style=\"cursor:pointer\" onclick=\"userLogin();\"><i class=\"fa fa-sign-in fa-2x color_8161d1 mg_t10 mg_r10\"></i>"+
					"登陆</a>"		
			);
		}

	}
});
