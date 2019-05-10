package jichu;

import java.util.Scanner;

public class BASIC_16 {
	//Decomposition factor
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m = s.nextInt();
		
		
		for(int i = n; i <= m; i ++) {
			String s1 = "";
			int z = i;
			int  k=2;  //定义一个最小的质因数 
		    while (k<=z){    //进行循环判断   
		    	if(k==z){ 
		    		s1 += z;
		    		break;
		    	}else if (z%k==0){  
		    		s1 =s1 + k+"*";
		    		z=z/k;
		    		}
		    	else k++; 
		 	}
		    System.out.println(i + "=" + s1);
		}		
	}
}
