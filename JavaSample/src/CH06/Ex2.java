package CH06;

import java.util.Arrays;
import java.util.Collections;

public class Ex2 {

	public static void main(String[] args) {
		int score[] = {50, 40, 70, 30, 60};
		int rank[] = {1, 1, 1, 1, 1, 1,};
//		String[] num = new String[] {"A","B","C","D"};
		
		int i, j;
		
		Arrays.sort(score);
		Arrays.sort(rank);
//		Arrays.sort(num, Collections.reverseOrder());
		for(i=0; i<=4; i++) {
			for(j=0; j<=4; j++) {
				if(score[i]<score[j])
					rank[i]=rank[i]+1;
			}
		}
				
			System.out.print("점수 :");
			for(i=0; i<=4; i++) {
				System.out.printf("%3d",score[i]);
			}
			System.out.println();
			System.out.print("석차 :");
			for(i=0; i<=4; i++) {
				System.out.printf("%3d",rank[i]);
//				System.out.print(num);
			}
			
	}
}
