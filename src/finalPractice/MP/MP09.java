// 파일에서 텍스트 split 하기


import java.util.Map;
import java.util.HashMap;
import java.io.*;

class MP09 {
	private Map<String, Integer> map;
	private String text;
	private String fileName;
	
	public MP09(String fileName) {
		this.fileName = fileName;
		map = new HashMap<String, Integer>();
		text = "";
	}
	
	public void readFileAndCreateText() { // 파일입출력은 다 try catch 안에
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();
			while (line != null) {
				text += line;
				line = br.readLine();
			}
			br.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void process() {
		String[] words = text.split("[\t\n :.,;-]");
		for (String word : words) {
			word = word.trim(); // 양쪽 끝 공백 제거
			if (!word.equals("") && map.containsKey(word)) { // 이미 있는경우
				int count = map.get(word);
				map.put(word, count + 1);
			}
			else { // 여기 처리를 바꿔야 공백 1번 들어가는 문제 수정 가능
				map.put(word, 1);
			}
		}
	}
	
	public String toString() {
		String s = "";
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			s += entry.getKey() + "=" + entry.getValue() + "\n";
		}
		return s;
	}
	
	
	public static void main(String args[]) {
		MP09 mp09 = new MP09("text.txt");
		mp09.readFileAndCreateText();
		mp09.process();
		System.out.println(mp09);
		
	}
}
		
		