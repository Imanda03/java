package lab1;
import java.util.Scanner;

public class Que_1d {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Number from 10 to 1");
		
		while(num >= 1) {
			System.out.println(num);
			num--;
		}
		

	}

}
