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
			<th>series</th>
			<th>token</th>
			<th>username</th>
			<th>last_used</th>
			<th>Option</th>
		</tr>
		<c:forEach var="persistentLogins" items="${persistentLoginss }">
			<tr>
				<td>${persistentLogins.series }</td>
				<td>${persistentLogins.token }</td>
				<td>${persistentLogins.users.username }</td>
				<td>${persistentLogins.lastUsed }</td>
				<td>
					<a href="${pageContext.request.contextPath }/user/viewPersistenLogins/edit/${persistentLogins.token}.html">Edit</a> | 
					<a href="" onclick="return confirm('Are you sure?')">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>