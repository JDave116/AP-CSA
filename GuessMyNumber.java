import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber{
	
	public static void main (String[] args){
		System.out.println("I'm thinking of a number between 1 and 100 (Including both).");
		System.out.println("Can you guess what it is?");
		
		Scanner in  = new Scanner (System.in);
		int Guess = in.nextInt();
		
		System.out.println("Your guess is: " + Guess);
		
		//random number
		
		Random random = new Random();
		int number = random.nextInt(100) +1;
		int wrong = Math.abs(number - Guess);
		
		if(Guess == number){
			System.out.println("You have guessed correctly");
		}else{
			System.out.println("The number I was thinking of is: " + number);
			System.out.println("you were off by: " + wrong);
		}
	}
	
}


