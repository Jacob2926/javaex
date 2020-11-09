package ex03;

import java.util.Scanner;

public class sel1 {

	public static void main(String[] args) {
		int cnt = 0;
		int pay = 0;
		int amt = 0;
		int mok = 5;
//		int over = 0;
		String coffee;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.printf("%n음료 메뉴 - %n1.아메리카노\n2.라떼\n3.에스프레소\n4.모카\n5.식혜\n6.수정과\n");
			System.out.print("음료 주문하세요>> ");
			coffee = scanner.next();
			System.out.println("음료 " + coffee + " 선택 하셧습니다.");
			System.out.println("몇잔 드릴까요? ");
			cnt = scanner.nextInt();
			System.out.println(coffee + cnt + " 잔.");
			System.out.println("지불하실 금액을 입력해주세요.");
			pay = scanner.nextInt();
			System.out.println();
					
			if (cnt == 0) {
				System.out.println("주문을 종료합니다.");
				break;			
			} else if ("아메리카노".equals(coffee)) {
				amt = 1500;
			} else if ("식혜".equals(coffee)) {
				amt = 2500;
			} else if ("수정과".equals(coffee)) {
				amt = 1900;
			} else if ("라떼".equals(coffee)) {
				amt = 2000;
			} else if ("에스프레소".equals(coffee)) {
				amt = 1700;
			} else if ("모카".equals(coffee)) {
				amt = 2500;
				continue;
			}
			switch (coffee) {
			case "아메리카노":
				amt = 1500;
				break;
			case "라떼":
				amt = 2000;
				break;
			case "에스프레소":
				amt = 1700;
				break;
			case "모카":
				amt = 2500;
				break;
			case "식혜":
				amt = 2000;
				break;
			case "수정과":
				amt = 1900;
				break;
			}
			int bool = pay-amt*cnt;
			{
				if(cnt>=1) {
					--mok;
//					over = mok;
			}
				if (mok==0){
				System.out.println("오늘 판매 할당된 음료가 매진되었습니다.");
					break;
			}
			}
			
			System.out.println(coffee + cnt + " 잔.");
			System.out.println(amt * cnt + "원 입니다");
			System.out.println("지불 하신 금액 "+ pay +"원 입니다.");	
			System.out.println();
			System.out.printf("거스름돈 %d",bool ,"원 입니다.");
			System.out.println();
			System.out.println("오늘 음료를 판매 할수 있는  횟수가"+mok+"회남았습니다.");
			}
		}
	}

