public class Armstrong {
	public static void main(String[] args) {
		int i = 0, a, temp;
		int n = 153;
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			i = i + (a * a * a);
		}
		if (temp == i)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
	}
}
