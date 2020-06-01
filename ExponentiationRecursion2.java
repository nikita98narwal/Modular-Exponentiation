package Mathematics;
import java.util.*;

public class ExponentiationRecursion2 {
	static int exp(int x, int n) {
		if(n == 0) {
			return 1;
		}
		else {
			return x*exp(x,n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(exp(x,n));
		}
		sc.close();
	}
}
