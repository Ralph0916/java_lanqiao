package jichu;

public class BASIC_7 {
	//ÌØÊâµÄÊı×Ö
	public static void main(String[] args) {
		for(int i = 0; i < 10; i ++) {
			for(int j = 0; j < 10; j ++) {
				for(int k = 0; k < 10; k ++) {
					if(i*i*i+j*j*j+k*k*k == i*100+j*10+k && i*100+j*10 > 99 )
						System.out.println(i*100+j*10+k);
				}
			}
		}
	}
}
