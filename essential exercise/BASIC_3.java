package jichu;

import java.util.Scanner;

public class BASIC_3 {
	//×ÖÄ¸Í¼ÐÎ
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		char arr[][] = new char[n][m];
		arr[0][0] = 'A';
		for(int i = 1; i < arr.length; i ++) {
			arr[i][0] = (char) (arr[0][0] + i);
		}		
		
		for(int i = 0; i < arr.length; i ++) {
			boolean b = false;
			for(int j = 1; j < arr[0].length; j ++) {
				if(arr[i][j-1] == 'A')
					b = true;
				if(b)
					arr[i][j] = (char) (arr[i][j-1] + 1);
				else
					arr[i][j] = (char) (arr[i][j-1] - 1);
			}
		}
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < m; j ++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
