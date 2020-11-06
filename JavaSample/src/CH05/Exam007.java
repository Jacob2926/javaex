
package CH05;

import java.util.*;

public class Exam007 {

	public static void main(String[] args) {
		int num =0;
		
		System.out.printf("*을 출력할 라인수 입력 >>>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		for(int i=5; i!=num;i--) {
			for (int j=1; j<=i; j++)  {
				System.out.printf("*%c", ' ');
				
			}
			
		System.out.println();

		}
		

	}

}
