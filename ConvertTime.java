import java.util.Scanner;

	public class ConvertTime{
		public static void main (String[] args){
			System.out.println("Enter Seconds");
			Scanner in = new Scanner(System.in);
			int Sec = in.nextInt();
			int Hour = Sec % 3600;
			int Min = (Sec % 3600)/60;
			int Seconds = Sec/60;
			
			System.out.printf("%d Seconds = %d Hours, %d Minutes, %d Seconds", Sec, Hour, Min, Seconds);
	}
}
