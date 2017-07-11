import java.util.Scanner;
public class reverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=sc.nextInt();
		int rev=0;
		int temp=a;
		do{
			rev=rev*10+temp%10;
			temp=temp/10;
		}while(temp!=0);
		System.out.println("The reverse of the number "+a+" is "+rev);
	}
}