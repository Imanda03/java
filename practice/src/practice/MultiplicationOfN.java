package practice;

public class MultiplicationOfN {
	
	public void multiplication(int n) {
		int i;
		for(i=1; i<=10; i++) {
			System.out.printf("%d x %d = %d",n, i, n*i);
			System.out.printf("\n");
		}
	}
	public static void main(String[] args) {
		 
		MultiplicationOfN mul = new MultiplicationOfN();
		 mul.multiplication(25);
		 
	}

}
