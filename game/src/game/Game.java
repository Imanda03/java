package game;
import java.util.Random;
import java.util.Scanner;


	class Gamee{
			public int number;
			public int inputnumber;
			public int guess;
			public int getGuess() {
				return guess;
			}
			public void setGuess(int guess) {
				
			}
			
				void Game() {
					Random ran = new Random();
					this.number = ran.nextInt(100);
				}
				void takeInput() {
					Scanner sc = new Scanner(System.in);
					inputnumber = sc.nextInt();
					
				}
				boolean iscorrectnumber(int num) {
					if(num == number) {
						return true;
					}
					return false;
				}
				
}

	public class Game {
	
	public static void main(String[] args) {
		
		Game g = new Game();
		g.takeInput();
	}

}
