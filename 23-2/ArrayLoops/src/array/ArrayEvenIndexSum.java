package array;

public class ArrayEvenIndexSum {
	private static int Sum;

	public static void main(String[] args) {
	
		int[] r = new int[4];
		
	r[0]=10;
	r[1]=20;
	r[2]=30;
	r[3]=40;
	
	for (int i=1; i<r.length; i=i+2) {
		Sum = Sum + r[i];
	}
	System.out.println("Sum of even index array is " + Sum);
	}
}
