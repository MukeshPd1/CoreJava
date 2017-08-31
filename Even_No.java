public class Even_No {

	public static void main(String[] args) {
		int even = 50;

		System.out.println("Printing Even numbers between 1 and " + even);
		for (int i = 1; i <= even; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
