package array;

public class ArrayDividing {
	private static int[] b;

	public static void main(String[] args) {
		int[] a = {1, 3, 4, 6, 8, 4, 6, 8};
//		int[] b = {0,0,0,0,0,0} ;
//		int[] c = {0,0,0,0,0} ;
		for (int i=0; i<4; i++) {
			int b = a[i];
			System.out.println(b);
		}
//		for (int x : b) {
//			System.out.println(x);
//		}
		for (int i=4; i<8; i++) {
			int c=a[i];
			System.out.println(c);
			for (int j=0; j<i; j++) {
				b[i] = a[i];
				for(int u =0; u<i;u++) {
					System.out.println(b[u]);
				}
			}
		}
//		for (int y :c) {
//			System.out.println(y);
//		}
		
	}
}
