import java.util.Scanner;

public class WhileQuit {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "new";
		s = sc.next();

		while (s.equals("quit") == false) {
		System.out.printf("%s \n",s);
		s = sc.next();
		
		}
		
	}
}