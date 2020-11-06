package ex01;

public class ex10 {

	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean ct = true;

		for (int i = 0; i < value.length(); i++) {
			ch = value.charAt(i);

			System.out.println("ch" + ch);

			if (!('0' <= ch && ch <= '9')){

				ct = false;

				break;
			}
			
		}
		if (ct) {
			System.out.println("value는 숫자 " + value);

		} else {
			System.out.println("value는 숫자아니다" + value);
		}
	}
}
