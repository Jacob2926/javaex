package ex01;

public class ex3 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;

		while (sum <= 100) {
			num++;
			
			if (num % 2 == 0) {
				sum = sum-num; 
			}
				
			else {
				sum += num;
			}
			

			System.out.println(
					"num" + num + " sum" + sum);

		}
		System.out.println();

		System.out.printf("num=" + num);

	}
}

