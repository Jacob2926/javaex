package CH03;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] arge) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("총 금액 입력.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력 금액 :"+num+'원');		
		
		System.out.println("출금할 금액.>");
		String input1 = scanner.nextLine();		
		int num1 = Integer.parseInt(input1);		

		System.out.println("출금할 금액 :"+num1+'원');

		int na;
		na = num/ num1 ;
		int mok;
		mok = num % num1;
		int nagob;
		nagob = na * num1;
		
		
		if( num1 ==10000) {
		System.out.printf("%d원으로 전부 출금할시 : %d장  : %d 원%n",num1, na, nagob);
		System.out.printf("출금시 잔액 : %d원%n", mok);
		}
		 else if( num1 ==5000) {
			System.out.printf("%d원으로 전부 출금할시 : %d장  : %d 원%n",num1, na, nagob);
			System.out.printf("출금시 잔액 : %d원%n", mok);
			}
			
		 else if(num1 == 1000) {
			System.out.printf("%d원으로 전부 출금할시 : %d장  : %d 원%n",num1, na, nagob);
			System.out.printf("출금시 잔액 : %d원%n", mok);
			}
			
		 else if(num1 == 500) {
			System.out.printf("%d원으로 전부 출금할시 : %d개  : %d 원%n",num1, na, nagob);
			System.out.printf("출금시 잔액 : %d원%n", mok);
			}
			
		 else if(num1 == 100) {
			System.out.printf("%d원으로 전부 출금할시 : %d개  : %d 원%n",num1, na, nagob);
			System.out.printf("출금시 잔액 : %d원%n", mok);
			}
		
	}	
		

}
