import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CN_Day01_06_EchoSever {
    public static void main(String[] args) {
        System.out.println("Echo Server start");
        try (ServerSocket serverSocket = new ServerSocket(6000)) {
            System.out.println("Waiting for connection to client");
            Socket clientSocket = serverSocket.accept();  // 접속 대기
            System.out.println("Connected to Client");

            BufferedReader br = null;
            PrintWriter pw = null;
            try {
                br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                pw = new PrintWriter(clientSocket.getOutputStream(), true); //true => 버퍼가 가득차면 전송 후 버퍼 비움
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println("response : " + line);
                    pw.println(line);  // 클라이언트로 송신
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                br.close();
                pw.close();
            }
        }
        catch (IOException ex) {
            System.out.println("IOException!");
        }
    }
}