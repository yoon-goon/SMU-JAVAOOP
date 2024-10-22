import java.util.Scanner;


public class Theatre{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String zone = sc.next();
		if (zone.equals("prime")) {
            		System.out.println("11000원");
        	} 
        	else if (zone.equals("standard")) {
        	    	System.out.println("10000원");
        	} 
        	else if (zone.equals("economy")) {
        	    	System.out.println("9000원");
        	} 
        	else {
        	    	System.out.println("잘못 입력했습니다.");
        	}
    }
}
		
		