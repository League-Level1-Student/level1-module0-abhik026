package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizWindow.setSize(400,400);
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String image =("https://lh3.googleusercontent.com/proxy/LXF-t3Pd_QINkp7rwIIFQ9HKYZzYgVqI8UrQ1fMjxH1eml3CkZn4CT9Skht_NOvG7SjeTHjfGyAF77BEH70cjh3dnPlCjTzHQCXilbMBW4o_4X3NdbpSVcP7i23Gj0301lzuSQMZ9WIJrPrZAg");
		
		
		
		// 2. create a variable of type "Component" that will hold your image
		Component x;
		// 3. use the "createImage()" method below to initialize your Component
		x = createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(x);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
	String q1 =	JOptionPane.showInputDialog("Who do the Steelers play this weekend?(Team Name ONLY not city");
		if(q1.equalsIgnoreCase("titans")){
			System.out.println("CORRECT");
			quizWindow.remove(x);
		}
		else{
			System.out.println("INCORRECT");
			quizWindow.remove(x);// 7. print "CORRECT" if the user gave the right answer
		}

		// 8. print "INCORRECT" if the answer is wrong
		
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)
		String image2 = ("https://media.thenationaldigest.com/wp-content/uploads/2020/08/10153419/Football-on-Field-400x400-1.jpg");
		
		// 11. add the second image to the quiz window
		Component y;
		y = createImage(image2);
		quizWindow.add(y);
		quizWindow.pack();
		// 12. pack the quiz window
		String q2 = JOptionPane.showInputDialog("when was this game first played?(YEAR)");
		if(q2.equalsIgnoreCase("1869")) {
			System.out.println("CORRECT");
		}
		else{
			System.out.println("INCORRECT");// 13. ask another question
		}

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
