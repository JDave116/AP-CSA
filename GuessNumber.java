import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	
	public static void main (String[] args) {
		System.out.println("I'm thinking of a number between 1 and 100 (Including both).");
		System.out.println("Can you guess what it is?");
		
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		
		int number = random.nextInt(100) + 1;
		
	
		System.out.print("Guess 1: ");
		int Guess = in.nextInt();
		int wrong = Math.abs(number - Guess);
		
		if (Guess == number) {
			System.out.println("You have guessed correctly! You win!");
		} else {
		
			System.out.println("You were off by: " + wrong);
			if (Guess > number) {
				System.out.println("You were too high.");
			} else {
				System.out.println("You were too low.");
			}
			
			
			System.out.print("Guess 2: ");
			Guess = in.nextInt(); 
			wrong = Math.abs(number - Guess);
			
			if (Guess == number) {
				System.out.println("You have guessed correctly! You win!");
			} else {
				
				System.out.println("You were off by: " + wrong);
				if (Guess > number) {
					System.out.println("You were too high.");
				} else {
					System.out.println("You were too low.");
				}
				
				
				System.out.print("Final Guess: ");
				Guess = in.nextInt(); 
				wrong = Math.abs(number - Guess);
				
				if (Guess == number) {
					System.out.println("You have guessed correctly! You win!");
				} else {
				
					System.out.println("\nGame over! You ran out of tries.");
					System.out.println("You were off by: " + wrong);
					if (Guess > number) {
						System.out.println("You were too high.");
					} else {
						System.out.println("You were too low.");
					}
					System.out.println("The number I was thinking of was: " + number);
				}
			}
		}
		
		
	}
}
