<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table width="100%" border="0" cellpadding="0" cellspacing="0" align="left">
    <tr>
      <td colspan="2" align="left"><tiles:insertAttribute name="header" />
      </td>
    </tr>
    <tr>
      <td colspan="2" align="left"><tiles:insertAttribute name="footer" />
      </td>
    </tr>
      <tr>
      <td valign="top" bgcolor="#FFC266"><tiles:insertAttribute name="body" />
      </td>
    </tr>
  
  </table>
  
</body>
</html>