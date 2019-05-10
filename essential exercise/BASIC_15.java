package jichu;

import java.util.Scanner;

public class BASIC_15 {
	//String comparison
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		if(s1.length() != s2.length())
			System.out.println(1);
		else
			if(s1.equals(s2))
				System.out.println(2);
			else
				if(s1.toLowerCase().equals(s2.toLowerCase())) 
					System.out.println(3);				
				else
					System.out.println(4);
	}
}
