package jichu;

import java.util.Scanner;

public class BASIC_14 {
	//Time conversion
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int h = 0, m = 0, s = 0;
		h = n / 3600;
		m = ((n - h * 3600) / 60);		
		s = n - m * 60 - h * 3600;
		System.out.println(h+":"+m+":"+s);
	}
}
