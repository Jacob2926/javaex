package CH04;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ' ;
		
		System.out.printf("숫자를 하나 입력하세요.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		int a =ch;
		
		if(ch < 100)  {
			System.out.printf("100보다 작군요...\n");
		}
		else if (ch < 200) {
			System.out.printf("안보이지롱ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ\n");
		}
		
		else			
			System.out.printf("끝 종료\n");		
		
	}	

}
