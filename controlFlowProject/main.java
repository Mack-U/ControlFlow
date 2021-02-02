package controlFlowProject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		ArrayList<String> questions = new ArrayList<>();
		questions.add("What is the name of your favorite pet? ");
		questions.add("What is your lucky number? ");
		questions.add("What is the jersey number of your favorite basketball/football player? ");
		questions.add("What is the first name of your favorite actor? ");
		questions.add("What year were you born? ");
	
		ArrayList<String> answers = new ArrayList <>();
		ArrayList<Integer> jackpot = new ArrayList<>();
		
		Scanner userInput1 = new Scanner(System.in);
		
//		System.out.println("Numbers:");
//		AsciiChars.printNumbers();
//		System.out.println("Lowercase letters:");
//		AsciiChars.printLowerCase();
//		System.out.println("Uppercase letters:");
//		AsciiChars.printUpperCase();

//	Scanner userInput1 = new Scanner(System.in);
	System.out.println("Enter your name:");
	String inputName = userInput1.nextLine();
	System.out.printf("Hello %s\n", inputName); 
	
	System.out.println("Do you wish to continue to the interactive portion? (Y/N)");
	String userResponse = userInput1.nextLine();
	
	if(userResponse.equalsIgnoreCase("Y") || userResponse.equalsIgnoreCase("yes")) {
	    for (String question : questions) {
	    	System.out.println(question);
	    	String resp = userInput1.nextLine();
			answers.add(resp);
	    }
	      
	} else { { 
		System.out.printf("Okay &s, please return later to complete the survey.\n", inputName);
		userInput1.close();
	    System.exit(0);
	}
    jackpot = genNumbers(answers);
	
	System.out.print("Your lottery numbers are: ");
    
	for(Integer lottoNumber : jackpot) {
		if(jackpot.indexOf(lottoNumber) < jackpot.size()-1) {
			System.out.printf("%d", lottoNumber);
		}else {
			System.out.printf("and the numbers are: %d", lottoNumber);
		}
	}}
	
	}
//	ArrayList answers;
//	Object jackpot = genNumbers(answers, jackpot);
//	Scanner userInput;
//	userInput.close();

 private static ArrayList<Integer> genNumbers(ArrayList<String> ansStrings) { ArrayList<Integer> numbers = new ArrayList<>();
    
	 Random random = new Random();
	 random.nextInt(75);
	 random.nextInt(75);
	 random.nextInt(75);
 
 
    if(ansStrings.get(0).length()> 2) {
    	ansStrings.get(0).charAt(2);
//		System.out.println("Numbers:");
//		AsciiChars.printNumbers();
//		System.out.println("Lowercase letters:");
//		AsciiChars.printLowerCase();
//		System.out.println("Uppercase letters:");
//		AsciiChars.printUpperCase();
    }
    
	return numbers;
 
 
 
 
 }}
