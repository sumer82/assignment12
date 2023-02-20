<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
	<h1>Showing Details</h1>
	${name}<br>
	${model}<br>
	<%-- <c:forEach var="temp" items=${lists}>
	<c:out value="${temp}"/>
	</c:forEach> --%>
</body>
</html>