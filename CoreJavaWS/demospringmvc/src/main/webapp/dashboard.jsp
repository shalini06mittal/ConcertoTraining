<%@page import="com.springmvc.entity.TransactionDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Dashboard</h2>
<%
String email=(String)session.getAttribute("email");
%><h4>Welcome  <%=email %></h4>

<% List<TransactionDetails> tl=(List<TransactionDetails>)request.getAttribute("tr"); %>
<%= tl %>


</body>
</html>