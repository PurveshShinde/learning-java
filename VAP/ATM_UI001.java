package com.example.com;
import java.awt.*;
public class ATM_UI001 extends Frame 
{
	ATM_UI001 (){
		
		Button b = new Button("Click");
		b.setBounds(30,100,80,30);
		add(b);
		
		setSize(300, 400); //size of frame
		setLayout(null);
		setVisible(true);
	}


	public static void main(String[] args) {
		new ATM_UI001();
			}

}
