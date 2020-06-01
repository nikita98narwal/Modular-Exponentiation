package HackerEarth;

import java.util.Scanner;
import java.math.*;

public class ModularExponentiation {
	    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger m = sc.nextBigInteger();
		System.out.println(m.mod(BigInteger.valueOf(2).pow(n)));
		sc.close();
	}
}