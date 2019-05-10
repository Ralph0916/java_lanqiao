package jichu;

import java.util.Scanner;

public class BASIC_24 {
	//龟兔赛跑预测
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int v1 = in.nextInt();	//兔子速度
        int v2 = in.nextInt();	//乌龟速度
        int t = in.nextInt();		//领先t米或以上
        int s = in.nextInt();		//停下来休息s秒
        int l = in.nextInt();
        int l1 = 0;					//兔子当前跑的长度
        int l2 = 0;					//乌龟跑的长度
        int breakTime = 0;		//兔子休息时间
        int flag = 1; 				//不在休息
        int countTime = 0;
        while (l1 < l && l2 < l) {
            if (flag == 1 && l1 - l2 < t || flag == 0 && breakTime >= s) {
                flag = 1;
                l1 += v1;
                breakTime = 0;
            } else {
                flag = 0;
                breakTime++;
            }
            l2 += v2;
            countTime++;
        }
        if (l1 > l2) {
            System.out.println("R\n" + countTime);
        } else if (l1 < l2) {
            System.out.println("T\n" + countTime);
        } else if (l1 == l2) {
            System.out.println("D\n" + countTime);
        }
	}
}
