package ex01;

import java.util.*;

public class ex1 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("출력숫자");
		num= scanner.nextInt();
		
		
		for (int i =1; i<num; i++) {
			
		if ((i % 2)==0) {
		continue;
		}
		
		else if((i % 3)==0)
		{
			continue;
		}
			else {
				System.out.print(i+" ");
				sum+= i;
		
		}
	}
	}
}