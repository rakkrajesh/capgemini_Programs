package array;

public class ArrayOddIndexSum {
	private static int Sum;

	public static void main(String[] args) {
		
		int[] f = {5, 6, 7, 8, 9, 999};
		
		for (int i=0; i<f.length; i=i+2) {
			Sum = Sum + f[i];
		}
		System.out.println("Sum of odd index is "+ Sum);
	}
}
