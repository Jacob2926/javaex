package CH07;

class block {
	static {
		System.out.println("static{ }");
	}
	{
		System.out.println("{ }");
	}
	
	public block() {
		System.out.println("생성자");
	}
	
	public static void main(String args[] ){
		System.out.println("block bt = new block (); ");
		block bt = new block();
		
		System.out.println("block bt2 = new block (); ");
		block bt2 = new block();
		
		
	}
}