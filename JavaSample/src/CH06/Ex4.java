package CH06;

public class Ex4 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int num = 1;
		int row,col;
		int i =1;
		
		for (row=0; row<=5; row++) {
			
			for(col=0;col<=5;col++) {
			
				a[row][col]= i++;
				}
			System.out.printf(" %2d %d",a[row][col]);
			}
		System.out.println();
		}
		
	}

 // Line 11
//for (int i = 0; i < a.length; i++) {
//	for (int j = 0; j < b.length; j++) {
//
//		a[i][j] = num++;
//
//		System.out.printf("%-2d ", a[i][j]);
