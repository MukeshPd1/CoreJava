public class Oops {

	void display() {
		System.out.println("This is first oops program");
	}

	void show() {
		System.out.println("show");
	}

	public static void main(String[] args) {
		Oops s = new Oops(); // instantiation

		s.display();// Method calling with object or reference variable
		s.show();
	}
}
