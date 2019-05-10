package jichu;

import java.util.Arrays;
import java.util.Scanner;

public class BASIC_4 {
	//Ъ§СаЬиеї
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = s.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]+"\n"+arr[0]+"\n"+sum);
	}
}
