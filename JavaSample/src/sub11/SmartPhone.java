package sub11;

public abstract class SmartPhone{
	public String owner;
	
	
	public SmartPhone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

}
