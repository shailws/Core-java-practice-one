package MTdemo;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter no: ");
//		int no = sc.nextInt();

		for (int i = 10; i <= 100; i++) {
			int temp = i;
			int rem = 0;
			int rev = 0;

			while (temp != 0) {
				rem = temp % 10;
				rev = rev * 10 + rem;
				temp = temp / 10;
			}
			if (i == rev) {
				System.out.println(i);
			} 
		}
	}
}
