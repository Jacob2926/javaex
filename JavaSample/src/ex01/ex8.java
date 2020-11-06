package ex01;

public class ex8 {

	public static void main(String[] args) {
		String str = "12345";
		int num = 0;
		
		for(int i=0; i<str.length(); i++) {
			int c = str.charAt(i)-48;
			
			System.out.println("c= " +c);
			
			num+= c;
			
			System.out.println("num= "+num);
		}
		
		

	}

}
