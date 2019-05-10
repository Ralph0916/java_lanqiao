package jichu;

import java.util.Arrays;
import java.util.Scanner;

public class BASIC_28 {
	//HuffumanÊ÷ 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = scan.nextInt();
		}
		int sum = 0;
		while(arr[1] != 100001) {
			Arrays.sort(arr);
			arr[0] += arr[1];
			arr[1] = 100001;
			sum += arr[0];
			Arrays.sort(arr);
		}
		System.out.println(sum);
	}
}
