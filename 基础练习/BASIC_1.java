package jichu;

import java.util.Scanner;

public class BASIC_1 {
	//ÅĞ¶ÏÈòÄê
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 100 == 0 )
			System.out.println("yes"); 
		else
			System.out.println("no");
	}
}
