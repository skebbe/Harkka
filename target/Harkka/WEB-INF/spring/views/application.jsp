<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<body>
<h1>
	Add a application
</h1>
<c:url var="addAction" value="/add" ></c:url>
<form:form action="${addAction}" commandName="application">
<table>
	<tr>
		<td>
			<form:label path="fname">
				<spring:message text="fname"/>
			</form:label>
			
		</td>
		<td>
			<form:input path="fname" />
		</td> 
		<td><form:errors path="fname" cssStyle="color: #ff0000;"/></td>
	</tr>
	
	<tr>
		<td>
			<form:label path="lname">
				<spring:message text="lname"/>
			</form:label>
		</td>
		<td>
			<form:input path="lname" />
		</td>
		<td><form:errors path="lname" cssStyle="color: #ff0000;"/></td>
	</tr>
	
	<tr>
		<td>
			<form:label path="dob">
				<spring:message text="dob"/>
			</form:label>
		</td>
		<td>
			<form:input path="dob" />
		</td>
		<td><form:errors path="dob" cssStyle="color: #ff0000;"/></td>
	</tr>
	<tr>
		<td>
			<form:radiobutton path="gender" value="Male"/>Male
			<form:radiobutton path="gender" value="Female"/>Female
		</td>
		<td>
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="application">
				<spring:message text="application"/>
			</form:label>
		</td>
		<td>
			<form:input path="application" />
		</td>
		<td><form:errors path="application" cssStyle="color: #ff0000;"/></td>
	</tr>
	
	
	
	<tr>
		<td>
			
				<input type="submit"
					value="<spring:message text="Add application"/>" />
			
		</td>
	</tr>
</table>	
</form:form>
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
			<td><a href="<c:url value='/edit/${application.id}' />" >Edit</a></td>
			
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>