package CH04;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		int ko = 0 ;
		int ki = 0 ;
//		int ha,na,be,go;
		char combo= ' ';
		
		System.out.print("첫번째 점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		ko = scanner.nextInt();

		System.out.printf("첫번째 점수는 %d입니다.%n",ko);
		

		
		System.out.printf("두번째 점수를 입력하세요.>");
		ki = scanner.nextInt();
	
		
		System.out.printf("두번째 점수는 %d입니다.%n",ki);

		
		System.out.printf("연산자를 입력하세요.>");
		combo = scanner.next().charAt(0);
		
		
		System.out.printf("연산자는 %s 입니다.%n",combo);
		
//		ha = ko + ki ;
//		na = ko / ki ;
//		be = ko - ki ;
//		go = ko * ki ;
		
		if(combo == '+') {
			System.out.printf("%d %s %d = %d ", ko ,combo,ki, ko + ki );
		}
		if(combo == '-') {
			System.out.printf("%d %s %d = %d ", ko ,combo ,ki, ko - ki  );
		}
		if(combo == '*') {
			System.out.printf("%d %s %d = %d ", ko ,combo,ki,  ko * ki );
		}	
		if(combo == '/') {
			System.out.printf("%d %s %d = %d ", ko ,combo,ki, ko / ki );
		}
		if(combo == '%') {
			System.out.printf("%d %s %d = %d ", ko ,combo,ki, ko % ki );
		}
	}

}
