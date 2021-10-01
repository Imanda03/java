/* Wap to calculate percentage */
package practice;
import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks for sub1");
		int sub1 = sc.nextInt();
		
		System.out.println("Enter the marks for sub2");
		int sub2 = sc.nextInt();
		
		System.out.println("Enter the marks for sub3");
		int sub3 = sc.nextInt();
		
		System.out.println("Enter the marks for sub4");
		int sub4 = sc.nextInt();
		
		System.out.println("Enter the marks for sub5");
		int sub5 = sc.nextInt();
		
		int total = sub1+sub2+sub3+sub4+sub5;
		System.out.println("The total is "+total);
		
		int per = total / 5;
		
		System.out.println("The percantage is "+per);
	}

}


