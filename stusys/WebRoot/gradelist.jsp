<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
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

		<title>My JSP 'userlist.jsp' starting page</title>

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

table {
	border: 1px dashed #CCCCCC;
	border-collapse: collapse;
}

td,th {
	border: 1px dashed #CCCCCC;
	padding: 5px;
}

caption {
	padding: 8px;
}

th {
	background-color: #BBE1E7;
	color: #336699;
}

button {
	margin: 8px;
	padding: 4px 10px;
	background-color: #00CC99;
	border: 1px solid #00CC99;
	color: #fff;
	font-weight: bold;
}
</style>
		<script language="javascript" type="text/javascript">
function add() {
	window.location.href = 'preAddGrade';
}

function del(id){
	if(window.confirm("确认删除？")){
		//删除
		window.location.href="delGrade?id="+id;
	}
}
</script>
	</head>

	<body>
		<div id="all">
			<div id="title">
				当前页面：成绩管理 >> 学生成绩列表
			</div>
			<button onclick="add();">
				新增学生成绩信息
			</button>
			<div>
				<table width="100%">
					<tr>
						<th width="10%">
							科目ID
						</th>
						<th width="20%">
							考试科目
						</th>
						<th width="15%">
							学生ID
						</th>
						<th width="20%">
							姓名
						</th>
						<th width="15%">
							成绩
						</th>
						<th width="20%">
							操作
						</th>
					</tr>
					
					<s:iterator value="list" var="item">
						<tr>
							<td>
								<s:property value="#item.exam.id"/>
							</td>
							<td>
								<s:property value="#item.exam.name"/>
							</td>
							<td>
								<s:property value="#item.student.id"/>
							</td>
							<td>
								<s:property value="#item.student.name"/>
							</td>
							<td>
								<s:property value="#item.score"/>
							</td>
							<td>
								<a href="preModifyGrade?id=<s:property value='#item.id'/>">编辑</a>
								<a href="javascript:del(<s:property value='#item.id'/>);">删除</a>
								<%-- <a href="getStudentInfoById?id=<s:property value='#item.id'/>">详情</a> --%>
							</td>
						</tr>
					</s:iterator>
				</table>
			</div>
		</div>
	</body>
</html>
