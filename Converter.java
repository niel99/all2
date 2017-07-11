import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class Converter{
		public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter any number in decimal format:");
			int n=sc.nextInt();
			System.out.println("Enter your Conversion type:\n1.Binary\n2.Octal\n3.Hexadecimal");
			int c=sc.nextInt();
			switch(c){
				case 1:	int bin=binary(n);
						System.out.println(bin);
						System.out.println("Enter your choice:\n1.OR\n2.NOT");
						int ch=sc.nextInt();
						oper(n,ch);
						break;
				case 2:	System.out.print(oct(n));
						break;
				case 3:System.out.print(hexa(n));
						break;
				default:System.out.print("Wrong Choice");
			}
		}
		public static int binary(int n){
			int r;
			String s=""; 
			char bin[]={'0','1'};
			while(n>0)
			{
			   r=n%2; 
			   s=bin[r]+s; 
			   n=n/2;
			}
			int b=Integer.parseInt(s);
			return b;
			
		}
		public static String oct(int n){
			int r;
			String s=""; 
			char oc[]={'0','1','2','3','4','5','6','7'};
			while(n>0)
			{
			   r=n%8; 
			   s=oc[r]+s; 
			   n=n/8;
			}
			return s;
		} 
		public static String hexa(int n){
			int r;
			String s=""; 
			char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			while(n>0)
			{
			   r=n%16; 
			   s=hex[r]+s; 
			   n=n/16;
			}
			return s;
		}
		public static void oper(int n,int c){
			Scanner sc= new Scanner(System.in);
			switch(c){
				case 1:	System.out.println("Enter another number:");
						int n1=sc.nextInt();
						System.out.print(binary(n|deci(n1)));
						break;
				case 2:	System.out.print(not(binary(n)));
						break;
				default:System.out.print("Wrong Choice");
			}
		}
		public static int deci(int a){
			int d=0;
			int two=1;
			while(a!=0){
				d+=a%10*two;
				two*=2;
				a=a/10;
			}
			return d;
		}
		public static String not(int a){
			String rev="";
			String n="";
			while(a!=0){
				if(a%10==1)
					n+=0;
				else
					n+=1;
				a/=10;
			}
			int b=n.length();
			int i=1;
			while(i<=b){
				rev+=n.charAt(b-i);
				i++;
			}
			return rev;
		}
}