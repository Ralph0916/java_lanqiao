package jichu;

import java.util.*;
public class BASIC_17 {
	//æÿ’Û≥À∑®
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int i,j;
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                b[i][j]=a[i][j] = sc.nextInt();
        if(m==0)
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    if(i==j)System.out.print(1+" ");
                    else System.out.print(0+" ");
                }
                System.out.println();
            }
        else if(m==1)
            for(i=0;i<n;i++){
                for(j=0;j<n;j++)
                    System.out.print(a[i][j]+" ");
                System.out.println();
            }
        else{
            for(int z=1;z<m;z++){
                int[][] tmp = new int[n][n]; 
                for(i=0;i<n;i++){
                    for(j=0;j<n;j++){
                        int add = 0;
                        for(int y=0;y<n;y++){
                            add += a[i][y]*b[y][j];
                        }
                        tmp[i][j] = add;
                    }
                }
                b = tmp;
            }
            for(i=0;i<n;i++){
                for(j=0;j<n;j++)
                    System.out.print(b[i][j]+" ");
                System.out.println();
            }
        }
            
    }
}