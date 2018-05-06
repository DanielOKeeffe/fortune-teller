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
		System.out.println("For example January would be 1, February would be 2 and so on.");
		int birthMonth = input.nextInt();
		input.nextLine();

		String favoriteColor;
		System.out.println("Enter your favorite ROYGBIV color. Type \"Help\" for a list of ROYGBIV colors.");
		favoriteColor = input.nextLine();
		if (favoriteColor.equalsIgnoreCase("help")) {
			System.out.println("R stands for red");
			System.out.println("O stands for orange");
			System.out.println("Y stands for yellow");
			System.out.println("G stands for green");
			System.out.println("B stands for blue");
			System.out.println("I stands for indigo");
			System.out.println("V stands for violet");
			favoriteColor = input.nextLine();
		}

		System.out.println("Enter your number of siblings.");
		int numberOfSiblings = input.nextInt();

		input.close();

		int retirementYears;
		if (age % 2 == 0) {
			retirementYears = 69;
		} else {
			retirementYears = 34;
		}

		String vacationLocation;
		if (numberOfSiblings < 0) {
			vacationLocation = "the Sun";
		} else if (numberOfSiblings == 0) {
			vacationLocation = "Gary, Indiana";
		} else if (numberOfSiblings == 1) {
			vacationLocation = "San Diego, California";
		} else if (numberOfSiblings == 2) {
			vacationLocation = "Austin, Texas";
		} else if (numberOfSiblings == 3) {
			vacationLocation = "Pittsburgh, Pennsylvania";
		} else {
			vacationLocation = "Buffalo, New York";
		}

		String modeOfTrans;
		if (favoriteColor.equalsIgnoreCase("red")) {
			modeOfTrans = "city bus";
		} else if (favoriteColor.equalsIgnoreCase("orange")) {
			modeOfTrans = "bicycle";
		} else if (favoriteColor.equalsIgnoreCase("yellow")) {
			modeOfTrans = "sports car";
		} else if (favoriteColor.equalsIgnoreCase("green")) {
			modeOfTrans = "space shuttle";
		} else if (favoriteColor.equalsIgnoreCase("blue")) {
			modeOfTrans = "submarine";
		} else if (favoriteColor.equalsIgnoreCase("indigo")) {
			modeOfTrans = "high speed rail";
		} else if (favoriteColor.equalsIgnoreCase("violet")) {
			modeOfTrans = "motorcycle";
		} else {
			modeOfTrans = "walking";
		}

		String bankBalance;
		if (0 < birthMonth && birthMonth <= 4) {
			bankBalance = "$12,345.00";
		} else if (4 < birthMonth && birthMonth <= 8) {
			bankBalance = "$1,000,000.32";
		} else if (8 < birthMonth && birthMonth <= 12) {
			bankBalance = "$45,000.00";
		} else {
			bankBalance = "$0.00";
		}

		System.out.println(firstName + " " + lastName + " will retire in " + retirementYears + " years with "
				+ bankBalance + " in the bank, a vacation home in " + vacationLocation + ", and travel by "
				+ modeOfTrans + ".");

	}
}