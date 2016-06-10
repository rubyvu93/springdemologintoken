<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<br>
	<table cellpadding="2" cellspacing="2" border="1">
		<tr>
			<th>Username</th>
			<th>Pass</th>
			<th>Option</th>
		</tr>
		<c:forEach var="users" items="${userss }">
			<tr>
				<td>${users.username }</td>
				<td>${users.password }</td>
				<td>
					<a href="">Edit</a> | 
					<a href="" onclick="return confirm('Are you sure?')">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>