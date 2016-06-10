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
	<div align="center">
	<f:form method="POST" action="saveRecharge.do" modelAttribute="Recharge">
		<table width="100%" border="0">
			<tr>
				<td><label>
						<p>Mobile Number</p> <f:input path="mobile_no"
							placeholder="Please enter mobile number" id="mobile_no" />
				</label></td>
			</tr>

			<tr>
				<td>
					
					<label>
						<p>Amount</p> <f:input path="amount"
							placeholder="Enter your amount" id="amount" />
				</label>
				</td>
			</tr>
			<tr>
			
			<tr>
				<td>
					
					<label>
						<p>Vender</p> <f:input path="vender"
							placeholder="Enter your service provider" id="vender" />
				</label>
				</td>
			</tr>
			
			<tr>
				<td>
					
					<label>
						<p>Date</p> <f:input path="date"
							placeholder="Enter date" id="date" />
				</label>
				</td>
			</tr>			
			<tr>
			   <td><input type="submit" value="Go"></td>
			</tr>
		</table>
	</f:form>
</div>
<div align="center">
<%! int i = 1; %>
<table border="1">
        <tr>
            <th>S.no</th>
            <th>Amount</th>
            <th>Mobile_Number</th>
            <th>Vender</th>
        </tr>
        <c:forEach items="${status}" var="status">
            <tr>
               <td><%=i++ %></td>
                
                <%-- <td>${status.id}</td>
                 --%><td>${status.amount}</td>
                <td>${status.mobile_no}</td>
                <td>${status.vender}</td>
                <td>${status.date}</td>
            </tr>
        </c:forEach>
        
    </table>
    <% i=1; %>
<h3 style="color: red;">${invalide}</h3>
<%System.out.println("ram"); %>
</div>
</body>
</html>