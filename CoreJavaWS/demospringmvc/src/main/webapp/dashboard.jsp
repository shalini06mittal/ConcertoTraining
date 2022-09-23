<%@page import="com.springmvc.entity.TransactionDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class='container'>
	<h2>Dashboard</h2> 
	<p><a href='logout'>Logout</a></p>
	<%
	String email = (String) session.getAttribute("email");
	%><h4>
		Welcome
		<%=email%></h4>

	<%
	List<TransactionDetails> tl = (List<TransactionDetails>) request.getAttribute("tr");
	%>

	<table class='table'>
		<tr>
			<th>Id</th>
			<th>Amount</th>
		</tr>
		<%
		for (TransactionDetails trans : tl) {
		%>
		<tr>
			<td><%= trans.getTid() %></td>
			<td><%= trans.getAmount()%></td>
		</tr>
		<%
		}
		%>
	</table>
	</div>



</body>
</html>