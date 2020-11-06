package ex03;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		String[] list = {"coin","computer","book","cake","ipad","pan"};
		Scanner sc = new Scanner(System.in);
		
//		char[] qe = list[i].toCharArray();
//		int bo =(int)(Math.random()+qe.length);
		
		for(int i=0; i<list.length; i++) {
			
			char[] qe = list[i].toCharArray();
			
			for(int j=0; j<qe.length; j++) {
				
				int bo =(int)(Math.random()*qe.length);
				char tr = qe[i];
				qe[i]=qe[bo];
				qe[bo]=tr;
			}
			System.out.printf("%d.%s 정답입력>>",i+1,new String(qe));
			
			String aa = sc.nextLine();
			
			if(list[i].equals(aa.trim()))
				System.out.printf("정답입니다.%n");
			else 
				System.out.printf("틀렸습니다.%n");
		}
	}
}
		
		
		
