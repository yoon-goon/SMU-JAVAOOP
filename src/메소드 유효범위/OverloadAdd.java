public class OverloadAdd {

    // 두 int 값을 더하는 함수
    public int add(int a, int b) {
        // int형 인자 두 개의 합을 반환
        return a + b;
    }

    // 두 double 값을 더하는 함수
    public double add(double a, double b) {
        // double형 인자 두 개의 합을 반환
        return a + b;
    }

    // 두 문자열을 연결하는 함수 (중간에 공백 포함)
    public String add(String a, String b) {
        // 두 문자열을 연결하면서 중간에 공백 삽입
        return a + " " + b;
    }

    public static void main(String[] args) {
        // Add 클래스의 인스턴스 생성
        Add adder = new Add();

        // int형 인자 테스트
        int intResult = adder.add(10, 20);
        System.out.println("int 합: " + intResult);

        // double형 인자 테스트
        double doubleResult = adder.add(10.5, 20.3);
        System.out.println("double 합: " + doubleResult);

        // String형 인자 테스트
        String stringResult = adder.add("Hello", "World");
        System.out.println("문자열 연결: " + stringResult);
    }
}
