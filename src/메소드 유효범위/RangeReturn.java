import java.util.Scanner;

public class RangeReturn {

    // 멤버 변수: 합계를 저장하는 변수 (0으로 초기화)
    private static int sum = 0;

    // 정수 범위에 따라 동작하는 함수
    public static void processNumber(int number) {
        // 값이 100보다 크면, sum에 더해서 저장하고 출력
        if (number > 100) {
            sum += number;  // 현재 sum에 입력받은 number를 더함
            System.out.println("현재 합계는: " + sum);  // 합계 출력
        }
        // 값이 50보다 크고 100보다 작거나 같으면, sum 출력
        else if (number > 50 && number <= 100) {
            System.out.println("현재 저장된 합계는: " + sum);  // 현재 저장된 sum 출력
        }
        // 값이 50보다 작거나 같으면 아무것도 하지 않고 종료
        else if (number <= 50) {
            return;  // 아무것도 하지 않고 함수 종료
        }
    }

    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 정수 입력 받기
        System.out.print("정수를 입력하세요: ");
        int number = scanner.nextInt();

        // 입력된 숫자에 따라 다른 동작 수행
        processNumber(number);  // processNumber 함수 호출

        // Scanner 객체 닫기
        scanner.close();
    }
}
