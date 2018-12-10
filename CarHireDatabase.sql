Create DATABASE CARHIREDATABASE;
use CARHIREDATABASE;

CREATE TABLE IF NOT EXISTS Bookings (
	BookingID int NOT NULL AUTO_INCREMENT,
	StartDate varchar(12) NOT NULL,
	EndDate varchar(12) NOT NULL,
	CustID int NOT NULL,
	CarReg varchar(12),
	PRIMARY KEY (BookingID)
);

INSERT INTO Bookings (BookingID, StartDate, EndDate, CustID, CarReg)
VALUES (1, "08-11-2018", "11-11-2018", 0443, "04-G-1323"), 
       (2, "01-06-2019", "01-06-2019", 6545, "08-MO-5432"), 
	   (3, "18-07-2019", "21-07-2019", 6483, "06-G-792"),
	   (4, "10-05-2019", "15-05-2019", 8765, "04-MO-9563"),
	   (5, "09-05-2018", "12-05-2018", 4556, "06-D-7654"),
	   (6, "17-11-2018", "18-11-2018", 7567, "09-L-35394"),
	   (7, "14-12-2018", "27-12-2018", 7564, "05-C-145393"),
	   (8, "22-06-2019", "26-06-2019", 4245, "08-MN-2475"),
	   (9, "15-05-2019", "16-05-2019", 2678, "09-D-96554"),
	   (10, "03-11-2019", "07-11-2019", 1997, "10-L-5474");
	   
SELECT * FROM Bookings;