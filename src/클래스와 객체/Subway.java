import java.util.Scanner;

public class Subway{
	int stationNum;
	
	void whichStation(int num){
		stationNum = num;
	}
	
	void run(){
		System.out.println(stationNum+"호선을 달리고 있습니다.");
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Subway sb = new Subway();
		sb.whichStation(sc.nextInt());
		sb.run();
	}
}
		
		