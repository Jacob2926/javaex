package CH07;

public class cast {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.drive();
		car = fe;
//		car.water();
		
		fe2 = (FireEngine)car;
		fe2.stop();
	}
}

class Car{
	String color;
	int door;
	void drive() {
		System.out.println("drive, Brrrrrrrrrrrrrrrrrrrrrr~");
	}
	void stop() {
	System.out.println("stop!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");	
	}
}