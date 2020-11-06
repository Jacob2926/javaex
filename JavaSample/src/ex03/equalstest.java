package ex03;

public class equalstest {

	public static void main(String[] args) {
	     Thread t1 = new Thread(); 
	        Thread t2 = new Thread(); // 새로운 객체 생성. 즉, s1과 다른 객체. 
	        Thread t3 = t1; // 같은 대상을 가리킨다.
	        // String 객체 
	        String s1 = new String("WORLD"); 
	        String s2 = new String("WORLD"); 
	        /* --print-- */
	        System.out.println(t1 == t3); // true
	        System.out.println(t1 == t2); // false(서로 다른 객체이므로 별도의 주소를 갖는다.)
	        System.out.println(t1.equals(t2)); // false
	        System.out.println(s1.equals(s2)); // true(모두 "WORLD"라는 동일한 내용을 갖는다.)
	    } 
	} 


