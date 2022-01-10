package lab1;
import java.util.Scanner;

public class Que_1a {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your age");
		Scanner sv = new Scanner(System.in);
		int num = sv.nextInt();
		
			
		if(num<18) {
			System.out.println("You are not allowed to use this website.");
		}
		else {
			System.out.println("Welcome! You can watch the horror movie.");
		}
	}

}
