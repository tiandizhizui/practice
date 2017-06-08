<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ include file="/WEB-INF/base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <meta name="keywords" content="Novus Admin Panel Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- Bootstrap Core CSS -->
    <link href="${cssph}/bootstrap.css" rel='stylesheet' type='text/css' />
    <!-- Custom CSS -->
    <link href="${cssph}/myIndex.css" rel="stylesheet">
    <!-- font CSS -->
    <!-- font-awesome icons -->
    <link href="${cssph}/font-awesome.css" rel="stylesheet">
    <!-- //font-awesome icons -->
    <!-- js-->
    <script src="${jsph}/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!--webfonts-->
    <link href='https://fonts.googleapis.com/css?family=Roboto+Condensed:400,300,300italic,400italic,700,700italic' rel='stylesheet' type='text/css'>
    <!--//webfonts-->
    <!--animate-->
    <link href="${cssph}/animate.css" rel="stylesheet" type="text/css" media="all">
    <script src="${jsph }/wow.min.js"></script>
    <script>
        new WOW().init();
    </script>
    <!--//end-animate-->
    <!-- Metis Menu -->
    <script src="${jsph }/metisMenu.min.js"></script>
    <script src="${jsph }/custom.js"></script>
    <link href="${cssph}/custom.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<div class="main-content">
    <div class="leftbar">

      <div class="navbar-collapse">
            <nav class="left_bar_position left_bar_decoration">
                <!--一定不要把id=side-menu漏了，不然没有下拉效果-->
                <ul class="nav" id="side-menu" ">                  
                    <c:forEach items="${menues.list}" var="menue">
                    	<li>
                       		<c:if test="${fn:length(menue.childList) != 0 }">
								<a href="#" data-toggle="collapse"><i class="fa fa-cogs nav_icon"></i>
									${menue.obj.name }
								<i class="glyphicon glyphicon-arrow-down"></i>
								</a>
								<ul class="nav nav-second-level collapse" id="usermenue" aria-expanded="false">
									<c:forEach items="${menue.childList}" var="listMenue">
                       		 			<li><a href="<%=basePath%>${listMenue.obj.url}" target="main-frame">${listMenue.obj.name }</a></li>
                       		 		</c:forEach>
								</ul>
							</c:if> 
							<c:if test="${fn:length(menue.childList) == 0 }">
                       		<!-- 还没有做完 -->
                       		</c:if>
                    	</li>
                    </c:forEach>
                </ul>
            </nav>
        </div>

    </div>

    <div class="header">
        <div class="header-left">
            <button id="ShowLeftPush">
                <li class="fa fa-bars"></li>
            </button>
            <div class="logo">
                <a href="#">
                    <h1>NOVUS</h1>
                    <span>主 页</span>
                </a>
            </div>
        </div>
        <div class="header-right">
            <div class="profile_detail_left">
               <ul class="nofitications-dropdown">

                    <li class="dropdown head-warn">
                        <a class="dropdown-toggle" href="#" data-toggle="dropdown" aria-labelledby="dropdown-menu" >
                            <i class="fa fa-envelope"></i>
                            <span class="badge">3</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="notifacation-header">
                                    <h3>你有三条消息</h3>
                                </div>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="user-img">
                                        <img src="${imgph}/1.png" alt="">
                                    </div>
                                    <div class="notifacation-desc">
                                        <p>
                                           	 你好吗？
                                        </p>
                                        <p>
                                            1小时前
                                        </p>
                                    </div>
                                    <div class="clearfix"></div>
                                </a>
                            </li>
                            <div class="clearfix"></div>
                            <li>
                                <div class="notifacation-bottom">
                                    <a href="#">
                                       	 查看所有信息
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </li>

                    <li class="dropdown head-warn">
                        <a class="dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-bell"></i><span class="badge red">4</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="notifacation-header">
                                    <h3>您有四条通知信息</h3>
                                </div>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="user-img">
                                        <img src="${imgph}/1.png" alt="">
                                    </div>
                                    <div class="notifacation-desc">
                                        <p>您该吃药了。</p>
                                        <p><span>4分钟前</span></p>
                                    </div>
                                </a>
                            </li>
                            <div class="clearfix"></div>
                            <li>
                                <a href="#">
                                    <div class="user-img">
                                        <img src="${imgph}/1.png" alt="">
                                    </div>
                                    <div class="notifacation-desc">
                                        <p>您该吃药了。</p>
                                        <p><span>4分钟前</span></p>
                                    </div>
                                </a>
                            </li>
                            <div class="clearfix"></div>
                            <li class="notifacation-bottom">
                                <a href="#">查看所有通知</a>
                            </li>
                        </ul>
                    </li>

                   <li class="dropdown head-warn">
                       <a class="dropdown-toggle" data-toggle="dropdown">
                           <i class="fa fa-tasks"></i><span class="badge blue">15</span>
                       </a>
                       <ul class="dropdown-menu">
                           <li>
                               <div class="notifacation-header">
                                   <h3>您有四条通知信息</h3>
                               </div>
                           </li>
                           <li>
                               <a href="#">
                                   <div class="user-img">
                                       <img src="${imgph}/1.png" alt="">
                                   </div>
                                   <div class="notifacation-desc">
                                       <p>您该吃药了。</p>
                                       <p><span>4分钟前</span></p>
                                   </div>
                               </a>
                           </li>
                           <div class="clearfix"></div>
                           <li class="notifacation-bottom">
                               <a href="#">查看所有通知</a>
                           </li>
                       </ul>
                   </li>

                </ul>
            </div>
            <div class="profile_detail">
              <ul>
                    <li class="dropdown">
                        <a class="dropdown-toggle2" data-toggle="dropdown">
                            <div class="acount">
                                <span class="profile_img">
                                    <img src="${imgph}/1.png" alt="">
                                </span>
                                <div class="user_name">
                                    <p>项目主管</p>
                                    <span>林的钢</span>
                                </div>
                            </div>
                            <div class="clearfix"></div>
                        </a>
                        <ul class="dropdown-menu drp-mnu">
                            <li>
                                <a href="#">
                                    <i class="fa fa-cog"></i>
                                    	设置
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <i class="fa fa-user"></i>
                                   	 简介
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <i class="fa fa-sign-out"></i>
                                   	 注销
                                </a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div class="page-wrapper">
        <div class="main-page">
			<iframe name="main-frame" height="800px" width="100%" frameborder="0">

            </iframe>
        </div>
    </div>
    <div class="footer">
        <p>
            Copyright © 2016.Company name All rights reserved.More Templates
            <a href="www.baidu.com">百度</a>
        </p>
    </div>
</div>
</body>
</html>