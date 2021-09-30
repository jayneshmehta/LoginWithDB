package com.libraryManagement.System;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SignUp extends Frame{
 public void SignUp(){
	 setTitle("Sign Up ");
	 Label j = new Label(" If you have a garden and a library, ");
	 Label j1 = new Label("you have everything you need. ");
	 Label j2 = new Label("Gender:");
	 Label Name = new Label("Name: ");
		Label Pass = new Label("Set Password : ");
		Label Phone = new Label("Phone No :  ");
		TextField n1 = new TextField();
		TextField n2 = new TextField();
		TextField n3 = new TextField();
		Checkbox c1 = new Checkbox("Male");
		Checkbox c2 = new Checkbox("Female");
		Checkbox c3 = new Checkbox("Others");
		Label A = new Label();
		
		Button b = new Button("Submit");
	    
		
		j.setBounds(20,30,200,25);
		j1.setBounds(60,50, 200, 25);
		Name.setBounds(20,85,80, 30);
		Pass.setBounds(20,155,90,30);
	    Phone.setBounds(20,120 ,80 ,30);
		n1.setBounds(110, 85, 110, 25);
		n2.setBounds(110, 120, 110, 25);
		n3.setBounds(110, 155, 110, 25);
		b.setBounds(85, 210, 100, 25);
		A.setBounds(100,250,80,30);
		
		addWindowListener (new WindowAdapter() {    
	           public void windowClosing (WindowEvent e) {    
	               dispose();    
	           }    
	       }); 
		add(j);
		add(j1);
		add(Name);
		add(Pass);
		add(Phone);
		add(b);
		add(n1);
		add(n2);
		add(n3);
		add(A);
		j.setBackground(Color.orange);
		j1.setBackground(Color.orange);
		Name.setBackground(Color.LIGHT_GRAY);
		Pass.setBackground(Color.lightGray);
		Phone.setBackground(Color.LIGHT_GRAY);
		b.setBackground(Color.magenta);
		A.setBackground(Color.magenta);
		setSize(300,300);
	    setLayout(null);
	    setVisible(true);
	    setBackground(Color.MAGENTA);
	    String N = Name.getText();
	    String P = Phone.getText();
	    String Pa = Pass.getText();
	    
	    b.addActionListener(new ActionListener(){   
			@Override
			public void actionPerformed(ActionEvent e) {
		Query q = new Query();
		if(q.SignIn(N, P, Pa)) {
			A.setText("Id Created .");
		}else {
			A.setText("Error !! ");
		}
			}
			});
 }
}
