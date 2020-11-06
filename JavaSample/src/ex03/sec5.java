package ex03;

import java.util.*;

public class sec5 {

	public static void main(String[] args) {
		int an = (int) (Math.random() * 100) + 1;
		int in = 0;
		int co = 0;

		Scanner s = new Scanner(System.in);
				
		do {
			co++;
			System.out.print("숫자 입력 하셈:");
			in = s.nextInt();
			if (an > in) {
				System.out.println("더큰수 입력하셈");
			} else if (an < in) {

				System.out.println("더 작은수 입력하셈");
			} else {

				System.out.println("맞췄다......");

				System.out.println("시도횟수는" + co + "번임.");
				break;
			}
		} while (true);
	}
}
