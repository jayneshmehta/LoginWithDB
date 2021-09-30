package com.libraryManagement.System;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginPage extends Frame   {

	LoginPage(){
		
		setTitle("LoginPage");
		Label T = new Label("Let's Learn INDIA");
		Label I = new Label("Login Id: ");
		Label P = new Label("Password : ");
		Label n = new Label("New User ? ");
	    Button b = new Button("Submit");
	    Button nb = new Button("Register");
	    TextField i = new TextField();
	    TextField p = new TextField();
	   
	   T.setBounds(35,35,170,40);
	   I.setBounds(20, 80, 80, 25);
	   P.setBounds(20, 110, 80, 25);
	   i.setBounds(110, 80,110,25);
	   p.setBounds(110, 110, 110, 25);
	   b.setBounds(40, 150, 140, 25);
	   nb.setBounds(190, 255, 90, 17);
	   n.setBounds(109, 255, 70, 17);
	   
	   add(T);
	   add(I);
	   add(P);
	   add(i);
	   add(p);
	   add(b);
	   add(nb);
	   add(n);
	   Label A = new Label();
	   A.setBounds(55, 185, 140, 25);
	   
	   
	   b.addActionListener(new ActionListener(){   
		@Override
		public void actionPerformed(ActionEvent e) {
			Query q = new Query();
			   if(q.LoginId(i.getText(),p.getText()) ) {
				   A.setText("Succesfull");
			   }
			   else {
				   A.setText("Unsuccessfull! ");
			        A.setBounds(55, 185, 140, 25);
			   }
		}
			   });
	   add(A);
	   nb.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			SignUp Sign = new SignUp();
			Sign.SignUp();
		}
	   });
	   addWindowListener (new WindowAdapter() {    
           public void windowClosing (WindowEvent e) {    
               dispose();    
           }    
       }); 
	   
	   setSize(300,300);
	   setLayout(null);
	   setVisible(true);
	   I.setBackground(Color.LIGHT_GRAY);
	   P.setBackground(Color.LIGHT_GRAY);
	   n.setBackground(Color.GREEN);
	   nb.setBackground(Color.RED);
	   T.setBackground(Color.magenta);
	   A.setBackground(Color.yellow);
	   setBackground(Color.YELLOW);
	   b.setBackground(Color.ORANGE);
	
	}
	public static void main(String[] args) {
    LoginPage S = new LoginPage();
	
	}
}
