package jichu;

public class BASIC_8{
	//»ØÎÄÊı
	public static void main(String args[]){
		for(int i = 1000; i < 10000; i ++) {
			int x = i, y,con = 0;
			while(x>0) {
				y = x % 10;
				x /= 10;
				con = con * 10 +y;
			}
			if(con == i)
				System.out.println(i);
		}
	}
}
