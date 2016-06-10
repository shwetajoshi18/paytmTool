<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<f:form method="POST" action="saveRegistration.do"
		modelAttribute="Registration">
		<table width="100%" border="0">
			<tr>
				<td><f:errors path="first_name" class="label error-label"></f:errors>
					<label>
						<p>First Name</p> <f:input path="first_name"
							placeholder="Enter first name" id="first_name" />
				</label></td>
			</tr>

			<tr>
				<td><f:errors path="last_name" class="label error-label"></f:errors>
					<label>
						<p>Last Name</p> <f:input path="last_name"
							placeholder="Enter Last Name" id="last_name" />
				</label></td>
			</tr>

			<tr>
				<td><f:errors path="mobile_no" class="label error-label"></f:errors>
					<label>
						<p>Mobile No</p> <f:input path="mobile_no"
							placeholder="Enter Mobile Number" id="mobile_no" />
				</label></td>
			</tr>

			<tr>
				<td><f:errors path="email_id" class="label error-label"></f:errors>
					<label>
						<p>Email Id</p> <f:input path="email_id"
							placeholder="Enter email id" id="email_id" />
				</label></td>
			</tr>

			<tr>
				<td><f:errors path="password" class="label error-label"></f:errors>
					<label>
						<p>Password</p> <f:password path="password"
							placeholder="Enter password" id="password" />
				</label></td>
			</tr>

			<tr>
				<td><f:errors path="address" class="label error-label"></f:errors>
					<label>
						<p>Address</p> <f:input path="address" placeholder="Enter address"
							id="address" />
				</label></td>
			</tr>

			<tr>
				<td><input type="submit" value="Registration"></td>
			</tr>
		</table>
	</f:form>
</body>
</html>