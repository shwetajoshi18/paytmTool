<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Object[] obj=(Object[])request.getAttribute("display");
String f=(String)obj[1];
String l=(String)obj[2];
String m=(String)obj[3];
String a=(String)obj[4];
%>

<form>
  <%=f %>:<br>
  <input type="text" name="firstname"><br>
  <%=l %>><br>
  <input type="text" name="lastname"><br>
  <%=m %>:<br>
  <input type="text" name="mobile_no"><br>
  <%=a %>:<br>
  <input type="text" name="address"><br>
   
   <input type="submit" value="Submit">
</form>


</body>
</html>