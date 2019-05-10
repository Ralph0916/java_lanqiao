package jichu;

import java.util.Scanner;

public class BASIC_6 {
	//Ñî»ÔÈý½ÇÐÎ
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[][] = new int[n][n];
		for(int i = 0; i < arr.length; i ++) {
			arr[i][0] = 1;
		}
		
		for(int i = 1; i < arr.length; i ++) {
			for(int j = 1; j < arr[0].length; j ++) {
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			}
		}
		
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr[0].length; j ++) {
				if(arr[i][j] == 0)
					continue;
				else
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
