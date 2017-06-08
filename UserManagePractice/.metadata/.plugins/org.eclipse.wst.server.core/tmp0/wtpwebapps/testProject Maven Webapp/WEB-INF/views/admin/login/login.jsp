<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="/WEB-INF/base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${cssph}/login.css" rel="stylesheet">
<script type="text/javascript" src="${jsph }/jquery.min.js"></script>
<script type="text/javascript" src="${jsph }/login.js"></script>
<script type="text/javascript" src="${jsph }/layer/layer.js"></script>
<title>登	录</title>
</head>
<body>
	<h1>用 户 管 理 系 统</h1>
	<div id="div-login-form">
		<div id="div-close"></div>
		<div id="div-head-info">
			<label id="lb1"></label> <label id="lb2"></label> <label id="lb3"></label>
		</div>
		<div id="div-head-img">
			<img src="${imgph}/avtar.png">
		</div>
		<form id="form1">
			<input type="text" id="name" name="name">
			<div class="div-key">
				<input type="password" id="password" name="password">
			</div>
		</form>
		<div id="div-sigin">
			<input type="submit" id="login" value="提 交">
			<input type="button" id="test1" value="测试1">
		</div>
	</div>
	<div id="footer">
		<p>Copyright &copy; 2015.Company name All rights reserved.More
			Templates - Collect from</p>
	</div>
</body>
</html>