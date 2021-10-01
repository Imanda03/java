package practice;
import java.util.Scanner;
public class KilometersIntoMiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the kilometers");
		int kilo =sc.nextInt();
		
		float change = 0.621371f * kilo;
		
		System.out.println(+kilo+" is "+change+" miels");
	}

}
