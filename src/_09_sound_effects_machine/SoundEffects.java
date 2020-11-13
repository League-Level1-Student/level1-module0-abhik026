package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	AudioClip sound;
	public void showButton() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		button1.setText("Machine Gun");
		button2.setText("Wood");
		button3.setText("Harley");
		
		frame.pack();
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton) e.getSource();
		
		if(clicked == button1) {
		playSound("Automatic Machine Gun-SoundBible.com-253461580.wav");
		System.out.println("gun");
		}
		else if (clicked == button2) {
			playSound("sawing-wood-daniel_simon.wav");
			System.out.println("wood");
		}
		else if(clicked == button3) {
			playSound("harley-davidson-daniel_simon.wav");
			System.out.println("bike");
		}
}


	private void playSound(String fileName) {
	    if(sound != null) {
	    	sound.stop();
	    }
		sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	    sound.play();
	}
}