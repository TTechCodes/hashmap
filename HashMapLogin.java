package hash;

import java.util.Scanner;

public class HashMapLogin {
public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		CustomerReg customerreg = new CustomerReg(); 
		Node node = new Node();
		
		System.out.println("***************************");
		System.out.println("Enter user Registration: ");
		
		//First Name
		System.out.println("Enter First Name: ");
		node.setFN(scanner.next());
		//Check First Name 
		while(!customerreg.isStringOnlyAlphabet(node.getFN())) {
			System.out.println("Letters only, please reenter first name");
			node.setFN(scanner.next());
		}
		
		//Last Name
		System.out.println("Enter Last Name: ");
		node.setLN(scanner.next());
		//Check Last Name 
		while(!customerreg.isStringOnlyAlphabet(node.getLN())) {
			System.out.println("Letters only, please reenter last name");
			node.setLN(scanner.next());
		}
		
		//Return Initials
		String init = customerreg.initials(node.getFN(), node.getLN());
		System.out.println(init);
		
		//User Name
		System.out.println("Create a Username:");
		node.setUN(scanner.next());
		System.out.println("User name:" + node.getUN());
		
		//Password
		System.out.println("Enter a password. Must contain at one least character symbol, UpperCase and LowerCase letter. Must be in between 8 to 20 characters");
		node.setPW(scanner.next());
		//Check Password
		while(!customerreg.isValidPassword(node.getPW())) {
		System.out.println("Re-enter a password. Must contain at one least character symbol, UpperCase and LowerCase letter. Must be in between 8 to 20 characters");
		node.setPW(scanner.next());
		}
		
		//Re-enter Password
		System.out.println("Reenter Password");
		String passwordTwo = scanner.next();
		//Check password equals re-entered password
		while(!passwordTwo.equals(node.getPW())) {
			System.out.println("Second entry does not match. Please reenter the password a second time");
			passwordTwo = scanner.next();
		}
		
		System.out.println("Registraion complete");
		System.out.println("***************************");
		
		//User Login Page
		customerreg.testLogin(scanner, node.getUN(), passwordTwo);

		scanner.close();
	}
}


