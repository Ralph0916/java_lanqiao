package jichu;

import java.util.Arrays;
import java.util.Scanner;

public class BASIC_13 {
	//Sequence of sorting
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i]+" ");
		}
	}
}
