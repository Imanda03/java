package abstractExample;

	abstract class Parent{
		public Parent() {
			System.out.println("I am a constructor of parent class...");
		}
		public void sayHello() {
			System.out.println("Hello!!");
		}
		abstract public void greet();
		abstract public void greet2();
		
	}
	
	class Child extends Parent{
		public void greet() {
			System.out.println("Good morning");
		}
		public void greet2() {
			System.out.println("How are you");
		}
	}
	
	abstract class AnotherChild extends Parent{
		public void th() {
			System.out.println("How was day..");
		}
	
	public static void main(String[] args) {
		
		Child cl = new Child();
		cl.greet();
		cl.greet2();
//		AnotherChild ch = new AnotherChild(); //Cannot make the object
//		ch.th();
		

	}

}
