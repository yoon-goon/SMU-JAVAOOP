import java.util.Scanner;

public class BreakInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		while (true){
			if (i == 0)
				break;
			System.out.printf("%d\n", i);
			i = sc.nextInt();
		}		
	}
}