package questions.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questions
{
	private Scanner questionScanner;
	private Scanner moreQuestionScanner;
	
	public Questions()
	{
		questionScanner = new Scanner(System.in);
		moreQuestionScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		//askQuestions();
		//askMoreQuestions();
		askQuestionsGUI();
	}

	private void askQuestionsGUI()
	{
		JOptionPane.showMessageDialog(null, "Hi what's your name? ");
		String answerGUI = JOptionPane.showInputDialog("Hi what's your name?");
		answerGUI = JOptionPane.showInputDialog("" + answerGUI + " that's a nice name! How are you today?");
		answerGUI = JOptionPane.showInputDialog("ah me too im feeling pretty " + answerGUI + " myself. Did you know the new tailer for the new Hunger Games came out yesterday?");
		answerGUI = JOptionPane.showInputDialog(""+ answerGUI + " dude really? what's your problem bruh?");
		answerGUI = JOptionPane.showInputDialog("Well I suppose that makes us friends!" );
		answerGUI = JOptionPane.showInputDialog("Well be friends forever. But for now I have to go!");
		
		
		
	}
	private void askQuestions()
	{
		System.out.println("What is your name?");
		String answer = questionScanner.nextLine();
		System.out.println("Why, hello there "+ answer + " How are you today?");
		questionScanner.nextLine();
		answer = questionScanner.nextLine(); 
		System.out.println("you feel like "+ answer + ". Uhh that's nice. What is your favorite animal?");
		questionScanner.nextLine();
		answer = questionScanner.nextLine();
		System.out.println("Your favorite animal is a " + answer + ". Well I am a bird person.");
		questionScanner.nextLine();
		answer = questionScanner.nextLine();
		System.out.println("What brings you here?");
		questionScanner.nextLine();
		answer = questionScanner.nextLine();
		System.out.println("Oh, yes that's right. How old are you?");
		questionScanner.nextLine();
		answer = questionScanner.nextLine();
		System.out.println(answer + "? Woww you're getting up there! Goodbye now!");
		questionScanner.nextLine();
		answer=questionScanner.next();
		if(answer.equals("why?"))
		{
			System.out.println("Don't leave me!!");
		}
		else
		{
			System.out.println("Yay I am all by myself! woo!");
		}
	}
	private void askMoreQuestions()
	{
		System.out.println("Wait so how old are you?");
		String age = null;
		String input = age;
		Scanner s = new Scanner(input).useDelimiter ("\\s*age\\s*");
		System.out.println(s.nextInt());
	}
	
	
}
