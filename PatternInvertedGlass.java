import java.util.Scanner;

public class PatternInvertedGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n>7");
		int n = sc.nextInt();
		int mid = n-2;
		int sp = 1;
		for(int i=1;i<=n;i++) {
			if(i==1||i==n) {
				for(int j=1;j<=n;j++) {
					System.out.print("*\t");
				}
			} else if(i<=(n/2)+1){
				for(int j=1;j<=sp;j++) {
					System.out.print("\t");
				}
				for(int j=1;j<=mid;j++) {
					System.out.print("*\t");
				}
				if(i<(n/2)+1) {
					sp++;
				}
				mid-=2;
			} else {
				sp--;
				mid+=2;
				for(int j=1;j<=sp;j++) {
					System.out.print("\t");
				}
				System.out.print("*\t");
				for(int j=1;j<=mid;j++) {
					System.out.print("\t");
				}
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

}
