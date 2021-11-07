import java.util.Scanner;
public class Third
{
	public static void main(String[] args)
	{
		int o,t,th;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter o angle:");
		o=s.nextInt();
		System.out.println("Enter t angle:");
		t=s.nextInt();
		th=180-o-t;
		System.out.println("print th: "+th);
	}
}