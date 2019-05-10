package jichu;

import java.util.Scanner;

public class BASIC_26 {
	//±® ±÷˙ ÷
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		String[] s={"zero","one","two","three","four","five","six","seven",
				"eight","nine","ten","eleven","twelve","thirteen","fourteen",
				"fifteen","sixteen","seventeen","eighteen","nineteen",
				"twenty"};
		String[] s1={"","","twenty","thirty","forty","fifty"};
		String s2 = "";
		
		if(h <= 20)
			s2 += s[h]+" ";
		else {
			s2 += s1[h/10]+" "+s[h%10]+ " ";
		}
		
		if(m == 0)
			s2+=" o'clock";
		else if(m <= 20) {
			s2 += s[m]+ " ";
		}
		else {
			if(m % 10 == 0)
				s2 += s1[m/10];
			else {
				s2 += s1[m/10]+" "+s[m%10];
			}
		}
		System.out.println(s2);
	}
}






