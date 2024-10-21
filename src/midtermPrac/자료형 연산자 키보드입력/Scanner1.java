import java.util.Scanner;

class Scanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 키보드 입력
		String a = sc.next();
		System.out.println("문자열 출력: %s\n",a);
		int b = sc.nextInt();
		System.out.println("정수 출력: %d", b);
		}
}

		