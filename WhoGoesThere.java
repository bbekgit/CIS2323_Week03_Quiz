import java.util.Scanner;

public class WhoGoesThere{
	public static void main(String[] args){
	String firstname, lastname;
	int age;
	
	Scanner input = new Scanner(System.in);
	//Reading inputs
	System.out.println("Enter your First name: ");
	firstname = input.nextLine();
	System.out.println("Enter your Last name: ");
	lastname = input.nextLine();
	System.out.println("Enter your  age: ");
	age = input.nextInt();
	
	
	System.out.println("As long as you are over the age of " + (age - 10) + " then\n" +
		"you are free to pass, " + firstname + " " + lastname + ".");
	
	
	}
	
}