package practice;

public class MethodsOverloading {
	
	public void animal(){
		System.out.println("I love cat");
	}
	public void animal(int a) {
		System.out.println("I love "+a+" cat");
	}

	public static void main(String[] args) {
		
		MethodsOverloading ml = new MethodsOverloading();
		ml.animal();
		ml.animal(30);
         
	}

}
