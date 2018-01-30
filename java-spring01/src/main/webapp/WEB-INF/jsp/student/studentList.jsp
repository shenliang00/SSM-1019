<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询学员列表</title>
</head>
<body> 
<form action="${pageContext.request.contextPath }/student/queryStudent.do" method="post">
查询条件：
<table width="100%" border=1>
<tr>
<td><input type="submit" value="查询"/></td>
</tr>
</table>
学员列表：
<table width="100%" border=1>
<tr>
    <td>学号</td>
    <td>姓名</td>
    <td>性别</td>
    <td>家庭住址</td>
    <td>操作</td>
</tr>
<c:forEach items="${studentList }" var="t_student">
<tr>
    <td>${t_student.id }</td>
    <td>${t_student.name }</td>
    <td>${t_student.sex }</td>
    <td>${t_student.address }</td>
    
    <td><a href="${pageContext.request.contextPath }/student/editStudent.do?id=${t_student.id}">修改</a></td>

</tr>
</c:forEach>

</table>
</form>
</body>

</html>