package jichu;

import java.io.IOException;
import java.util.Scanner;

public class BASIC_19_T {
	// 完美的代价
	static char[] s;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        s = in.nextLine().toCharArray();
        in.close();
        int count = 0;
        int j = n - 1;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int k = j; k >= i; k--) {
                if (k == i) {//第i个字符为奇数个
                    if (n % 2 == 0 || flag) {//不能构成回文的两种情况
                        System.out.println("Impossible");
                        return;
                    }
                    flag = true;//遇到第一个奇数的字符,如果存在两个奇数的字符而且n为奇数不能构成回文
                    count += n / 2 - i;
                } else if (s[i] == s[k]) {
                    for (int l = k; l < j; l++) {
                        swap(l, l + 1);//把s[k]换到s[j]处
                        count++;//统计交换次数
                    }
                    j--;
                    break;
                }
            }
        }
        System.out.println(count);
    } 
    private static void swap(int c, int d) {
        char temp = s[c];
        s[c] = s[d];
        s[d] = temp;
 
    }
}