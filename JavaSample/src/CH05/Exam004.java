package CH05;

public class Exam004 {
	public static void main(String[] arge) {
		int sum=0;
		int Ja = 0;
		int Ho = 0;
		int JJa = 0;
		int KKa = 0;

		
		for(int i =1; i<=10; i++) {
			sum += i;
		
			System.out.printf("1부터 %2d까지의 합: %2d%n",i,sum);
	
//		if(i %2==0) {
//			Ja += i;
//			System.out.printf("2부터 짝수 %4d까지의 합: %4d%n",i,Ja);
//		}
//			else if (i %2==1) {
//			Ho += i;
//			System.out.printf("3부터 홀수 %4d까지의 합: %4d%n",i,Ho);
//		}
			if(i %2==0) {
			JJa += i;
			System.out.printf("2부터 짝수 %2d까지의 합: %2d%n",i,JJa);
			}
			else if (i %2==1) {
			KKa += i;
			System.out.printf("1부터 홀수 %2d까지의 합: %2d%n",i,KKa);	
			}	
			
		}
		
		
		int Hap = JJa + KKa;

		System.out.printf("5번 문제 : 짝수합: %2d %n5번 문제 : 홀수합: %2d %n",JJa,KKa);
		System.out.printf("5번 문제 : %d + %d = %d%n",JJa,KKa,Hap);
		System.out.println("6번 문제 : 0 ~ 10 사이의 난수 1개 발생 : " + (int)(Math.random()*10));
}

}
