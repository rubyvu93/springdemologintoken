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

	<springform:form method="post" commandName="persistentLogins"
		>
		<table cellpadding="2" cellspacing="2">
			<tr>
				<td>token</td>
				<td>${persistentLogins.token }
				</td>
			</tr>
			<tr>
				<td>username</td>
				<td>${persistentLogins.users.username }
				<a href="${pageContext.request.contextPath }/user/edit/${persistentLogins.users.username}.html" >===> Edit user</a>
			</tr>
			<tr>
				<td>series</td>
				<td>${persistentLogins.series }
				</td>
			</tr>
			<tr>
				<td>last_used</td>
				<td>${persistentLogins.lastUsed }
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
		</table>
	</springform:form>

</body>
</html>