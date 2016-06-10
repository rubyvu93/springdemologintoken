<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Thong tin update:</h3>
	<table cellpadding="2" cellspacing="2" >

		<tr>
			<td><h4>UserName:</h4> </td>
			<td>${users.username }</td>
		</tr>
		<tr>
			<td><h4>Password:</h4> </td>
			<td>${users.password }</td>
		</tr>
		<tr>
			<td><h4>Enabled:</h4> </td>
			<td>${users.enabled }</td>
		</tr>
	</table>

</body>
</html>