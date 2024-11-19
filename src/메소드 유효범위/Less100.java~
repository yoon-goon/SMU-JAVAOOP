import java.util.Scanner;

public class Less100 {

    // 전달된 정수가 100보다 작은지 확인하는 함수
    public static boolean isLessThan100(int number) {
        return number < 100;
    }

    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 정수 입력 받기
        System.out.print("정수를 입력하세요: ");
        int number = scanner.nextInt();

        // 입력받은 정수가 100보다 작은지 확인
        if (isLessThan100(number)) {
            System.out.println("입력한 정수는 100보다 작습니다.");
        } else {
            System.out.println("입력한 정수는 100보다 크거나 같습니다.");
        }

        // Scanner 객체 닫기
        scanner.close();
    }
}
