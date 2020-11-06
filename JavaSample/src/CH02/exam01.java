package CH02;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] arge) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용 :"+num);
		System.out.printf("num=%d%n", num);
		
		
		System.out.println("두번째 정수를 입력해주세요.>");
		String input1 = scanner.nextLine();		
		int num1 = Integer.parseInt(input1);
		

		System.out.println("입력내용 :"+num1);
		System.out.printf("num1=%d%n",num1);
		
		
		int hap ;
		hap = num + num1 ;
		int gob;
		gob = num* num1 ;
		int na;
		na = num/ num1 ;
		int cha;
		cha = num - num1;
	
		System.out.printf("더하기 결과 : %d%n", hap);
		System.out.printf("곱하기 결과 : %d%n", gob);
		System.out.printf("나누기 결과 : %d%n", na);
		System.out.printf("빼기 결과 : %d%n", cha);
		
	}	
		
	
}
