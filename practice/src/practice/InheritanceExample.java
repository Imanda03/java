package practice;


	class Class1{
		
		void method1(){
			System.out.println("Method1 is printing....");
		}
	}
	class Class2 extends Class1{
		void method2() {
			System.out.println("Method2 is printing.....");
		}
	}
	class Class3 extends Class2{
		void methods3() {
			System.out.println("Method3 is printing....");
		}
	}
public class InheritanceExample {

	public static void main(String[] args) {
		
		Class3 cl = new Class3();
		
		cl.method1();
		cl.method2();
		cl.methods3();
		
	}

}
