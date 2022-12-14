<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
</head>
<body>
<h2>Users</h2>
		<table>
			<tr>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Email</th>
					<th>Mobile</th>
					<th>Delete</th>
			</tr>
			<c:forEach var="user" items="${users}">

			<tr>
				<td>${user.firstName}</td>
				<td>${user.lastName}</td>
				<td>${user.email}</td>
				<td>${user.mobile}</td>
				<td><a href="delete?id=${user.id }">delete</a></td>
				<tr>
   </c:forEach>
   </table>
</body>
</html>