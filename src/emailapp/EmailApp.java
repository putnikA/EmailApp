package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner in = new  Scanner(System.in);
		System.out.print("First name: ");
		String inFirstName = in.nextLine();
		System.out.print("Last name: ");
		String inLastName = in.nextLine();
		
		Email em1 = new Email(inFirstName, inLastName);
		System.out.println(em1.showInfo());
	}
}
