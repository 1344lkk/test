<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css"/>
</head>
<body> 
<div class="container">
<form action="${pageContext.request.contextPath }/item/queryItem.action" method="post">
查询条件：
<table width="100%" border=1>
<tr>
<td><input type="submit" class="btn btn-primary" value="查询"/></td>
</tr>
</table>
商品列表：
<table class="table table-hover table-bordered">
<thead>
<tr>
	<th>商品名称</th>
	<th>商品价格</th>
	<th>生产日期</th>
	<th>商品描述</th>
	<th>操作</th>
</tr>
</thead>
<tbody>
<c:forEach items="${itemsList}" var="item">
<tr>
	<td>${item.name }</td>
	<td>${item.price }</td>
	<td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	<td>${item.detail }</td>
	
	<td><a href="${pageContext.request.contextPath }/item/editItem.action?id=${item.id}">修改</a></td>

</tr>
</c:forEach>
</tbody>
</table>
</form>
</div>
</body>

</html>