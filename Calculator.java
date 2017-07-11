import java.util.Scanner;
public class Calculator{
	public static double add(double n1, double n2){
		return n1+n2;
	}
	public static double sub(double n1,double n2){
		return n1-n2;
	}
	public static double mult(double n1, double n2){
		return n1*n2;
	}
	public static double div(double n1, double n2){
		return n2!=0?n1/n2:0;
	}
	public static double mod(double n1, double n2){
		return n2!=0?n1%n2:n1;
	}
	public static void main(String[] args){
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice: \n1.Float \n2.Integer");
			int x=sc.nextInt();
			System.out.println("Enter the numbers");
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			System.out.println("Enter your operation(1/2/3/4/5/6):"+"\n 1.Addition"+"\n 2.Subtraction"+"\n 3.Multiplication"+"\n 4.Division"+"\n 5.Modulus"+"\n 6.Exit");
			int c=sc.nextInt();
			switch (c){
				case 1:	System.out.println(x==1?add(a,b):(int)add(a,b));
								break;
				case 2:	System.out.println(x==1?sub(a,b):(int)sub(a,b));
								break;
				case 3:	System.out.println(x==1?mult(a,b):(int)mult(a,b));
								break;
				case 4:	System.out.println(div(a,b));
								break;
				case 5:	System.out.println(x==1?mod(a,b):(int)mult(a,b));
								break;
				case 6:	System.exit(0);
					default:	System.out.println("Wrong choice.Please try again");
								continue;
			}
			
	}
		
}