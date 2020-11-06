package ex03;

public class sec52 {

	public static void main(String[] args) {
		int num = 12321;
		int ti = num;
		int result=0;
		
		while(ti !=0) {
			result = result*10+ti%10;
			ti/=10;
		}
		if(num ==result)
			System.out.println(num+"회문수");
		else
			System.out.println(num+"회문수 아니다.");

	}
}

