package CH07;
public class test7 {

	public static void showAll(String... vargs) {
		System.out.println("길이: " + vargs.length);

		for (String str : vargs) {
			System.out.print(str + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		showAll("A");
		showAll("A", "B");
		showAll("A", "B", "C");
		showAll("A", "B", "C", "D");
	}
}
