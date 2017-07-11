import java.util.Scanner;
public class eligibility{
	public static void main(String[] args){
		while(true){
			Scanner scan = new Scanner(System.in);
			int age = scan.nextInt();
			if(age>=18)
				System.out.println("You are an eligible voter");
			else
				System.out.println("Go home kid you ain't no voter");
		}
	}
}