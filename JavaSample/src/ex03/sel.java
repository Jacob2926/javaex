package ex03;

import java.util.*;

public class sel {

	public static void main(String[] args) {
//		String[] me = {"1. Americano 1500",
//				"2. Latte 2000",
//				"3. Espresso 1700",
//				"4. Mocha 2500",
//				"5. 식혜 2000",
//				"6. 수정과 1900" };
		int menu = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Americano 1500");
			System.out.println("2. Latte 2000");
			System.out.println("3. Espresso 1700");
			System.out.println("4. Mocha 2500");
			System.out.println("5. 식혜 2000");
			System.out.println("6. 수정과 1900");
			System.out.print("원하는 메뉴 (1 ~ 6) 선택해주세요 (종료는0번)>>>>>");
			
			
			String tp = sc.nextLine();
			menu = Integer.parseInt(tp);
			
			
			if(menu ==0) {
				System.out.println("주문을 종료합니다.");
				break;
			}else if (!(1<=menu && menu <=6));
			System.out.println("주문하신 메뉴번호는"+menu+"번 입니다.");
			continue;
		}
		
		
		
		

	}

}
