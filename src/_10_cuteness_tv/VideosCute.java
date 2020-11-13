package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VideosCute implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton duck = new JButton();
JButton frog = new JButton();
JButton fluffy = new JButton();
	public void showButton() {
		// TODO Auto-generated method stub
		frame.show(true);
		frame.add(panel);
		panel.add(duck);
		panel.add(frog);
		panel.add(fluffy);
		
		frame.setTitle("What Video Do You Want?");
		frog.setText("Frogs");
		duck.setText("Ducks");
		fluffy.setText("Fluffy Unicorns");
	
		frame.pack();
		duck.addActionListener(this);
		frog.addActionListener(this);
		fluffy.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
JButton clicked = (JButton) e.getSource();
		
	if(clicked == duck) {
		showDucks();
	}
	else if(clicked == frog) {
		showFrog();
	}
	else if(clicked == fluffy) {
		showFluffyUnicorns();
	}
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
