import java.util.Scanner;

public class MP01Triangle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변의 길이 입력: ");
		int a = sc.nextInt();
		System.out.println("area = " + (Math.sqrt(3)/4 * a * a));
		System.out.print("X1 입력: ");
		int x1 = sc.nextInt();
		System.out.print("Y1 입력: ");
		int y1 = sc.nextInt();
		System.out.print("X2 입력: ");
		int x2 = sc.nextInt();
		
		int width = x2 - x1;
		
		double height = Math.sqrt(3) / 2 * width;
		double area = width * height / 2;
		System.out.printf("area = %f\n", area);
		System.out.printf("x3 = %f, y2 = %f\n", (x2 - x1) / 2. + x1, y1 + height);
	}
}
