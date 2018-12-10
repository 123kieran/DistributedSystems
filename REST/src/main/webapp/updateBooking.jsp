<html>
<body>
    <h2>Update an Order</h2>
    <i>Please specify Booking ID to update, edit appropriate fields</i>
    <form action="webapi/myresource/updateCarHire" method="post">
    	<br/> Booking ID <br/>
    	<input type="number" name="bookingID">
    	<br/>
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