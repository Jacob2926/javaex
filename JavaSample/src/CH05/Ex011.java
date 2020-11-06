package CH05;

public class Ex011 {

	public static void main(String[] args) {
		

		for (int i = 0; i <7; i++) {
			for (int j = 0; j < num; j++) {

				if (i <= num / 2) {
					if (i + j <= num / 2 + 1)
						System.out.print(" ");
					else if (j - i >= num / 2 + 1)
						System.out.print(" ");
					else
						System.out.print("*");

				}
				
			}
			System.out.println();
		}
	}
}