import java.io.*;
import java.util.*;
import java.util.Scanner.*;
class triangle{
	public void calcArea(int base, int height){
		float ar=(base*height)/2;
		System.out.println("The area of the triangle is "+ar);
	}
	public void calcArea(int s1,int s2,int s3){
		float s=(s1+s2+s3)/2;
		double ar=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		System.out.println("The area of the triangle is "+ar);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		triangle ob =new triangle();
		System.out.println("How many sides you want to input:\n1.Base and Height\n2.All three sides");
		int ch=sc.nextInt();
		switch(ch){
			case 1:	System.out.print("Enter base and height:");
					int base=sc.nextInt();
					int h=sc.nextInt();
					ob.calcArea(base,h);
					break;
			case 2:	System.out.print("Enter the 3 sides:");
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					ob.calcArea(a,b,c);
					break;
			default:System.out.println("Wrong Choice");
		}
	}
}