<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Booking App</title>
</head>
<body>
	<h1>Flight booked</h1>
	<form action="book.do" method="post">
		Flight Name:<input type="text" name=flightName "/> cost:<input
			type="number" name="cost"> <input type="submit"
			value="Book Flight">

	</form>
</body>
</html>