public class Time{
	public static void main(String[] args){
		int hour=13;
		int minute=21;
		int second=20;
		
		System.out.println("Seconds since midnight: " +(hour*3600+minute*60+second)+" seconds.");
		System.out.println("Seconds remaining in day: "+((24*3600)-(hour*3600+minute*60+second))+" seconds.");
		System.out.println("Percentage of day passed: "+((hour*3600+minute*60+second)*100)/(24*3600)+"%");
	}
}
