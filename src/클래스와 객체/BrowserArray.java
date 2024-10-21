public class BrowserArray {
	public static void main(String[] args) {
		String[] arr = {"Google Chrome", "Microsoft Edge", "Mozilla Firefox", "Naver Whale"};
		String[] arr2 = new String[4];
		arr2[0] = "Google Chrome";
       	arr2[1] = "Microsoft Edge";
        	arr2[2] = "Mozilla Firefox";
        	arr2[3] = "Naver Whale";
        	
        	System.out.printf("%s, %d\n",arr2[0],arr2[0].length());
        	System.out.printf("%s, %d\n",arr2[1],arr2[1].length());
        	System.out.printf("%s, %d\n",arr2[2],arr2[2].length());
        	System.out.printf("%s, %d\n",arr2[3],arr2[3].length());
    }
}