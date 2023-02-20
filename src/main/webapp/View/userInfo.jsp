<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserInfo</title>
<style>
	table,th,td,tr
	{
		border:1px solid black;
		padding:5px;
	}
	
	table
	{
		border-collapse:collapse;
	}
	
</style>
</head>
<body bgcolor="olive">
	${user}<br>
	<table>
		<tr>
			<th>Name</th>
			<th>Gender</th>
			<th>Country</th>
			<th>Language</th>
		</tr>
		<tr>
			<td>${user.name}</td>
			<td>${user.gender}</td>
			<td>${user.country}</td>
			<td>
				<ul>
					<c:forEach items="${user.language}" var="item">
						<li><c:out value="${item}" /></li>
					</c:forEach>
				</ul>
				
			</td>
		</tr>
	</table><br>
</body>
</html>