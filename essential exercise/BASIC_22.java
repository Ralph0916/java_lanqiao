package jichu;

import java.util.Scanner;

public class BASIC_22 {
	//FJ的字符串
	//第一个自己的递归算法实例，纪念一波
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(reverse(n));
	}
	public static String reverse(int n) {
		if(n == 1) {
			return "A";
		}
		else {
			return reverse(n-1)+(char)('A'+n-1)+reverse(n-1);
		}
	}
}
