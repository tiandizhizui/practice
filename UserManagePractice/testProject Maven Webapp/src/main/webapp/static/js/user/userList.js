$(function () {

	    //1.初始化Table
	    var oTable = new TableInit();
	    oTable.Init();

	    //2.初始化Button的点击事件
	    var oButtonInit = new ButtonInit();
	    oButtonInit.Init();

	});
	
	var TableInit = function () {
	    var oTableInit = new Object();
	    //初始化Table
	    oTableInit.Init = function () {
	        
	    	var location = (window.location+'').split('/');
	    	var basePath = "http://" + location[2] + "/" + location[3];
	    	
	    	$('#UserTable').bootstrapTable({
	            url: basePath + '/UserPaging',    //请求后台的URL（*）
	            method: 'get',                      //请求方式（*）
	            toolbar: '#toolbar',                //工具按钮用哪个容器
	            striped: true,                      //是否显示行间隔色
	            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
	            pagination: true,                   //是否显示分页（*）
	            sortable: false,                     //是否启用排序
	            sortOrder: "asc",                   //排序方式
	            queryParams: oTableInit.queryParams,//传递参数（*） 
	            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
	            pageNumber:1,                       //初始化加载第一页，默认第一页
	            pageSize: 3,                       //每页的记录行数（*）
	            pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
	            search: false,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
	            strictSearch: false,
	            showColumns: false,                  //是否显示所有的列
	            showRefresh: false,                  //是否显示刷新按钮
	            minimumCountColumns: 2,             //最少允许的列数
	            clickToSelect: true,                //是否启用点击选中行
	            height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
	            uniqueId: "id",                     //每一行的唯一标识，一般为主键列
	            showToggle:false,                    //是否显示详细视图和列表视图的切换按钮
	            cardView: false,                    //是否显示详细视图
	            detailView: false,                   //是否显示父子表
	            columns: [{
	                field: 'id',
	                title: 'ID'
	            }, {
	                field: 'name',
	                title: '姓名'
	            },{
	    	        field: 'operation',
	    	        title: '操作',
	    	        formatter:function(value,row,index){
	    	            var s = '<a class = "save" href="javascript:void(0)">更新</a>';
	    	            var d = '<a class = "remove" href="javascript:void(0)">删除</a>';
	    	            return s+' '+d;
	    	        },
	    	        events: 'operateEvents'
	    	    }]
	        });
	    };
	
	    window.operateEvents = {
	            'click .remove': function(e, value, row, index) {      
	            	var location = (window.location+'').split('/');
	    	    	var basePath = "http://" + location[2] + "/" + location[3];
	            	$.ajax({
	    	            type: "post",
	    	            data: JSON.stringify(row),
	    	            dataType:'json',
	    	            contentType:"application/json",
	    	            url: basePath + '/user/delete',
	    	            success: function (result) {
	    	            	layer.alert(result.message, {icon: 2});
	    	                $('#UserTable').bootstrapTable('remove', {
	    	                    field: 'id',
	    	                    values: [row.id]
	    	                });
	    	            }
	    	        }); 
	             },
	             'click .save': function(e, value, row, index) {      
		            	var location = (window.location+'').split('/');
		    	    	var basePath = "http://" + location[2] + "/" + location[3];
		            	/* $.ajax({
		    	            type: "post",
		    	            data: JSON.stringify(row),
		    	            dataType:'json',
		    	            contentType:"application/json",
		    	            url: basePath + '/user/GoToUpdateJsp'
		    	        });  */
		    	        var h = ($(window).height() - 50);
		    	        var w = 800;
		    	    	layer.open({
		    	    		type: 2,
		    	    		area: [w+'px', h +'px'],
		    	    		fix: false, //不固定
		    	    		maxmin: true,
		    	    		scrollbar: false,//屏蔽游览器滚动条
		    	    		shade:0.4,
		    	    		title: '修改用户信息',
		    	    		content: basePath + '/user/'+ row.id + '/GoToUpdateJsp'
		    	    	});
		             }
	     }
	    
	    //得到查询的参数
	    oTableInit.queryParams = function (params) {
	        var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
	            limit: params.limit,   //页面大小
	            offset: params.offset 	//页码
	        };
	        return temp;
	    };
	    return oTableInit;
	};


	var ButtonInit = function () {
	    var oInit = new Object();
	    var postdata = {};

	    oInit.Init = function () {
	        //初始化页面上面的按钮事件
	    };

	    return oInit;
	};
	
