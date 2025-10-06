package Exceptionsss;

public class UnderAgeException extends RuntimeException {

	public UnderAgeException() {
		super("you are under age");
	}

	public UnderAgeException(String msg) {
		super(msg);
	}
}

class Voting {
	public static void main(String[] args) {
		int age = 17;

		try {
			if (age < 18) {
				throw new UnderAgeException("unable to voting now you");
			} else {
				System.out.println("you can vote now");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}
