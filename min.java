public class min{
	public static void main(String args[]){
		int a=11;
		int b=6;
		int c=minumber(a, b);
		System.out.println("Minimum No is "+c);
	}
	public static int minumber(int x, int y){
		int min;
		if(x<y)
			min=x;
		else if(y<x)
			min=y;
		else
		{
			min=x;
			System.out.println("Numbers are equal\n");
		}
		return min;
	}
}