import java.util.Scanner;
public class sum{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum =0;
		while(a<=b)
		{
			sum+=a;
			a++;
		}
		System.out.println("The sum in range is "+sum);
	}
}