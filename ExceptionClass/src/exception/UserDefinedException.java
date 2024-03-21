package exception;

import java.util.Scanner;

public class UserDefinedException extends Exception{
	UserDefinedException(String errormsg){
		super(errormsg);
	}
	public static void main(String[] args) throws UserDefinedException {
		//throw new UserDefinedException("My exception");
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Eneter the age");
		int age = 12;
				//sc.nextInt();
		
		validate(age);
		
	}
	private static void validate(int age) throws UserDefinedException {
		//System.out.println(age+"Voter age is::");
		try {
		if(age<18) {
			//System.out.println("Elgible for ");
			throw new UserDefinedException("youa are not elgible for the Voting!!!!!");
		}
		else {
			System.out.println("Elgible---");
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Stament1234");
		
		
	}
}
