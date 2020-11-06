package CH07;
class test5 {

	public static void main(String[] args) {
		firstMethod();
	}
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}

}

