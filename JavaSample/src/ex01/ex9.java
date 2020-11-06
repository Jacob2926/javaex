package ex01;

public class ex9 {

	public static void main(String[] args) {
		int sum = 12345;
		int num = 0;
		
		while (sum>0) {	
			
			num += sum %10;
		
			sum/=10;
		
			System.out.println("num= " +num);
						
			System.out.println("sum= "+sum);
		}

	}

}
