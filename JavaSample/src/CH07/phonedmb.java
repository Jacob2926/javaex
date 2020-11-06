package CH07;

public class phonedmb extends phone {
	
	int channel;
	
	phonedmb(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOndmb() {
		System.out.println("채널"+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	void changeChanneldmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel +"번으로 바꿉니다.");
	}
	void turnOffdmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");	
	}

}
