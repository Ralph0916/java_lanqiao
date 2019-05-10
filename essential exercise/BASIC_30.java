package jichu;

import java.util.Scanner;

public class BASIC_30 {
	//阶乘计算 
	public static void main(String[] args) {
		long []a=new long [4000];
		Scanner key=new Scanner(System.in);
		int n=key.nextInt();
		for(int i=0;i<a.length;i++){
			a[i]=0;
		}
		a[0]=1;//把初始值由0改为1
		
		int jinWei,sum=0,flag=0;
		for(int i=2;i<=n;i++){
			jinWei=0;
			for(long j=0;j<a.length;j++){   //注意j的循环次数，不是n而是a.length
				 sum=(int) (jinWei+a[(int) j]*i);
				 a[(int) j]=sum%10;
				jinWei=sum/10;
			}		
		}
		//去掉数组前边多余的0
		for(long i=a.length-1;i>=0;i--){
			if(a[(int) i]!=0){ 
			flag=(int) i;
			break;
			}
		}
		for(long i=flag;i>=0;i--){
			System.out.print(a[(int) i]);
		}
}
}
