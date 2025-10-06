package arrayss;

public class Oned {
	public static void main(String[] args) {
		Name n = new Name();
		n.abc();

		int[] arr = { 10, 20, 30, 10, 40, 30 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

					System.out.println(arr[i]);
				}
			}
		}

	}
}

class Name {
	public void abc() {

		char[] a1 = { 83, 72, 65, 73, 76, 69, 83, 72 };
		char[] a2 = { 85, 84, 75, 65, 82 };
		for (char aa : a1) {
			System.out.print(aa);
		}
		System.out.println();
		for (char aa : a2) {
			System.out.print(aa);
		}
		System.out.println();

		int size = a1.length + a2.length;

		char[] c = new char[size];

		for (int i = 0; i < a1.length; i++) {
			c[i] = a1[i];
		}
		for (int i = 0; i < a2.length; i++) {
			c[a1.length + i] = a2[i];
		}

		for (char aa : c) {
			System.out.print(aa);
		}
		System.out.println();
	}
}
