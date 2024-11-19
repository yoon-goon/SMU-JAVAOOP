public class Recursion {
    // 재귀적으로 1부터 n까지의 합을 구하는 함수
    public static long sum(int n) {
        // 기저 사례: n이 1일 때, 1을 반환
        if (n == 1) {
            return 1;
        }
        // 재귀 호출: n과 n-1까지의 합을 구함
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        // 1부터 100까지의 합을 구함
        long result = sum(100);
        System.out.println("1부터 100까지의 합: " + result);
    }
}
