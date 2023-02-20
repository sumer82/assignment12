<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserForm</title>



</head>
<body bgcolor="chocolate">
	<form:form action="userInfo" modelAttribute="user">
		Name: <form:input path="name" required="true"/><br>
		Gender: <form:radiobuttons path="gender" items="${gender}"/><br>
		Country: <form:select path="country" items="${country}"></form:select><br>
		Languages: English <form:checkbox path="language" value="English"/>
				   Telugu  <form:checkbox path="language" value="Telugu"/>
				   Hindi   <form:checkbox path="language" value="Hindi"/><br>
		<p/>
		Accept agreement: <form:checkbox path="" value="accept" required="true"/>
		<p/><br>
		<input type="Submit" value="Submit">
	</form:form>
</body>
</html>