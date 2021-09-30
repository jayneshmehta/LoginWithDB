package com.libraryManagement.System;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
static Connection con ;
  public static Connection createC() {
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
		 String user = "root";
		 String password = "jaynesh5245";
		 String url = "jdbc:mysql://localhost:3306/Lib_System";
		  con = DriverManager.getConnection(url,user,password);
	  }catch(Exception e) {
		 e.printStackTrace();   
	  }
	return con;
  }
}
