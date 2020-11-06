package CH06;

public class EX1 {

	public static void main(String[] args) {
				
		int [] gong = new int[45];
		
		for(int i = 0; i<gong.length; i++)
			gong[i] = i+1;
		
		int temp = 0;
		int j= 0;
		
		for(int i =0; i <4; i++) {
			j = (int)(Math.random() * 4 );
				temp = gong[i];
				gong[i] = gong[j];
				gong[j] = temp;
		}
		for (int i =0; i <1; i++)
			
			System.out.printf("%d%n",gong[i]);
		}

	}

