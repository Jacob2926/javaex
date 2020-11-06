package CH06;

public class Array05 {
	public static void main(String[] arge) {
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 =new int[3];

		for (int i = 0; i < ballArr.length; i++) {
			int j =(int) (Math.random() *ballArr.length)+1;
			int tmp = 0;
			
				System.out.println(ballArr[i]);
				System.out.println(ball3[i]);
			}
		}

	}

