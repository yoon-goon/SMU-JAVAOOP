import java.io.*;

class MP09 {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("berry.txt");
            int data = f.read();
            while (data != -1) {
                System.out.print((char) data);
                data = f.read(); // 다음 바이트 읽기
            }
            f.close(); // 스트림 닫기
        } catch (IOException e) {
            e.printStackTrace(); // 예외 출력
        }
    }
}
