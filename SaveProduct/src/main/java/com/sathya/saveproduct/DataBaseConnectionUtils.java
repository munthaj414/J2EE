package com.sathya.saveproduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionUtils { 
// this method create the connection & return the connection 
 public static Connection createConnection()  
 { 
  Connection connection=null; 
  try { 
   Class.forName("oracle.jdbc.driver.OracleDriver"); 
   connection =DriverManager.getConnection
		   ("jdbc:oracle:thin:@Localhost:1521:xe","munthaj","taj"); 
  } catch (ClassNotFoundException | SQLException e) { 
   e.printStackTrace(); 
  } 
  return connection; 
   
   
 } 
}