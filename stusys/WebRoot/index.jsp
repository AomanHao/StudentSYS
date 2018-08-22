<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	 <style type="text/css">
 div#BeautifulList{width:16%;margin:20px 5px 20px 20px;font-family: Verdana;float:left;}
 #BeautifulList a{display:block;color:#BBE1E7;padding:10px 15px;background-color:#3DA2B6;border-bottom:dotted 1px #A8D3DA;font-size:12px;text-decoration:none;}
 #BeautifulList a:hover{color:#fff;background-color:#58AFC0; font-weight:bold; }
 #BeautifulList h1{margin:0;font-weight:normal;color:#fff;padding:15px;font-size:14px;background-color:#238298}
 #BeautifulFoot h2{color:white;margin:0; font-size:14px;padding:20px 10px;}

 div.RoundedCorner{background: #3DA2B6}
 b.rtop, b.rbottom{display:block;background: #FFF}
 b.rtop b, b.rbottom b{display:block;height: 1px;overflow: hidden; background: #3DA2B6}
 b.r1{margin: 0 5px}
 b.r2{margin: 0 3px}
 b.r3{margin: 0 2px}
 b.rtop b.r4, b.rbottom b.r4{margin: 0 1px;height: 2px}
 .space{height:335px;}
 #right{
	margin-top:20px;
	width:81%;
	height:100%;
	float:left;
 }
 #intop{
	height:47px;
	background-color:#238298;
	color:#fff;
	font-size:14px;
	line-height:47px;
	padding-left:15px;
 }
 #main{
 	border:2px solid #58AFC0;
	height:100%;
 }
 #othertips{
 float:right;
 margin-right:20px;
 }
  #othertips a{
  	text-decoration:none;
	color:#fff;
	font-size:12px;
  }
  #othertips a:hover{
	font-weight:bolder;
	font-size:14px;
  }
  #all{
  	margin:0 auto;
  	width:1000px;
	height:547px;
  }
  </style>
  
  </head>
  
  <body>
    <div id="all">
  <div id="BeautifulList">
 <h1>学生管理系统菜单</h1>
 <a href="getAllStudent" target="win">学生管理</a>
 <a href="getAllClass" target="win">班级管理</a>
 <a href="getAllExam" target="win">考试管理</a>
 <a href="getAllGradeOrderByExamId" target="win">成绩管理</a>
 <a href="getAllUser" target="win">用户管理</a>
 <div id="BeautifulFoot" class="RoundedCorner">
 <!-- <b class="rtop"><b class="r1"></b><b class="r2"></b><b class="r3"></b><b class="r4"></b></b> -->
 <h2 class="space"></h2>
 <b class="rbottom"><b class="r4"></b><b class="r3"></b><b class="r2"></b><b class="r1"></b></b>
 </div>
  </div>
  <div id="right" >
  	<div id="intop">
		当前用户：
		<strong>admin</strong>
		<div id="othertips"><a href="login.jsp">使用其他用户登录</a></div>
	</div>
	<div id="main">
	 <iframe name="win" id="win" frameborder="0" height="100%" width="100%"></iframe>
	</div>
  </div>
  </div>
  </body>
</html>
