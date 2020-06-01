package Mathematics;

import java.util.Scanner;

public class ExponenetiationRecursion3 {
	static int power(int x, int n) {
		if(n == 0) {
			return 1;
		}
		else if(n%2 == 0) {
			return power(x,n/2) * power(x,n/2);
		}
		else {
			return x * power(x,n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(power(x,n));
		sc.close();

	}

}
