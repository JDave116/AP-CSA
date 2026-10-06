import java.util.Scanner;

public class Quadratic{
	public static void main (String [] args){
	Scanner in = new Scanner (System.in);
	
	System.out.println("enter a: ");
	double a = in.nextDouble();
	System.out.println("enter b: ");
	double b = in.nextDouble();
	System.out.println("enter c: ");
	double c = in.nextDouble();
	
	Discriminant(a,b,c);
		
}
	public static void Discriminant (double a, double b, double c){
		double Dis = Math.pow(b,2) - 4 * a * c;
		Boolean q;
		
		if(Dis >= 0){
			q = true;
		}else{
			q = false;
			System.out.println("The discriminant is negative");
		}
		double Quad1 = ((b*-1)+(Math.sqrt(Dis))/(a*2));
		double Quad2 = ((b*-1)-(Math.sqrt(Dis))/(a*2));
		if(q == true){
			System.out.println("The roots are: " + Quad1+ ", "+ Quad2);
		}
	}

}
