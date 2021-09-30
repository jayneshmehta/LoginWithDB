package com.libraryManagement.System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class Query {

	public boolean LoginId(String Id,String Pass){
	String name;
	boolean flag = false;
	try {
		Connection con = DB.createC();
		String q = " Select Name from LoginDetails where PhoneNo = " + "\""  + Id + "\"" + " and Password = " + "\"" + Pass + "\"";
		Statement s =  con.createStatement();
	    ResultSet Set =  s.executeQuery(q);
	while(Set.next()) {
		 name = Set.getString(1);
	  flag = true;
	}
	} catch(Exception e) {
		e.printStackTrace();
	}
	return flag;
}
	public boolean SignIn(String Name,String Phone,String Pass) {
		Boolean flag = false;
	
		try {

			Connection con = DB.createC();
			String q = " insert into LoginDetails (PhoneNo ,Password,Name) values  " + "(\""  + Phone + ",\"" + Pass +  "\", " + "\"" + Name + "\")";
			Statement s =  con.createStatement();
			 s.execute(q);
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
}
