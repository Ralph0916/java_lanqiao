package jichu;

import java.util.Scanner;

public class BASIC_10 {
	//Decimal convert hexadecimal
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Integer.toHexString(n).toUpperCase());
	}
}
