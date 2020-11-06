package CH07;

class cope02 {

	String company;
	String model;
	String color;
	int $$$;

	cope02() {
		this("삼성자동차", "자가용", "빨강", 555555555);
	}

	cope02(cope02 c) {

		company = c.company;
		model = c.model;
		color = c.color;
		$$$ = c.$$$;
	}

	cope02(String company, String model, String color, int $$$) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.$$$ = $$$;
	}
}

class cope01 {
	public static void main(String[] args) {
		cope02 c1 = new cope02();
		cope02 c2 = new cope02(c1);

		System.out.println(
				"c1의 company=" + c1.company + ", model=" + c1.model + ", color=" + c1.color + ", $$$=" + c1.$$$+"원");
		System.out.println(
				"c2의 company=" + c2.company + ", model=" + c2.model + ", color=" + c2.color + ", $$$=" + c2.$$$+"원");
//			System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		c1.company = "현대";
		c1.model = "트럭";
		c1.color = "흰색";
		c1.$$$ = 999999999;
//			System.out.println("c1.company=100; 수행후");
//			System.out.println("c2.door=100; 수행후");
		c2.company = "기아자동차";
		c2.model = "벤";
		c2.color = "검은색";
		c2.$$$ = 99999999;

		
		System.out.println();
		System.out.println("c1의 company=" + c1.company + ", model=" + c1.model + ", color=" + c1.color + ", $$$=" + c1.$$$+"원");
		System.out.println();
		System.out.println("c2의 company=" + c2.company + ", model=" + c2.model + ", color=" + c2.color + ", $$$=" + c2.$$$+"원");

	}
}
