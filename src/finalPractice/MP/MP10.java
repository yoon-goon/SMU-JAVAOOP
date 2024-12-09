import java.io.*;

class MP10 {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("java MP10 원본_파일_이름 대상_파일_이름");
		}
		else{
			try {
				BufferedReader br = new BufferedReader(new FileReader(args[0]));
				BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
				String line = br.readLine();
				while (line != null) {
					bw.write(line+"\n");
					line = br.readLine();
				}
				br.close();
				bw.close();
			}
			catch (FileNotFoundException e) {
				System.out.printf("파일 %s 또는 %s를 찾을 수 없습니다");
			}
			catch (IOException e) {
				System.out.printf("파일입출력 과정에서 오류가 발생");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}