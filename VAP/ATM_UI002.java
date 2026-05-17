package com.example.com;
import java.awt.*;
import java.awt.event.*;

public class ATM_UI002 extends Frame{
	ATM_UI002(){
		Label op=new Label("Window CLosing Example");
		this.add(op);
		
		setTitle("DIET CSE");
		setSize(350, 400);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter()
			{
			   public void windowClosing(WindowEvent we) {
				   System.exit(0);
			   } 
			});
	}
	public static void main(String []args ) {
		new ATM_UI002 ();
	}

}
