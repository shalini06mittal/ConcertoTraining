<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h1>Login</h1>
	<% String msg=(String)request.getAttribute("errormsg"); %>
	<p class='error'><%=msg %></p>
	
	<c:if test="${erormsg} ">
		<p class="error">${errormsg }</p>
	</c:if>
	
	 <form action="login" method="post">
		<input name="email" type="email" placeholder="E-mail"> <input
			name="password" type="password" placeholder="password"> <input
			type="submit">
	</form>

</body>
</html>