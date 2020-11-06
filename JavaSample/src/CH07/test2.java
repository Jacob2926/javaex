package CH07;

class test2 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "채널 입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "채널 입니다.");
		t2 = t1;

		t1.channel = 12;

		System.out.println("t1의 channel값을 12로 변경하였습니다.");
		System.out.println("t1의 channel값은 " + t1.channel + "채널 입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "채널 입니다.");

	}

}
