public class coffee{
	String origin;
	String degreeOfRoast = "볶아지지않은";
	
	coffee(String origin){
		this.origin = origin;
	}
	
	 public void roast(String degreeOfRoast) { 
	 	 System.out.println(degreeOfRoast + origin + " 커피를 볶고 있습니다.");
	 	 this.degreeOfRoast = degreeOfRoast;
    }

    // 갈기 메서드
    public void grind() {
        	System.out.println(degreeOfRoast + origin + " 커피를 갈고 있습니다.");
    }

    // 내리기 메서드
    public void brew() {
        	System.out.println(degreeOfRoast + origin + " 커피를 내리고 있습니다.");
    }
    
    public static void main(String[] args){
    	coffee cf = new coffee("콜롬비아");
    	
    	cf.roast("볶아진"); // 문제있는 코드  degreeOfRoast가 먼저 변경되는 문제가 있음
    	cf.grind();
    	cf.brew();
    }
}
		