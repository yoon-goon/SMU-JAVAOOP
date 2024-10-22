import java.util.Scanner;

public class ContinueInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;

        	while (true) {
        	    	i = sc.nextInt(); // 사용자 입력 받기
        	    	
        	    	if (i == 0) {
        	    	    continue; // 0이 입력되면 다음 반복으로 넘어감
        	    	}
        	    	
        	    	if (i >= 100) {
        	    	    break; // 100 이상의 값이 입력되면 반복 종료
        	    	}
        	    	
        	    	System.out.printf("%d\n", i); // 0이 아니고 100 미만인 경우 출력
        	}
	}
}