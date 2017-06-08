<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
String cssPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/static/css";
String imgPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/imgs";
String jsPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/static/js";
String staticPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/static";
%>
<c:set var="cssph" value="<%=cssPath %>"/>
<c:set var="imgph" value="<%=imgPath %>"/>
<c:set var="jsph" value="<%=jsPath %>"/>
<c:set var="stcph" value="<%=staticPath%>"/>