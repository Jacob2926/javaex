//package CH05;
//
//public class Exam003 {
//	public static void main(String[] arge) {
//		int sum=0;
//		
//		for(int i =1; i<=10; i++) {
//			sum += i;
//			System.out.printf("1부터 %d 까지의 합: %d%n",i,sum);
//		}
//		
//	}
//}												

package CH05;				//	%ºd º = 숫자 수 만큼 자리확보 & 스페이스 자리맞춤

public class Exam003 {
	public static void main(String[] arge) {
		int sum=0;
		
		for(int i =1; i<=10; i++) {
			sum += i;
			System.out.printf("1부터 %4d까지의 합: %4d%n",i,sum);
		}
		
	}
}
