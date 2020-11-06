package CH02;

public class Sample7 {
	public static void main(String[] arge) {
		short sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;
		
		char ch ='a';
		System.out.println("A = "+ ch);
		System.out.println("A = "+ (int)(ch));	
		
		int a = 65;
		System.out.println("A = "+ a);
		System.out.println("A = "+ (char)a);
		
		System.out.println("sMin = "+ sMin);
		System.out.println("sMin-1 = "+(short)(sMin-1));
		System.out.println("sMax = "+ sMax);
		System.out.println("sMax+1 = "+(short)(sMax+1));
		System.out.println("cMin = "+ (int)cMin);
		System.out.println("cMin-1 = "+(int)--cMin);
		System.out.println("cMax = "+ (int)cMax);
		System.out.println("cMax+1 = "+ (int)++cMax);
	
	}
}