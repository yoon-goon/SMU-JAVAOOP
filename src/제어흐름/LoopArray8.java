public class LoopArray8 {
	public static void main(String[] args) {
		double arr[] = {1.1, 2.3, 4.7, 7.5 };
		System.out.printf("%d\n",arr.length);

		for(int i = 0; i < 4; i++)
			System.out.printf("%.2f\n",arr[i]);
	}
}