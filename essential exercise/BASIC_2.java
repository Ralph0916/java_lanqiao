package jichu;

public class BASIC_2 {
	//01×Ö´®
	public static void main(String[] args) {
		
		for(int i = 0; i < 32; i ++) {
			int x = i;
			int arr[] = new int[5];
			for(int j = 0; j < 5; j ++) {
				arr[j] = x % 2;
				x /= 2;
			}
			for(int k = arr.length-1; k >= 0; k --) {
				System.out.print(arr[k]);
			}
			System.out.println();
		}
	}
}
