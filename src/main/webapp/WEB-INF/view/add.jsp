<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
   <%@  taglib  prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!--日期插件--><script type="text/javascript" src="/resource/My97DatePicker/WdatePicker.js"></script>
<!--bootstrap的css,js -->
<link rel="stylesheet" href="/resource/css/index3.css"/>
<link rel="stylesheet" href="/resource/bootstrap-4.3.1/css/bootstrap.css"/> 
<script type="text/javascript" src="/resource/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="/resource/bootstrap-4.3.1/js/bootstrap.js"></script> 
</head>
<body>
	
	<form action="tj" method="post">
		应聘人名字:<input type="text" name="name"><br><br>
		性别:<input type="radio" value="男" name="gender">男
			<input type="radio" value="女" name="gender">女<br><br>
		出生日期:<input type="text" name="birthday" onclick="WdatePicker()">
		毕业大学:<input type="text" name="college" ><br><br>
		所学专业:<input type="text" name="major" ><br><br>
		学历:<select name="edu">
			<option value="1">专科</option>
			<option value="2">本科</option>
			<option value="3">研究生</option>
		</select><br><br>
		学历:<select name="degree">
			<option value="1">学士</option>
			<option value="2">硕士</option>
			<option value="3">博士</option>
		</select><br><br>
		<input type="submit" value="添加">
	</form>
	
</body>
</html>