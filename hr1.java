import java.util.Scanner;
public class hr1{
	public static String maxmin(String s, int n){
		String max = s.substring(0,n);
		String min = s.substring(0,n);
		for (int i=1; i<=s.length()-n;i++){
			for(int j=1;j<=i;j++)
			{
				if(min.compareTo(s.substring(j,j+n))<0)
					min=s.substring(j,j+n);
				if(max.compareTo(s.substring(j,j+n))>0)
					max=s.substring(j,j+n);
			}
		}
		return max+"\n"+min;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string:");
		String str = sc.next();
		System.out.print("Enter the length of each substring:");
		int x = sc.nextInt();
		System.out.print(maxmin(str,x));
	}
}