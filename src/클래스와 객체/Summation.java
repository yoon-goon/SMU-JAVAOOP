class Summation {
    int value1, value2;

    // 두 개의 매개변수를 받는 생성자
    Summation(int value1, int value2) {
        this(value1);  // 다른 생성자를 호출
        this.value2 = value2;  // value2 초기화
    }

    // 한 개의 매개변수를 받는 생성자
    Summation(int value1) {
        this.value1 = value1;  // value1 초기화
        this.value2 = 0;       // value2를 0으로 초기화
    }

    // value1과 value2의 합을 반환하는 메서드
    int getResult() {
        return value1 + value2;
    }
    public static void main(String[] args) {
        Summation sum1 = new Summation(5, 10);  // 첫 번째 생성자 호출
        Summation sum2 = new Summation(7);      // 두 번째 생성자 호출

        System.out.println("sum1 결과: " + sum1.getResult()); // 5 + 10
        System.out.println("sum2 결과: " + sum2.getResult()); // 7 + 0
    }
}

    
    
