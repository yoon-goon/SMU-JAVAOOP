import java.util.Map;
import java.util.HashMap;
import java.io.*;

class MP09 {
	private Map<String, Integer> map;
	private String text;
	private String[] words;
	private String fileName;
	
	public MP09(String fileName) {
		this.fileName = fileName;
		map = new HashMap<String, Integer>();
		text = "";
	}
	
	public void readFileAndCreateText() {
		try {
			BufferReader br = new BufferReader(new FileReader(fileName));
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
			if (map.containskey(word)) {
				int count = map.get(word);
				map.put(word, count + 1);
			}
			else {
				map.put(word, 1);
			}
		}
	}
	
	public static void main(String args[]) {
		MP09 mp09 = new MP09("text.txt");
		mp09.readFileAndCreateText();
		mp09.process();
		
	}
}
		
		