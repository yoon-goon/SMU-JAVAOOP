import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 사용자 입력을 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 좌석 종류 입력 받기
        System.out.print("원하는 좌석 종류를 입력하세요 (prime, standard, economy): ");
        String seatType = scanner.nextLine().toLowerCase();  // 입력을 소문자로 변환

        // switch문을 사용하여 좌석 종류에 따른 가격 출력
        switch (seatType) {
            case "economy":
                System.out.println("economy 좌석의 가격은 9000원입니다.");
                break;
            case "standard":
                System.out.println("standard 좌석의 가격은 10000원입니다.");
                break;
            case "prime":
                System.out.println("prime 좌석의 가격은 11000원입니다.");
                break;
            default:
                System.out.println("좌석 종류를 잘못 입력했습니다.");
        }

        // Scanner 객체 닫기
        scanner.close();
    }
}
