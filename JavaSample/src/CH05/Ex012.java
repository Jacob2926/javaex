package CH05;

public class Ex012 {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < 7 - i; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j < 2 * i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		for (int i = 7; i >= 1; i--) {
			for (int j = 5; j < 7*2 -i ; j++) {

				System.out.print(" ");
			}
			for (int j = 3; j < 2 * i -2 ; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	
	}
}
