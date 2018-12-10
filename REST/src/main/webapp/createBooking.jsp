<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create</title>
</head>
<body>
    <h2>Hire a Car</h2>
    <i>Please fill ALL input boxes</i>
    <form action="webapi/myresource/write" method="post">
    	<br/> Start Date <br/>
    	<input type="date" name="startDate">
    	<br/> End Date <br/>
	    <input type="date" name="endDate">
	    <br/> Customer ID <br/>
	    <input type="number" name="custID">
	    <br/> Car Reg <br/>
	    <input type="text" name="carReg">
	    <br/><br/>
	    <input type="submit" value="Submit">
    </form>
    <p><a href="index.jsp">Back to home menu</a>
</body>
</html>