class Vowel{
public static void main(String args[]){
int month = Integer.parseInt(args[0]);
switch(month)
{
case 1: System.out.println("jan");
	break;
case 2: System.out.println("feb");
	break;
case 3: System.out.println("march");
	break;
case 4: System.out.println("april");
	break;
case 5: System.out.println("may");
	break;
case 6: System.out.println("june");
	break;
case 7: System.out.println("July");
	break;
case 8: System.out.println("Aug");
	break;
case 9: System.out.println("sep");
	break;
case 10: System.out.println("Oct");
	break;
case 11: System.out.println("Nov");
	break;
case 12: System.out.println("Dec");
	break;
default: System.out.println("error");
	break;
}
}
}