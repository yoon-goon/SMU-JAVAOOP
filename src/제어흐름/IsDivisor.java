import java.util.Scanner;


public class IsDivisor{
	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (b % a == 0)
			System.out.println("약수임");
		else
			System.out.println("약수아님");
	}
}
	
	