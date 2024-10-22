class SelectStudent {
    private String name;
    private double gradePointAverage; // 평점
    private int incomeQuintile; // 소득 분위

    // 생성자
    public SelectStudent(String name, double gradePointAverage, int incomeQuintile) {
        this.name = name;
        this.gradePointAverage = gradePointAverage;
        this.incomeQuintile = incomeQuintile;
    }

    // 학생 정보를 출력하는 메서드
    public void displayInfo() {
        String scholarshipStatus; // 장학생 후보 여부를 저장할 변수

        // 장학생 후보 여부 판단
        if (gradePointAverage >= 3.5 && incomeQuintile <= 5) {
            scholarshipStatus = "예"; // 후보인 경우
        } else {
            scholarshipStatus = "아니오"; // 후보가 아닌 경우
        }

        // 학생 정보 출력
        System.out.printf("이름: %s, 평점: %.2f, 소득분위: %d, 후보 여부: %s\n",
                name, gradePointAverage, incomeQuintile, scholarshipStatus);
    }
    
    public static void main(String[] args) {
        // 학생 객체 생성 및 초기값 설정
        SelectStudent student1 = new SelectStudent("홍길동", 3.8, 4);
        SelectStudent student2 = new SelectStudent("김철수", 3.4, 3);
        SelectStudent student3 = new SelectStudent("이영희", 3.6, 5);
        SelectStudent student4 = new SelectStudent("박지민", 3.9, 2);
        SelectStudent student5 = new SelectStudent("최수영", 3.5, 6); // 이 학생은 후보가 아님

        // 각 학생의 정보를 출력하고 장학생 후보 여부를 확인
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
        student5.displayInfo();
    }
}
