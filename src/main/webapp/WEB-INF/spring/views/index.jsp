<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<body>
	<h1>Add a application</h1>
	<c:url var="addAction" value="/add"></c:url>
	<form:form action="${addAction}" commandName="application">
		<table>
			<tr>
				<td><form:label path="fname">
						<spring:message text="First Name" />
					</form:label></td>
				<td><form:input path="fname" required="true" pattern="[A-z]{1,50}" title="First name can't be empty and maximum of 50 characters"/></td>
			</tr>

			<tr>
				<td><form:label path="lname">
						<spring:message text="Last name" />
					</form:label></td>
				<td><form:input path="lname" required="true" pattern="[A-z]{1,50}" title="Last name can't be empty and maximum of 50 characters" /></td>
			</tr>

			<tr>
				<td><form:label path="dob">
						<spring:message text="Date of birth" />
					</form:label></td>
				<td><form:input path="dob" required="true" pattern="[0-9]{4}-([0]{1}[1-9]{1}|[1]{1}[0-2]{1})-([0-2]{1}[0-9]{1}|[3]{1}[0-1]{1})" title="Date of birth must be in format YYYY-MM-DD"/></td>
			</tr>
			<tr>
				<td><form:radiobutton path="gender" value="Male" required="true"/>Male <form:radiobutton
						path="gender" value="Female" />Female</td>
				<td></td>
			</tr>

			<tr>
				<td><form:label path="application">
						<spring:message text="application" />
					</form:label></td>
				<td><form:input path="application" maxlength="1000" required="true" title="Application can't be empty and maximum of 1000 characters" /></td>

			</tr>



			<tr>
				<td><input type="submit"
					value="<spring:message text="Add application"/>" /></td>
			</tr>
		</table>
	</form:form>
	<br>
	<h3>Application</h3>

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
</body>
</html>