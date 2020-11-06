package CH06;

public class Ex3 {

	public static void main(String[] args) {
		int  [] [] a = new int[5] [5];
		int  [] [] b = new int[5] [5];
		int num=1;
		
		for(int i = 0; i< a.length; i++) {
			for(int j = 0; j< b.length; j++) {
				
				
			a[i][j] = num++;
			
			System.out.printf("%-2d ",a[i][j]);
			}
			
			System.out.println();
		}

	}
}
