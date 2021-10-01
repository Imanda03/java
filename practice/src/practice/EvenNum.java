package practice;

public class EvenNum {
	public  void  even() {
		int n ;
		for(n = 1; n < 21; n++) {
			if(n % 2 == 0) {
				System.out.println(n);
			}
		}
		
	}

	public static void main(String[] args) {
		EvenNum num = new EvenNum();
		num.even();

	}

}
