public class SquareRoot{
	public static void main(String[] args){
		System.out.println("Square root of 9.0: " + squareRoot (9.0));
		System.out.println("Square root of 26.0: " + squareRoot(26.0));
			
	}
	
	public static double squareRoot(double a){
		
		if (a == 0){
			return 0.0;
		}
		
		double x0 = a/2.0;
		double x1 = (x0 + a/ x0) / 2.0;
		
		while(Math.abs(x1 - x0) >= 0.0001){
			
			x0 = x1;
			
			x1 = (x0 + a /x0)/ 2.0;
		}
		
		return x1;
	}
}
