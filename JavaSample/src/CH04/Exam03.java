package CH04;

public class Exam03 {
	public static void main(String[] arge) {
		int x= 0;
		System.out.printf("x=%d 일떄 , 참인 것은%n", x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==)");
		if(!(x!=0)) System.out.println("!(x!=)");
		System.out.println();
		
		x = 1;
		System.out.printf("x=%d 일때, 참인 것은%n", x);
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==)");
		if(!(x!=0)) System.out.println("!(x!=)");		
		
	}
	
	
	
}
