public class prime{
	public static void main(String[] args)
	{
		int flag=0;
		for(int i=2; i<=Math.sqrt(97);i++)
		{
			if(97%i==0)
			{
				flag++;
				break;
			}	
		}
		if(flag==0)
			System.out.println("97 is a prime number");
		else
			System.out.println("97 is a composite number");
	}
}