package dynamic_dispatch;

public class Example {
	void print() {
		System.out.println("Example1 is printing...");
	}
	void name() {
		System.out.println("My name is Example One");
	}
}
	class Example2 extends Example{
		void print2() {
			System.out.println("Example1 is printing...");
		}
		void name() {
			System.out.println("My name is Example two");
		}

	public static void main(String[] args) {
		Example ex = new Example2();  //it is allowed
		// example2 ex = new example    // is is not allowed
		ex.print();
		ex.name();
	}

}
