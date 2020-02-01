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
<link rel="stylesheet" href="/resource/bootstrap-4.3.1/css/bootstrap.css"/> 
<script type="text/javascript" src="/resource/bootstrap-4.3.1/js/bootstrap.js"></script> 
</head>
<body>
<div class="table-responsive-xl">
快速过滤:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="list">全部</a>
	  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="zc">主持90分以上的</a>
	  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="pjf">平均分80以上的</a>
	  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="yjs">研究生以上学历</a>
	
  <table class="table">
  	<tr>
  		<td>id</td>
  		<td>名字</td>
  		<td>性别</td>
  		<td>生日</td>
  		<td>毕业学校</td>
  		<td>所学专业</td>
  		<td>学历</td>
  		<td>学位</td>
  		<td>面试成绩</td>
  		<td>平均分</td>
  		<td>操作
  			<input type="button" value="添加" onclick="toadd()">
  		</td>
  	</tr>
  	<c:forEach items="${list}" var="f">
  	<tr>
  		<td>${f.id }</td>
  		<td>${f.name}</td>
  		<td>${f.gender}</td>
  		<td><fmt:formatDate value="${f.birthday}"/></td>
  		<td>${f.college}</td>
  		<td>${f.major}</td>
  		<td>
  			<c:if test="${f.edu==1}">专科</c:if>
  			<c:if test="${f.edu==2}">本科</c:if>
  			<c:if test="${f.edu==3}">研究生</c:if>
  		</td>
  		<td>
  			<c:if test="${f.degree==1}">学士</c:if>
  			<c:if test="${f.degree==2}">硕士</c:if>
  			<c:if test="${f.degree==3}">博士</c:if>
  		</td>
  		<td>${f.cj}</td>
  		<td>${f.pjf}</td>
  		<td>
  			<input type="button" value="删除" onclick="del(${f.id})">
  		</td>
  	</tr>
  	</c:forEach>
  	<tr align="center">
  		<td colspan="10">
  			当前是${info.pageNum}/${info.pages},共${info.total}条数据
  			<a href="list?pageNum=1">首页</a>
  			<a href="list?pageNum=${info.prePage}">上一页</a>
  			<a href="list?pageNum=${info.nextPage}">下一页</a>
  			<a href="list?pageNum=${info.pages}">尾页</a>
  		</td>
  	</tr>
  </table>
</div>

</body>
<script type="text/javascript">

	function toadd(){
		location="toadd";	
	}

	function del(id){
		location="del?id="+id;
	}
	
</script>
</html>