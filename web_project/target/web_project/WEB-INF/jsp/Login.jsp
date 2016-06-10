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

	<f:form method="POST" action="saveUser.do" modelAttribute="UserLogin">
	
		<table width="100%" border="0">
			<tr>
				<td><label>
						<p>User Name</p> <f:input path="emailId"
							placeholder="Please enter your email" id="emailId" />
				</label></td>
			</tr>

			<tr>
				<td>
					
					<label>
						<p>Password</p> <f:password path="password"
							placeholder="Password" id="password" />
				</label>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</f:form>
<h3 style="color: red;">${invalide}</h3>
</body>
</html>