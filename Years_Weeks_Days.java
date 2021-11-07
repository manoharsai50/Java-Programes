import java.util.Scanner;
public class Years_Weeks_Days
{
	public static void main(String args[])
	{
		int m,year,month,week,day;
	        Scanner s = new Scanner(System.in);
		System.out.println(" enter no.of days:");
		m=s.nextInt();
		year=m/365;
		m=m%365;
		System.out.println("no.of year:"+year);
		week=m%7;
		m=m%7;
		System.out.println("no.of weeks:"+week);
		day=m;
		System.out.println("no.of days:"+day);
	}
}
