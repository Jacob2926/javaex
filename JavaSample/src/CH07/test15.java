package CH07;

public class test15 {

	public static void main(String[] args) {
		ar01 myCalcu = new ar01();
//		double result1 = myCalcu.areaRectangle(10);
		
		myCalcu.areaRectangle(100);
//		int tot;
//		tot = result1 + 100;
//		System.out.println("다른 값=" +tot);
//		
		double result2 = myCalcu.areaRectangle(10,20);

//		System.out.println("정사각형 넓이=" + result1);
		System.out.println("정사각형 넓이=" + result2);

	}

}
