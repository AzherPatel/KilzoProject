<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User</title>
</head>
<body>
<h2>Create New User</h2>
				
				<form action="saveUser" method="post">
				 First Name <input type ="text" name="firstName"/>
				 Last Name <input type ="text" name="lastName"/>
				Email <input type ="text" name="email"/>
				 Mobile <input type ="text" name="mobile"/>
			  <input type ="submit" name="save"/>
				</form>
				${msg}
</body>
</html>