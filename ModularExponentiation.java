package Mathematics;

import java.util.Scanner;

public class ModularExponentiation {
	static int mod(int x, int n, int M) {
		if(n == 0) {
			return 1;
		}
		else if(n%2 == 0) {
			int	y = mod(x,n/2,M);
			return (y * y)%M;
		}
		else {
			return ((x%M) * mod(x,n-1,M))%M;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int M = sc.nextInt();
		System.out.println(mod(x,n,M));
		sc.close();

	}

}
