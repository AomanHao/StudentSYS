<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'studentadd.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<style type="text/css">
#all {
	font-size: 14px;
	color: #333333;
	margin: 0px;
	padding: 0px;
}

#title {
	padding: 10px;
	background-color: #CCCCCC;
}

button {
	margin: 8px;
	padding: 4px 10px;
	background-color: #00CC99;
	border: 1px solid #00CC99;
	color: #fff;
	font-weight: bold;
}

#main {
	margin-top: 20px;
}

td {
	padding: 20px;
}
</style>
</head>

	<body>
		<div id="all">
			<div id="title">
				当前页面：学生管理 >> 新增学生信息
			</div>
			<div id="main">
				<s:form action="addStudent" method="post">
				<table width="100%">
					<tr>
						<td width="20%">
							姓名：
						</td>
						<td width="80%">
							<s:textfield name="name"></s:textfield>
						</td>
					</tr>
					<tr>
						<td>
							性别：
						</td>
						<td>
							<s:textfield name="gender"></s:textfield>
						</td>
					</tr>
					<tr>
						<td>
							年龄：
						</td>
						<td>
							<s:textfield name="age"></s:textfield>
						</td>
					</tr>
					
					<tr>
						<td>
							所在班级：
						</td>
						<td>
							<s:select name="banji.id" list="classList" listKey="id" listValue="name" /> 
						</td>
					</tr>
					<tr>
						<td>
							电话：
						</td>
						<td>
							<s:textfield name="tel"></s:textfield>
						</td>
					</tr>
					<tr>
						<td>
							地址：
						</td>
						<td>
							<s:textfield name="address"></s:textfield>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<button>
								提 交
							</button>
						</td>
					</tr>
				</table>
				</s:form>
			</div>
		</div>
	</body>
</html>
