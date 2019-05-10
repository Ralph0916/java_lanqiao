	package jichu;
	
	import java.util.Arrays;
	import java.util.Scanner;
	
	public class BASIC_23 {
		//芯片测试
		public static void main(String[] args) {
			Scanner key=new Scanner(System.in);
			int n=key.nextInt();
			int [][]a=new int[n+1][n+1];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					a[i][j]=key.nextInt();
				}
			}
			for(int i=0;i<n;i++){
				int t = 0,f = 0;//  t表示值为“1”的次数，f表示值为“0”的次数
				for(int j=0;j<n;j++){
					if(a[j][i]==1) t++;
					if(a[j][i]==0) f++;		
				}
				if(t>f) System.out.print((i+1)+" ");
			}
		}
	}
