package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	
		public void showButton() {
           JFrame frame = new JFrame();
           frame.setVisible(true);
           JButton button = new JButton();
           frame.add(button);
           frame.pack();
           button.addActionListener(this);
           button.setSize(100,50);
          button.setText("Click For A Fortune");
          frame.pack();
		
		
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
	          int fortune = new Random().nextInt(5);
			
	         if(fortune ==0) {
	        	 JOptionPane.showMessageDialog(null, "A beautiful, smart, and loving"
	        	 		+ " person will be coming into your life.");
	         }
	         else if(fortune  == 1) {
	        	 JOptionPane.showMessageDialog(null, "A dubious friend may be an enemy in camouflage.");
	         }
	         else if(fortune  == 2) {
	        	 JOptionPane.showMessageDialog(null, "A faithful friend is a strong defense.");
	         }
	         else if(fortune  == 3) {
	        	 JOptionPane.showMessageDialog(null, "A feather in the hand is better than a bird in the air.");
	         }
	         else {
	        	 JOptionPane.showMessageDialog(null, "A fresh start will put you on your way.");
	         }
	         
			
			
		}
	



}


