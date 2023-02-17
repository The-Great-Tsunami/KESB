import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;

public class CN_Day01_05_EchoClient {
    public static void main(String[] args) {
        System.out.println("Echo Server");
        try {
            InetAddress localAddress = InetAddress.getLocalHost();  // 127.0.0.1
            Socket clientSocket = null;
            PrintWriter pw = null;
            BufferedReader br = null;
            try{
                clientSocket = new Socket(localAddress, 6000);
                //clientSocket = new Socket("원하는 IP", 6000);
                pw = new PrintWriter(clientSocket.getOutputStream(), true);
                br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                System.out.println("Connected to Server");
                Scanner sc = new Scanner(System.in);
                while (true) {
                    System.out.print("Enter text : ");
                    String line = sc.nextLine();
                    if ("exit".equalsIgnoreCase(line)) {
                        break;  // 종료 조건
                    }
                    pw.println(line);  // 서버로 전송
                    // 서버로 부터 수신받은 객체에서 라인 단위로 문자열 리턴
                    System.out.println("Server Response : " + br.readLine());
                }
            } catch (IOException ex) {
                System.out.println("ERROR!");
            } finally {  // 자원 해제
                clientSocket.close();
                pw.close();
                br.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
