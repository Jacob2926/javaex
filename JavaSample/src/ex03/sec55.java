package ex03;

public class sec55 {
	public static void main(String args[]) {
		int[] coin = {500 ,100,50, 10};
		int money = 2680;
		
		System.out.println("money="+money);
		
		for(int i=0; i<coin.length; i++) {
		
		System.out.println(coin[i]+"원: "+money/coin[i]);
		
		money=money%coin[i];
		
		}
}
}