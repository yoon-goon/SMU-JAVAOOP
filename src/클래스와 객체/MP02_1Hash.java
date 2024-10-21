import java.util.Scanner;

public class MP02_1Hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = new char[5];
        s[0] = sc.next().charAt(0);
        s[1] = sc.next().charAt(0);
        s[2] = sc.next().charAt(0);
        s[3] = sc.next().charAt(0);
        s[4] = sc.next().charAt(0);
        double hashValue = s[0] * Math.pow(31, 4)
                           + s[1] * Math.pow(31, 3)
                           + s[2] * Math.pow(31, 2)
                           + s[3] * 31
                           + s[4];
        System.out.printf("문자열 %c%c%c%c%c의 해시 값은 %.2f입니다",
                           s[0], s[1], s[2], s[3], s[4], hashValue);
//        System.out.println(s[0]);
//        System.out.println(s[1]);
//        System.out.println(s[2]);
//        System.out.println(s[3]);
//        System.out.println(s[4]);
    }
}
