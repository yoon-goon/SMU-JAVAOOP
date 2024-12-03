public class FindSeoul {
    public static void main(String[] args) {
        // 문자열 배열 생성
        String[] cities = {"New York", "Beijing", "Seoul"};
        
        // for 문을 사용한 검색
        boolean found = false;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equals("Seoul")) {
                System.out.println(i + " " + cities[i]);
                found = true;
                break;  // 문자열을 찾았으므로 반복 종료
            }
        }

        // 문자열을 찾지 못한 경우
        if (!found) {
            System.out.println("해당 문자열을 찾을 수 없습니다.");
        }

        // for-each 문을 사용한 검색 (다른 방식으로 해결 가능)
        /*
        int index = 0;
        for (String city : cities) {
            if (city.equals("Seoul")) {
                System.out.println(index + " " + city);
                break;
            }
            index++;
        }
        */
    }
}
