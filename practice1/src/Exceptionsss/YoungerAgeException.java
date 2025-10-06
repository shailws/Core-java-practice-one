package Exceptionsss;

import java.util.Scanner;

public class YoungerAgeException extends RuntimeException {
	public YoungerAgeException(String msg) {
		super(msg);
	}
}

class Voting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");

		int age = sc.nextInt();

		try {
			if (age < 18) {
				throw new YoungerAgeException("Your are not eligible for voting");
			} else {
				System.out.println("you are eligible for vote");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Hello");
	}
}