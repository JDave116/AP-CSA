import java.util.Scanner;

public class Fermat{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter a: ");
		int a = in.nextInt();
		System.out.println("enter b: ");
		int b = in.nextInt();
		System.out.println("enter c: ");
		int c = in.nextInt();
		System.out.println("enter n: ");
		int n = in.nextInt();
		
	if(((Math.pow(a, n)) +(Math.pow(b,n)) == Math.pow(c,n)) && n>2){
		System.out.println("Holy smokes, Fermat was wrong!");
	}else{
		System.out.println("No, that doesnt work");
	}
	
}
}


