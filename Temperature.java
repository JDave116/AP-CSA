

import java.util.Scanner;

	public class Temperature{
		public static void main (String[] args){
		System.out.println("Enter temperature in Celcius:");
		Scanner in = new Scanner(System.in);
		double Celsius = in.nextDouble();
		double Fahrenheit = Celsius * 9/5 +32;
		System.out.printf("%.2f C = %.2f F", Celsius, Fahrenheit);
	}
}
