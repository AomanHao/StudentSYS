<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	#all{
		border:10px solid #238298;
		width:400px;
		height:200px;
		margin:200px auto;
	}
	#middle{
		border:10px solid #58AFC0;
		height:180px;
		margin:0px;
		padding:0px;
	}
	#inner{
		border:10px solid #BBE1E7;
		height:120px;
		margin:0px;
		padding:0px;
		color:#999999;
		font-size:18px;
		text-align:center;
		padding-top:40px;
	}
	input {
		border:1px solid #999999;
		width:150px;
		height:18px;
		margin-top:10px;
	}
</style>
  </head>
  
  <body>
   <div id="all">
		<div id="middle">
			<div id="inner">
					<s:form action="userLogin">
					<table width="100%">
					<tr>
						<td>
							用户名:
    					</td>
    					<td>
    						<s:textfield name="name"></s:textfield>
    					</td>
    				</tr>
    				<tr>
    					<td>
    						密&nbsp;码：
    					</td>
    					<td>
    						<s:textfield name="pwd"></s:textfield>
    					</td>
    				</tr>
    				<tr>
    				<td>
    					<s:submit value="登录"></s:submit>
    				</td>
    				</tr>
    				</table>
    			</s:form> 
			</div>
		</div>
	</div>
  </body>
</html>
