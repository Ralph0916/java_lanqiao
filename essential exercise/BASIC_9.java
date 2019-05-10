package jichu;

import java.util.Scanner;

public class BASIC_9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 10000; i < 1000000; i ++) {
			int x = i, y,con = 0,sum = 0;
			while(x>0) {
				y = x % 10;
				x /= 10;
				con = con * 10 +y;
				sum += y;
			}
			if(con == i && sum == n)
				System.out.println(i);
		}
	}
}
