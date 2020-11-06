package CH06;

class Array09 {
	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D'};
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);


		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		// abc num 목록을 전부 출력하고 목록만큼 합쳐서 출력한다.
		System.out.println(result);

	
		System.arraycopy(abc, 0, num, 0, abc.length);
		//abc 목록의 0번부터 num 에 집어넣고 num0번부터 abc목록 길이만큼 복사
		System.out.println(num);


		System.arraycopy(abc, 0, num, 6, 3);
		//abc 목록의 0번부터 num 에 집어넣고 num 6번부터 abc목록의 3개 복사
		System.out.println(num);
	}
}
