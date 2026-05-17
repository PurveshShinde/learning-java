package com.example.com;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATM_UI004 extends JFrame implements ActionListener {
	
	JFrame jf;
	JPanel pp;
	CardLayout cd;
	
	ATM_UI004()
	{
		jf = new JFrame("CardLayout Example");
		cd = new CardLayout();
		
		//creating two a main parent panel that will
		//contain two child panel
		JPanel cp1 = new JPanel();
		JPanel cp2 = new JPanel();
		
		//creating two parent buttons
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		
		//creating three child button but for numbers button
		JButton b3 = new JButton("1");
		JButton b4 = new JButton("2");
		JButton b5 = new JButton("3");
		
		//creating 4 child btn for alphabet btn
		JButton b6 = new JButton("A");
		JButton b7 = new JButton("B");
		JButton b8 = new JButton("C");
		JButton b9 = new JButton("D");
		
		//adding b3 b4 and b5 btna two CP1
		cp1.add(b3);
		cp1.add(b4);
		cp1.add(b5);
		
		//adding b6 b7 and b8 btna two CP2
		cp2.add(b6);
		cp2.add(b7);
		cp2.add(b8);
		
		//setting the positioning in parent panel that contains cp1 and cp2
		pp.setLayout(cd);
		
		//adding cp1 and cp2
		pp.add(cp1, "Numbers ");
		pp.add(cp2, "Alphabates");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		 //setting container JFrames layout
		jf.setLayout(new FlowLayout());
		
		//adding 2 main buttons to jframe
		//will remain commonly visible to all panels
		jf.add(b1);
		jf.add(b2);
		
		//adding parent panel in jframe
		jf.add(pp);
		
		jf.setSize(300, 200);
		jf.setVisible(true);

	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand() == "Numbers") {
			cd.show(pp, "Numbers");
		}
		else 
		{ 
			cd.show(pp, "Alphabates");
		}
	}
	public static void main(String [] args) {
		new ATM_UI004();
	}
}
