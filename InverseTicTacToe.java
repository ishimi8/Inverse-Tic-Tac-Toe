import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class InverseTicTacToe {
	
	 public static void main(String args[]) {
		 JFrame window=new JFrame();
		 DrawPanel panel = new DrawPanel();
		 panel.addMouseListener(new ClickEvent(panel));
		 window.setContentPane(panel);
		 window.setSize(640,480);
		 window.setTitle("Window");
		 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 window.setVisible(true);
		 
	 }
	
}
