package CH04;

import java.util.*;

public class Exam09 {
	public static void main(String[] arge) {
		System.out.printf("가위(1),바위(2),보(3) 중 하나를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int) (Math.random() *3 )+1;
		
		
		System.out.println("당신은"+user + "입니다.");
		System.out.println("컴은"+com + "입니다.");
		
		switch(user-com) {
		case 2: case -1:
			System.out.println("당신은 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겻습니다");
			}
		}
		
		
		
	}
