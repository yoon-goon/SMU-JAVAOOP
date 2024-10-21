import java.util.Scanner;

class Scanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 키보드 입력
		String a = sc.next();
		System.out.printf("문자열입력: %s ",a);
		int b = sc.nextInt();
		System.out.printf("정수 입력: %d", b);
		}
}

		