import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class Exception{
	public static void main(String[] args) throws NumberFormatException{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		String s = sc.nextLine();
		try{
			int a=Integer.parseInt(s);
			System.out.print("The number is "+a);
		}catch(NumberFormatException n){
			System.out.println("not a number");
		}
	}
}