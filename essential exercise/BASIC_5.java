package jichu;

import java.util.Scanner;

public class BASIC_5 {
	//²éÕÒÕûÊı
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = s.nextInt();
		}
		int m = s.nextInt();
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] == m) {
				System.out.println(i+1);
				break;
			}				
			if(i == arr.length-1 && arr[i] != m)
				System.out.println(-1);
		}
	}
}
