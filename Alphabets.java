class Alphabets
{
	public static void main(String args[])
	{
		String str=new String("Farmer jack realized that big yellow quilts were ");
		int len = str.length();
		for (int i=0;i<len;i++)
			{
				char ch=str.charAt(i);
				if (ch>='a' && ch<='z')
					System.out.println((int)(ch='a'));
				else if (ch>='A' && ch<='Z')
					System.out.println((int)(ch='A'));
			}
	}
	
}