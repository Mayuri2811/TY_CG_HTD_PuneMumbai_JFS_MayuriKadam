<%@page import="com.capgemini.springmvc.beans.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%
	/* String empId = (String) request.getAttribute("empId"); */
	/* int empId=(int)request.getAttribute("empId");
	String password = (String) request.getAttribute("pwd"); */
	
	UserBean userBean=(UserBean)request.getAttribute("userBean");
	
%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- Entered Employee ID=<%=empId%>
	Entered Password=<%=password%> --%>
	
	Entered Employee ID=<%=userBean.getEmpId() %>
	Entered Password=<%=userBean.getPassword() %>
	Entered DOB=<%=userBean.getDob()%>
</body>
</html>