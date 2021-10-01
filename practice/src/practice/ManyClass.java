package practice;
	
	class Detail{
		String name;
		int age;
		
		void shortCut() {
			System.out.println("His name is " +name+" and he is about "+age);
		}
		
	}

public class ManyClass {

	public static void main(String[] args) {
		
		Detail dl = new Detail();
		dl.name = "Anish Sharma";
		dl.age = 20;
		
		//System.out.println(dl.name);
		//System.out.println(dl.age);
		
		dl.shortCut();
	}

}
