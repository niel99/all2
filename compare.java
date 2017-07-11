import java.util.Scanner;
public class compare{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		String s1 = read.nextLine();
		String s2 = read.nextLine();
		if(s1.equals(s2))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
	}
}