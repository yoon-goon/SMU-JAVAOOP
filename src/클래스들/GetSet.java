public class GetSet {
    // private 필드
    private String name;
    private int age;

    // Getter 메소드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter 메소드
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) { // 유효성 검사
            this.age = age;
        }
    }
}

// 사용 예
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        
        // Setter 메소드를 통해 필드 값 설정
        person.setName("John");
        person.setAge(30);
        
        // Getter 메소드를 통해 필드 값 가져오기
        System.out.println("이름: " + person.getName());
        System.out.println("나이: " + person.getAge());
    }
}
/*
코드 설명:
Person 클래스에는 name과 age라는 private 필드가 있습니다.
getName()과 getAge()는 각각의 필드 값을 반환하는 getter 메소드입니다.
setName(String name)과 setAge(int age)는 각각의 필드 값을 설정하는 setter 메소드입니다. setAge 메소드는 나이가 0보다 큰 경우에만 값을 설정하도록 유효성 검사를 포함합니다.
Main 클래스에서 Person 객체를 생성한 후, setter 메소드를 통해 값을 설정하고, getter 메소드를 통해 값을 가져와 출력합니다.
*/
