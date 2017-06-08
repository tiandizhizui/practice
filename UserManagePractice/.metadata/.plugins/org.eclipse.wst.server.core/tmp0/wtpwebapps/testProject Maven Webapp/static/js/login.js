$(function(){
	$("#login").click(function(){	
		var location = (window.location+'').split('/');
		var location2 = location[1].split(':');
		var basePath = "http://" + location[2] + "/" + location[3];
		
		var name = $("#name").val();
		var password = $("#password").val();
		
		$.ajax({
			url:basePath + "/System/Login",
			type:'post',
			dataType:'json',
			contentType : "application/json;charset=UTF-8",
			data : JSON.stringify({
                name : name,
                passWord : password
            }),
			success:function(result){
				if(result.result==false){
					layer.alert(result.message, {icon: 2});
				}else{
					window.location.href = basePath + '/System/' + name + '/index';
				}
			}
		})
	});

	/*测试代码*/
	$("#test1").click(function() {
		var location = (window.location + '').split('/');
		var location2 = location[1].split(':');
		var basePath = "http://" + location[2] + "/" + location[3];

		$.ajax({
			url : basePath + "/System/test1?id=1",
			type : 'post',
			success : function(result) {
				if (result.result == false) {
					layer.alert(result.message, {
						icon : 2
					});
				} else {
					layer.alert("登录成功!", {
						icon : 1
					});
				}
			}
		})
	});
			
})