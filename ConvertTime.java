import java.util.Scanner;

	public class ConvertTime{
		public static void main (String[] args){
			System.out.println("Enter Seconds");
			Scanner in = new Scanner(System.in);
			
			int sec = in.nextInt();
			
			int hour = sec/3600;
			int min = (sec%3600)/60;
			int seconds = sec % 60;
			
			System.out.printf("%d Seconds = %d Hours, %d Minutes, %d Seconds%n", sec, hour, min, seconds);
	}
}
