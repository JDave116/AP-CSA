public class FormatDate{
	
	public static void printAmerican(String s, String n, int date, int year){
		System.out.print(s+", ");
		System.out.print(n+" ");
		System.out.print(date+", ");
		System.out.print(year);
	}
	
	public static void main (String[] args){
		printAmerican("Monday","July",22,2019);
	}
}


