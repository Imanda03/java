package thisAndSuperKeyword;

public class SuperExample {
int a;
	
	public int getA() {
	return a;
}

	SuperExample(int num){
		this.a = num;
	}
}
	class Example extends SuperExample{
		Example(int c) {
			super(c);
			System.out.println("I am a construction!!");
		}
		
	public static void main(String[] args) {
		Example ex = new Example(25);

	}


}
