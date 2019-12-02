package input;

import java.util.Scanner;

public class Questions {
	
	int i = 0;
	int j = 0;
	int k = 0;
	String it = "Italian";
	String am = "American";
	String mx = "Mexican";
	String in = "Indian";
	String country = "empty";
	
	public void firstQuestion() {
		
		System.out.println("What is your favourite food?");
		
		while (i == 0) {
			
			Scanner input = new Scanner(System.in);
			String userResponse = input.nextLine();
			userResponse = userResponse.toLowerCase();
			
			if (userResponse.equals("pasta")) {
				i = 1;
			} else if (userResponse.equals("burgers")) {
				i = 2;
			} else if (userResponse.equals("tacos")) {
				i = 3;
			} else if (userResponse.equals("curry")) {
				i = 4;
			} else {
				System.out.println("Invalid input, please try again");
			}			
		}
		
		switch(i) 
        { 
            case 1: 
                System.out.println("Is your favorite food Italian?"); 
                break; 
            case 2: 
                System.out.println("Is your favorite food American?"); 
                break; 
            case 3: 
                System.out.println("Is your favorite food Mexican?"); 
                break;
            case 4: 
                System.out.println("Is your favorite food Indian?"); 
                break;
            default: 
                firstQuestion();
                break;
        } 
	}
	
	public String secondQuestion() {
		
		while (j == 0) {
			
			Scanner yesNoInput = new Scanner(System.in);
			String userResponse = yesNoInput.nextLine();
			userResponse = userResponse.toLowerCase();
			
			if (userResponse.equals("yes")) {
				switch (i)
				{
				case 1:
					country = it;
					System.out.println("italian restaurant");
					return country;
				case 2:
					country = am;
					System.out.println("american restaurant");
					return country;
				case 3:
					country = mx;
					System.out.println("mexican restaurant");
					return country;
				case 4:
					country = in;
					System.out.println("indian restaurant");
					return country;		
				default:
					return " ";
				}
			} else if (userResponse.equals("no")) {
				i=0;
				firstQuestion();
			} else {
				System.out.println("Invalid input, please try again");
			}			
		}
		return country;		
	}
	
	public void restartQuestion() {
		
		System.out.println("There are no recommendations for you currently in our DB. Would you like to enter another food?");
		while (k == 0) {
			Scanner yesNoInput = new Scanner(System.in);
			String userResponse = yesNoInput.nextLine();
			userResponse = userResponse.toLowerCase();
			
			if (userResponse.equals("yes")) {
				firstQuestion();
			} else if (userResponse.equals("no")){
				System.out.println("Goodbye");
			}
		}
		
	}
}