import java.util.Scanner;


public class Triangle{
	public static void main( String [] args){
	Scanner in = new Scanner (System.in);
	
	System.out.println("Enter your 3 sides: ");
	double a = in.nextDouble();
	double b = in.nextDouble();
	double c = in.nextDouble();
	
	TriangleCheck(a, b, c);
	}
	
	public static void TriangleCheck(double a, double b, double c){
		boolean triangle;
		if(a <= 0 || b <= 0 || c <= 0){
			triangle = false;
			System.out.println("ERROR -- sides Negative/Zero");
		}else if(a >= b+c || b >= a+c || c >= a +b){
			triangle = false;
			System.out.println("You cannot form a triangle"); 
		}else{
			triangle = true;
			System.out.println("You can form a triangle");
		}
	}
}
