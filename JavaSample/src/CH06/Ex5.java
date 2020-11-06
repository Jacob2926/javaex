package CH06;

public class Ex5 {

	public static void main(String[] args) {
		
		int array[][] = new int[5][5];
		
		int row,col;
		
		int i=1;
		
		for(row=0; row<5; row++) {
			
			if(row%2==0) {
				for(col=0;col<5;col++) {
					array[row][col]=i++;
				}
				
			}else {
				for(col=0;col<5;col++) {
					array[row][4-col]=i++;
				}
			}
		}
		for(row=0;row<5;row++) {
			for(col=0;col<5;col++) {
				System.out.printf("%3d",array[row][col]);
			}
			System.out.println();
		}

		
			
	}

}
