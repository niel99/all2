import java.io.*;
import java.util.Scanner;
class Taylor{
	public long fact(int n){
		if(n==0)
			return 1;
		else if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		Taylor ob= new Taylor();
		System.out.print("Enter x:");
		double x=sc.nextDouble();
		System.out.print("Enter n:");
		int n=sc.nextInt();
		double sum=0,minus=1,y=1;
		for(int i=0;i<2*n;i=i+2)
		{
			sum+=(minus*y)/ob.fact(i);
			minus*=-1;
			y=y*x*x;
		}
		System.out.println("So cos("+x+")="+sum);
	}
	
}