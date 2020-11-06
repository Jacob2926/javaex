package CH07;

class test1 {

	public static void main(String[] args) {
		Tv t; // tv 라는 클래스에서 사용하기 위해 t라는 참조변수 지정해줌
		t = new Tv(); // new로인해 초기화및 클래스에 빈공간 메모리 생성 및 t 에 저장
		t.channel = 12; // t 채널을 (" @ ") 로 설정 해준다
		t.channelDown(); // 채널 증가 및 감소 channelUP or channelDown
		System.out.println("현재 채널은 " + t.channel + "채널 입니다.");

	}

}
