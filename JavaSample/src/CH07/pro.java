package CH07;

class protin {
	static int count = 0;
	int serialNo;
	{
		++count;
		serialNo = count;
	}

	public protin() {
	}
}

class pro {
	public static void main(String args[]) {
		protin d1 = new protin();
		protin d2 = new protin();
		protin d3 = new protin();

		System.out.println("d1의 제품번호(serial no)는 " + d1.serialNo);
		System.out.println("d2의 제품번호(serial no)는 " + d2.serialNo);
		System.out.println("d3의 제품번호(serial no)는 " + d3.serialNo);
		System.out.println("생산된 제품의 수는 모두 " + protin.count + "개입니다.");

	}
}
