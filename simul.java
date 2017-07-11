import java.util.Scanner;
public class simul{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter coeficients of equation 1:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.print("Enter coeficients of equation 2:");
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int c1=sc.nextInt();
		float y=(float)(a1*c-a*c1)/(float)(a1*b-a*b1);
		float x=(float)(b1*c-b*c1)/(float)(b1*a-b*a1);
		System.out.print("So the equations are "+a+"x+"+b+"y="+c+" and "+a1+"x+"+b1+"y="+c1);
		System.out.print("\nThe solution of these equations is x="+x+" and y="+y);

	}
}