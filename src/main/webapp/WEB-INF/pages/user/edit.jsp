<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="springform"
	uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<springform:form method="post" commandName="users" 
		action="${pageContext.request.contextPath }/user/edit.html">
		<table cellpadding="2" cellspacing="2">
			<tr>
				<td>username</td>
				<td>
					${users.username }
					<springform:hidden path="username"/>
				</td>
			</tr>
			
			<tr>
				<td>password</td>
				<td><springform:input path="password"/></td>
			</tr>
			
			<tr>
				<td>enabled</td>
				<td><springform:input path="enabled"/></td>
			</tr>
			
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</springform:form>

</body>
</html>