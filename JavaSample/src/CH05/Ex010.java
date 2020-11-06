package CH05;

public class Ex010 {

	public static void main(String[] args) {
		int num = 11;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {

				if (i <= num / 2) {
					if (i + j <= num / 2 - 1)
						System.out.print(" ");
					else if (j - i >= num / 2 + 1)
						System.out.print(" ");
					else
						System.out.print("*");

				}
//				else if (i > num / 2 ) {
//				
//				}
//					if(i + j < num /2 - 1 )
//						System.out.print(" ");
//					
//					else if (j - i > num / 2-1)
//						System.out.print(" ");
//					else
//						System.out.print("*");
				
			}
			System.out.println();
		}
	}

}

//				
//			}
//			for (int a = 0; a < 5; a++) {
//				for (int b = 0; b <= a + 1; b++) {
//
//					System.out.print(" ");
