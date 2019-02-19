// Filename: QuizNcaa.java
// Author: Guy
// Date: 2/5/2019
// Simple quiz application that will ask the user 5 questions, the user can pick from a set list of 5 possible answers. Display a congratulatory message if the user guesses right. an error message if they get it wrong. Tally up all correct guesses and display score summary at the end.

import javax.swing.JOptionPane;

public class QuizNcaa
{
	public static void main(String[] args)
	{
			// Variables and constants
			
			int answer; // for the user's response
			int correct = 0;
			
			// Variables for the questions
			
			String q1 = "What university did Michael Jordan attend ?";
			String q2 = "What university did Magic Johnson attend ?";
			String q3 = "What university did Kareem Abdul Jabbar attend ?";
			String q4 = "What university did Patrick Ewing attend ?";
			String q5 = "What university did Larry Bird attend ?";
			
			// Variables for the answers
			
			String a1 = "UNC";
			String a2 = "MSU";
			String a3 = "UCLA";
			String a4 = "Georgetown";
			String a5 = "Indiana St";
			
			// Variable for the  answer list
			
			String answerList = "(1)  " + a1 + "\n" +
								"(2)  " + a2 + "\n" +
								"(3)  " + a3 + "\n" +
								"(4)  " + a4 + "\n" +
								"(5)  " + a5 + "\n";
								
			// Constant for number of questions in the quiz
			final int TOTAL_Q = 5;

			// ________________ QUESTION 1 _________________
			
		answer = Integer.parseInt(JOptionPane.showInputDialog(null, q1 + "\n" + answerList));
		
		// While loop that checks for valid responses
		while(answer < 1 || answer > 5)
		{	
			answer = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose a valid answer.\n" +q1 + "\n" + answerList));
		}
		
		// If statement that checks for a correct response
		if(answer == 1)
		{
			JOptionPane.showMessageDialog(null, "Congrats! You got that one right!");
			correct++; // adds one point to the user's score
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, you got that one wrong! \nThe correct answer was " + a1);
		}
		
		
		// ____________________________ Question 2 _____________________________
		answer = Integer.parseInt(JOptionPane.showInputDialog(null, q2 + "\n" + answerList));
		
		// While loop that checks for valid responses
		while(answer < 1 || answer > 5)
		{	
			answer = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose a valid answer.\n" +q2 + "\n" + answerList));
		}
		
		// If statement that checks for a correct response
		if(answer == 2)
		{
			JOptionPane.showMessageDialog(null, "Congrats! You got that one right!");
			correct++; // adds one point to the user's score
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, you got that one wrong! \nThe correct answer was " + a2);
		}
		
		// _____________________________ Question 3 _______________________________
		answer = Integer.parseInt(JOptionPane.showInputDialog(null, q3 + "\n" + answerList));
		
		// While loop that checks for valid responses
		while(answer < 1 || answer > 5)
		{	
			answer = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose a valid answer.\n" +q3 + "\n" + answerList));
		}
		
		// If statement that checks for a correct response
		if(answer == 3)
		{
			JOptionPane.showMessageDialog(null, "Congrats! You got that one right!");
			correct++; // adds one point to the user's score
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, you got that one wrong! \nThe correct answer was " + a3);
		}
		
		// _________________________________ Question 4 _____________________________
		
		answer = Integer.parseInt(JOptionPane.showInputDialog(null, q4 + "\n" + answerList));
		
		// While loop that checks for valid responses
		while(answer < 1 || answer > 5)
		{	
			answer = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose a valid answer.\n" +q4 + "\n" + answerList));
		}
		
		// If statement that checks for a correct response
		if(answer == 4)
		{
			JOptionPane.showMessageDialog(null, "Congrats! You got that one right!");
			correct++; // adds one point to the user's score
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, you got that one wrong! \nThe correct answer was " + a4);
		}
		
		// __________________________________ Question 5 ____________________________________
		
		answer = Integer.parseInt(JOptionPane.showInputDialog(null, q5 + "\n" + answerList));
		
		// While loop that checks for valid responses
		while(answer < 1 || answer > 5)
		{	
			answer = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose a valid answer.\n" +q5 + "\n" + answerList));
		}
		
		// If statement that checks for a correct response
		if(answer == 5)
		{
			JOptionPane.showMessageDialog(null, "Congrats! You got that one right!");
			correct++; // adds one point to the user's score
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, you got that one wrong! \nThe correct answer was " + a5);
		}
		
		// Quiz is over, output a summary of the score
		
		JOptionPane.showMessageDialog(null, "QUIZ COMPLETE \nYou got " + correct + " question right out of " + TOTAL_Q + "\nYour score was " + (correct * 100 / TOTAL_Q) + "%");
	
	}
}	