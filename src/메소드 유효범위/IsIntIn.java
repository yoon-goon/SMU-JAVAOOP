import java.util.Scanner;

public class IsIntIn {

    // 정수값을 출력하는 함수
    public static void printNumber(int number) {
        System.out.println("입력한 정수는: " + number);
    }

    // 정수가 범위 내에 있는지 확인하는 함수
    public static boolean isInRange(int number, int lowerBound, int upperBound) {
        return number >= lowerBound && number <= upperBound;
    }

    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 정수 입력 받기
        System.out.print("1~100 이내의 정수를 입력하세요: ");
        int number = scanner.nextInt();

        // 입력받은 정수가 1~100 범위 내에 있는지 확인
        if (isInRange(number, 1, 100)) {
            // 범위 내에 있으면 출력
            printNumber(number);
        } else {
            // 범위 밖이면 경고 메시지 출력
            System.out.println("1~100 범위 밖 정수가 입력되었습니다.");
        }

        // Scanner 객체 닫기
        scanner.close();
    }
}
