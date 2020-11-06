package CH04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] arge) {
		
		
		
		
		System.out.print("입력 받을 수 >>>>>>>");
		
		Scanner scanner = new Scanner(System.in);
		
		int score= scanner.nextInt();
		
		if(score %2==0) {
			System.out.printf("%d는 짝수 입니다.",score);
			
		} else 
			System.out.printf("%d는 홀수 입니다.",score);
	
		
	}
	
	
}
