package practice;

public class DecryptAndEncryptChar {

	public static void main(String[] args) {
		char ch = 'B';
		char grade = (char) (ch + 8);
		System.out.println(grade);
		
		char gra = (char) (grade - 8);
		System.out.println(gra);

	}

}
