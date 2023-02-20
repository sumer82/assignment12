<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="valentinedetails" modelAttribute="valentine">
		Date:<form:input path="name"/><br>
		Gifts:<form:checkboxes items="gifts" path="gifts"/><br>
		Location<form:input path="location"/><br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>