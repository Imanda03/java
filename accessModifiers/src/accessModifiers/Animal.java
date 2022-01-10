package accessModifiers;


public class Animal{
	public void animal() {
		System.out.println("Dog is an animal.");
	}
}
	class Bark extends Animal{
		public void bark() {
			System.out.println("Dog barks.");
		}
	}
	
	class Dog extends Bark{
		public void dog() {
			System.out.println("Dog are human best friends.");
		}
		public static void main(String[] args) {
			Dog an = new Dog();
			
			an.animal();
			an.bark();
			an.dog();
		}
	}