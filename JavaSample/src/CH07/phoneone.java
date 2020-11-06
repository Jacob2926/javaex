package CH07;

public class phoneone {
	
	public static void main(String[] args) {
		
		phonedmb Phonedmb = new phonedmb("자바폰","검정",5467894);
		
		System.out.println("모델:" + Phonedmb.model);
		System.out.println("색상:" + Phonedmb.color);
		System.out.println("채널:" + Phonedmb.channel);
		
		Phonedmb.powerOn();
		Phonedmb.bell();
		Phonedmb.sendVoice("여보세요");
		Phonedmb.receiveVoice("안녕하세요! 저는 홍길동인데요");
		Phonedmb.sendVoice("아~ 예 반갑습니다.");
		Phonedmb.hangUp();
		
		Phonedmb.turnOndmb();
		Phonedmb.changeChanneldmb(9999999);
		Phonedmb.turnOffdmb();
	}

}
