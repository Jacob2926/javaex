package CH07;

class test12 {
	int iv = 10;
	static int cv = 20;

	int iv2 = cv;
	static int cv2 = new test12().iv;

	static void staticMethod1() {
		System.out.println(cv);
		test12 c = new test12();
		System.out.println(c.iv);
	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}

	static void staticMethod2() {
		staticMethod1();
		test12 c = new test12();
		c.instanceMethod1();
	}

	void instanvceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}