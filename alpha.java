import java.util.Scanner;
public class alpha{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your range:");
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		ascii(a,b);
	}
	public static void ascii(char ch1, char ch2)
	{
		for(char ch=ch1;ch<=ch2;ch++)
		{
			System.out.print(ch+"="+(int)ch+"\n");
		}
	}
}