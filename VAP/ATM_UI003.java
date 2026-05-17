package com.example.com;
import java.awt.*;
import javax.swing.*;

public class ATM_UI003 extends JFrame {
	JLabel l1, l2;
	JTextField tf1, tf2;
	JButton b1, b2, b3 ;
	JFrame jf;
	
	ATM_UI003(){
		jf = new JFrame("FlowLayout Example");
		jf.setSize(400, 150);
		
		l1 = new JLabel("\nEnter Name : ");
		l2 = new JLabel("\nEnter City");
		
		tf1 = new JTextField(15);
		tf2 = new JTextField(15);
		
		b1 = new JButton("Clear");
		b2 = new JButton("Submit");
		b3 = new JButton("Exit");
		
		//setting the positioning of the component in container.
		jf.setLayout(new FlowLayout());
		//and set the flowlayout
		jf.add(l1);
		jf.add(tf1);
		
		jf.add(l2);
		jf.add(tf2);
		
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		
		jf.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ATM_UI003();

	}

}
