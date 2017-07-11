public class pattern1{
	public static void main(String[] args){
		int i, space, rows=6, star=0;
		int r=rows%2==0?rows/2:rows/2+1;
		System.out.println("*");
		for(i = 2; i <= r; i++) {
			for(space = 1; space <= r-i; space++) {
			   System.out.print(" ");
			}
			while(star != (2*i - 1)) {
				if(star == 0 || star==2*i-2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				star++;
			}
			star=0;
			System.out.println("");
		}
		rows--;
		for(i = r-1;i >= 1; i--) {
			for(space = 0; space <= r-i-1; space++) {
			   System.out.print(" ");
			}
			star = 0;
			while(star != (2*i - 1)) {
				if(star == 0 || star==2*i-2){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				star++;
			}
			System.out.println("");
		}
	}
}