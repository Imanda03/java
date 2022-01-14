package game;
import java.util.Random;
import java.util.Scanner;


	class Gamee{
		public int number;
		public int noOfGuesses;
		public int inputNumber;
		
		public int getNoOfGuesses() {
			return noOfGuesses;
		}
		
		public void setNoOfGuesses(int noOfGuesses) {
			this.noOfGuesses = noOfGuesses;
		}
		
		
		 Gamee() {
			Random ran = new Random();
			this.number = ran.nextInt(100);
		}
		void takeUserInput() {
			System.out.println("Guess the number");
				Scanner sc = new Scanner(System.in);
				inputNumber = sc.nextInt();
			
		}
		boolean isCoorectNumber() {
			if(inputNumber==number) {
				System.out.println("You are correct. You guess it");
				return true;
			}
			else if(inputNumber<number){
				System.out.println("Numer is less...");
			}
				else if(inputNumber>number){
					System.out.println("Numer is more...");
			} 
			return false;
		}
		

}

	public class Game {
	
	public static void main(String[] args) {
		Gamee g = new Gamee();
		boolean b = false;
		while(!b) {
		g.takeUserInput();
		b = g.isCoorectNumber();
		System.out.println(b);
		}
		
	}

		
	}


