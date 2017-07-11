import java.util.Scanner;
public class Gradecard{
	public static void main(String[] arg){
		Scanner scan= new Scanner(System.in);
		double marks=78.5;
		if (marks<40)
			System.out.println("Suppli");
		else if (marks<50)
			System.out.println("D grade");
		else if (marks<60)
			System.out.println("C grade");
		else if (marks<70)
			System.out.println("B Grade");
		else if (marks<80)
			System.out.println("A grade");
		else if (marks<90)
			System.out.println("E grade");
		else if (marks<=100)
			System.out.println("O grade");
		else
			System.out.println("MAKAUT has burned your gradecard");
	}
}