public class hw15_5 {
	public static void main(String args[]) {
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("Good bye");
		CTest morning = new CTest("Good morning");
		CTest night = new CTest("Good night");
		hi.start();
		bye.start();
		morning.start();
		night.start();
	}
}