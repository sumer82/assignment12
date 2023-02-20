<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
 <html> 
<head> 
</head> 
<body> 
    <h1>Student Portal</h1>
    <form:form action="welcome" modelAttribute="student"> 
       <label>First name:</label>
         <form:input path="firstName" />
        <br><br> 
         
         <label>Last name:</label>
         <form:input path="lastName" /> 
        <br><br>   
         
         <label>Roll No:</label>
          <form:input path="rollNo" />
         <br><br>   
      
        <input type="submit" value="Submit" /> 
       
    </form:form> 
</body> 
</html>