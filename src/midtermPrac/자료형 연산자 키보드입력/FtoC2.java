import java.util.Scanner;

public class FtoC2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double f = sc.nextDouble();
		
		double c = ((float)5 / 9) * (f - 32);
		
		System.out.printf("화씨 %f 는 섭씨 %.1f 입니다.", f, c);
	}
}