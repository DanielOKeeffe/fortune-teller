package fortuneTeller;

import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name.");
		String firstName = input.nextLine();
		
		System.out.println("Enter your last name.");
		String lastName = input.nextLine();
		
		System.out.println("Please enter your age.");
		int age = input.nextInt();
		
		System.out.println("Enter your birth number for your birth month.");
		System.out.println("For example January would be 1, February would be 2.");
		int birthMonth = input.nextInt();
		
		System.out.println("Enter your favorite ROVGBIV color. Type \"Help\" for a list of ROYGBIV colors.");
		String favoriteColor = input.nextLine();
		if favoriteColor.equalsIgnoreCase("help") {
			System.out.println("R stands for Red");
			System.out.println("O stands for Orange");
			System.out.println("Y stands for Yellow");
			System.out.println("G stands for Green");
			System.out.println("B stands for Blue");
			System.out.println("I stands for Indigo");
			System.out.println("V stands for Violet");
			
			
		}

	}

}
