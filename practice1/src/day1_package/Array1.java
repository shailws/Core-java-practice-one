package day1_package;

public class Array1 {
	public static void main(String[] args) {
		Array1.sum(new int[][][]{{{10,20,30},{10,30},{20,10,20}}});
	}

	static void sum(int[][][] no) {
	for(int i[][] : no) {
		for(int ii[] :i) {
			for(int iii : ii) {
				System.out.print(iii+" ");
			}
			System.out.println();
		}
	}
	
	}
}
