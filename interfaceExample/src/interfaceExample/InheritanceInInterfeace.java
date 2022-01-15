package interfaceExample;

	interface class1{
	void method1();
	void method2();
	}

	interface class2 extends class1{
		void method3();
		void method4();
	}
	
	class Class3 implements class2{
		public void method1() {
			System.out.println("Methods1 is printing...");
		}
		public void method2() {
			System.out.println("Methods2 is printing...");
		}
		public void method3() {
			System.out.println("Methods3 is printing...");
		}
		public void method4() {
			System.out.println("Methods4 is printing...");
		}
	}
public class InheritanceInInterfeace {

	public static void main(String[] args) {
		
		Class3 cl = new Class3();
		
		cl.method1();
		cl.method2();
		cl.method3();
		cl.method4();

	}

}
