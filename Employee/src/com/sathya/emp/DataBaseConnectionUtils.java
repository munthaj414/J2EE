package com.sathya.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionUtils {
public static Connection createConnection()
{
	Connection connection=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDrivr");
		connection=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","munthaj","taj");
		}
	catch(ClassNotFoundException | SQLException e)
	{
		e.printStackTrace();
	}
	return connection;
}
}
