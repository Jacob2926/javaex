package CH06;

import java.util.Scanner;

public class Array02 {

	
	public static void main(String[] args) {
		
		int num = 0;
		int go = 0;
		
		System.out.printf("출력할 숫자 >>>>>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
			
		for(int i=0;  i<=num ; i++) {
			go += i;
			System.out.printf("출력s %d, %d%n",i , go	);
		}
			

		
	}

}
