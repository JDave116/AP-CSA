public class multAdd{
	public static double multadd(double a, double b, double c){
		return ( a*b+c );
	}
	
	public static void main(String[] args){
		System.out.println(multadd(1,2,3));
		System.out.println(multadd(1,(Math.PI/4),(Math.cos(Math.PI/4)/2)));
		System.out.println(multadd(1,Math.log10(10),Math.log10(20)));
		
		double x = 2.0;
		double result = multadd(x, Math.exp(-x), Math.sqrt(1- Math.exp(-x)));
		System.out.println("Result for x = " + x + " is: " + result);
}
}
