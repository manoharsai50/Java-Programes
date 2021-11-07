class Duplicate
{
	public static void main(String args[])
	{
	int []arr=new int[]{12,34,12,45,67,89};
	int ui=0;
	for (int i=0;i<10;i++)
	{
		int flag=0;
		for (int j=0;j<ui;j++)
		{
			if (arr[j]==arr[i])
			{
				flag=1;
				break;
			}
		}
		if (flag==0)
		{
			arr[ui]=arr[i];
			
		System.out.print(arr[i]+",");
	}
}