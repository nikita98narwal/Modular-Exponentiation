package Mathematics;

//import java.util.*;
import java.util.Scanner;

public class ExponentiationRecursion1 {
	static long exp(int x, int n) {
		long res = 1;
		for(int i = 1; i <= n; i++) {
			res = res*x;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(exp(x,n));
		sc.close();

	}

}
