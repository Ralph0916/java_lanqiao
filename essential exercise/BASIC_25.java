package jichu;

import java.util.Scanner;

public class BASIC_25 {
	//回形取数
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int a[][] = new int[m][n];
		for(int i = 0; i < m; i ++) {
			for(int j =0; j < n; j ++) {
				a[i][j] = scan.nextInt();
			}
		}
		
		String s = "";
		boolean arr1[][] = new boolean[m][n];	//默认为false
		int count = n *m;
		 int tot = 0, x = -1, y = 0; 
	        while (tot < m * n) { 
	            while (x + 1 < m && a[x + 1][y] != -1) { 
	                System.out.print(a[++x][y]+" "); 
	                a[x][y] = -1; 
	                ++tot; 
	            } 
	            while (y + 1 < n && a[x][y + 1] != -1) { 
	                System.out.print(a[x][++y]+" "); 
	                a[x][y] = -1; 
	                ++tot; 
	            } 
	            while (x - 1 >= 0 && a[x - 1][y] != -1) { 
	                System.out.print(a[--x][y]+" "); 
	                a[x][y] = -1; 
	                ++tot; 
	            } 

	            while (y - 1 >= 0 && a[x][y - 1] != -1) { 
	                System.out.print(a[x][--y]+" "); 
	                a[x][y] = -1; 
	                ++tot; 
	            } 
	        } 
	}
}














