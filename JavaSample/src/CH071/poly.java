//package CH071;
//
// class poly {
//	 int price;
//	 int bonusPoint;
//	 
//	 poly(int price) {
//		 this.price = price;
//		 bonusPoint = (int)(price/10.0);
//	 }
//	 poly() {}
// }
// class Tv extends poly{
//	 Tv() {super(100);}
//	 public String toString() { return "Tv";}
// }
// class Computer extends poly{
//	 Computer() { super(200);}
//	 public String toString() { return "Computer";}
//	 
//	}
// class Audio extends poly {
//	 Audio() {super(50); }
//	 public String toString() {return"Audio";}
// }
// class Buyer{
//	 int money=1000;
//	 int bonusPoint = 0;
//	 poly[] item = new poly[10];
//	 int i = 0;
//	 
//	 void buy(poly p) {
//		 if(money<p.price) {
//			 System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
//			 return;
//		 }
//		 money -= p.price;
//		 bonusPoint +=p.bonusPoint;
//		 item[i++] = p;
//		 System.out.println(p+"을/를 구입하셧습니다.");
//	 }
//void summary() {
//	int sum=0;
//	String itemList="";
//	
//	for(int i =0; i <item.length; i++) {
//		if(item[i]==null)break;
//		sum+= item[i].price;
//		itemList+= item[i]+",";
//	}
//	System.out.println("구입하신 물품의 총금액은 " +sum+"만원입니다.");
//	System.out.println("구입하신 제품은 " +itemList+"입니다.");
//	
//	}
//}
//class poly1{
//	public static void main(String args[]) {
//	Buyer b = new Buyer();
//	
//	b.buy(new Tv());
//	b.buy(new Computer());
//	b.buy(new Audio());
//	b.summary();
//	}
//}