class Hello {
    String toWhom = "world";

    // 기본 생성자
    Hello() { }

    // 매개변수를 받는 생성자
    Hello(String whom) { 
        setWhom(whom); 
    }

    // 이름 설정 메서드
    void setWhom(String whom) { 
        toWhom = whom; 
    }

    // 인사 출력 메서드
    void sayHello() {
        System.out.println("hello " + toWhom);
    }
}

public class HelloArray {
    public static void main(String[] args) {
        // Hello 객체 배열 생성
        Hello[] helloArray = new Hello[3];

        // 첫 번째 객체: 기본 생성자 사용
        helloArray[0] = new Hello();

        // 두 번째 객체: "홍길동" 전달
        helloArray[1] = new Hello("홍길동");

        // 세 번째 객체: "허균" 전달
        helloArray[2] = new Hello("허균");

        // sayHello() 메서드 호출
        helloArray[0].sayHello();
        helloArray[1].sayHello();
        helloArray[2].sayHello();
    }
}
