package jichu;

import java.util.Scanner;

public class BASIC_29 {
	//高精度加法
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int s1l=s1.length() - 1, s2l = s2.length() - 1,i = 0;;
		while(s1l >= 0 || s2l >= 0) {
			if(s2l>=0) {
				b[i] = s2.charAt(s2l) - '0';
			}
			if(s1l>=0) {
				a[i] = s1.charAt(s1l) - '0';
			}
			i ++;
			s1l --;
			s2l --;
		}

		int r = 0;
		int sum = 0;
		for(i = 0; i < Math.max(s1.length(), s2.length()); i ++) {
			sum = r + a[i] + b[i];
			c[i] = sum % 10;
			r = sum / 10;
		}
		
		for(i = 0; i <c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		for(i = c.length - 1; i >= 0; i --) {
			if(c[i] != 0) {
				for(int j = i; j >= 0; j --) {
					System.out.print(c[j]);
				}
				break;
			}
		}
	}
}