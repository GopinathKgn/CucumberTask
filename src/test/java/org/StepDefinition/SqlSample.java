package org.StepDefinition;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class SqlSample {
	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "hr";
		String password = "Gopiwin.94";
		Connection connection = null;

		try {
			// 1.Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.Connect to Database
			connection = DriverManager.getConnection(url, userName, password);
			// 3. Write a SQL query
			String sql = "select * from AdactinHotels where TESTCASE_NO='TC5'";
			// 4.Prepare the statement
			PreparedStatement ps = connection.prepareStatement(sql);
			// 5.Excute the query
			ResultSet rs = ps.executeQuery();
			// 6.Iterate the results
			while (rs.next()) {
				String testCaseNo = rs.getString("TESTCASE_NO");
				String name = rs.getString("UserName");
				String pass = rs.getString("Password");
				String location = rs.getString("Location");
				String hotel = rs.getString("Hotels");
				String roomType = rs.getString("Room_Type");
				String numberOfRooms = rs.getString("Number_of_Rooms");

				Date checkIn = rs.getDate("Check_In_Date");
				Date checkOut = rs.getDate("Check_Out_Date");
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");

				String checkInDate = dateFormat.format(checkIn);
				String checkOutDate = dateFormat.format(checkOut);
				String adultsPerRoom = rs.getString("Adults_per_Room");
				String childrenPerRoom = rs.getString("Children_per_Room");
				String firstName = rs.getString("First_Name");
				String lastName = rs.getString("Last_Name");
				String address = rs.getString("Billing_Address");
				long creditCardNumber = rs.getLong("Credit_Card_No");
				String creditCardType = rs.getString("Credit_Card_Type");
				String creditCardExpiryMonth = rs.getString("Month");
				String creditCardExpiryYear = rs.getString("Year");
				int cvvNumber = rs.getInt("CVV_Number");

				System.out.println(testCaseNo);
				System.out.println(name);
				System.out.println(pass);
				System.out.println(location);
				System.out.println(hotel);
				System.out.println(roomType);
				System.out.println(numberOfRooms);
				System.out.println(checkInDate);
				System.out.println(checkOutDate);
				System.out.println(adultsPerRoom);
				System.out.println(childrenPerRoom);
				System.out.println(firstName);
				System.out.println(lastName);
				System.out.println(address);
				System.out.println(creditCardNumber);
				System.out.println(creditCardType);
				System.out.println(creditCardExpiryMonth);
				System.out.println(creditCardExpiryYear);
				System.out.println(cvvNumber);

			}

		}

		catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		catch (SQLException e) {

			e.printStackTrace();
		}

		finally {

			// 7.Close the db connection
			try {
				connection.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
