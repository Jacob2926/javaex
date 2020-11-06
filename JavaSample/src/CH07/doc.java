package CH07;

class doc1 {
	static int count = 0;
	String name;
	
	doc1(){
		this("제목업음" + ++count);
	}
	doc1(String name){
		this.name = name;
		System.out.println("문서"+this.name +"가 생성되었습니다.");
	}
}


class doc{
	public static void main(String args[]) {
		doc1 d1 = new doc1();
		doc1 d2 = new doc1("자바.txt");
		doc1 d3 = new doc1();
		doc1 d4 = new doc1();
		
	}
}