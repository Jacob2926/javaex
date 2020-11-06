package CH07;

public class ins1 {

	public static void main(String args[]) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		if(fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		System.out.println(fe.getClass().getName());
	}
	
	
}
//class Car{}
//class FireEngine extends Car{}