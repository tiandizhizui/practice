<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="/WEB-INF/base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户添加</title>
 <!-- Bootstrap Core CSS -->
 <link href="${cssph}/bootstrap.css" rel='stylesheet' type='text/css' />
 <link href="${cssph}/bootstrap-table.css" rel='stylesheet' type='text/css' />
 <link href="${cssph}/form.css" rel="stylesheet" type="text/css"/>
  <!-- js-->
 <script src="${jsph}/jquery.min.js"></script>
 <script src="${jsph}/user/userList.js"></script>
 <script src="${jsph}/bootstrap-table.js"></script>
 <script src="${jsph}/bootstrap-table-zh-CN.js"></script>
</head>
<body>
	<div class="base-form">
    <div class="widget-shadow">
        <div class="form-title">
            <h4>用户添加</h4>
        </div>
        <div class="form-body">
            <form>
                <div class="form-group">
                    <label for="name">姓名</label>
                    <input id="name" type="text" class="form-control">
                </div>
                <div class="form-group">
                    <label for="password">密码</label>
                    <input id="password" type="password" class="form-control">
                </div>
                <div class="form-group">
                    <button type="button" class="btn btn-default">提 交</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>