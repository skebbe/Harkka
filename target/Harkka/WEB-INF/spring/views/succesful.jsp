<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h1>
	Successfully added your application to database
</h1>


<br>
<h3>Application</h3>
<c:if test="${!empty listApplications}">
	<table>
	<tr>
		<th width="120">First name</th>
		<th width="120">Last Name</th>
		<th width="120">Date of birth</th>
		<th width="120">Gender</th>
		<th width="120">Application</th>
	</tr>
	<c:forEach items="${listApplications}" var="application">
		<tr>
			<td>${application.fname}</td>
			<td>${application.lname}</td>
			<td>${application.dob}</td>
			<td>${application.gender}</td>
			<td>${application.application}</td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>