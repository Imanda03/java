package accessModifiers;

public class ExceptionHandling {

	public static void main(String[] args) {
		try{
			int num = 100/0;
		}
			catch(ArithmeticException e) {
				
				System.out.println(e);
}
		System.out.println("Has been checked");
	}

}
