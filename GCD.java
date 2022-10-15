import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int dividend = n1;
		int divisor = n2;
		while(dividend%divisor!=0) {
			int rem = dividend%divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
		sc.close();
	}

}
