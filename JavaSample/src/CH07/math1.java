package CH07;

public class math1 {

	public static void main(String[] args) {
		math mm = new math();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);


		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);

	}

}




//
//class math2 {
//
//	public static void main(String[] args) {
//		
//		System.out.println(math.add(5L, 3L));
//		System.out.println(math.subtract(5L, 3L));
//		System.out.println(math.multiply(5L, 3L));
//		System.out.println(math.divide(5L, 3L));