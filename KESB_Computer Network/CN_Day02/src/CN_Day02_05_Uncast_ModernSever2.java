import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CN_Day02_05_Uncast_ModernSever2 {
    public static void main(String[] args) {
        System.out.println("Echo Server start");
        try (ServerSocket serverSocket = new ServerSocket(6000)) {
            System.out.println("Waiting for connection to client");
            Socket clientSocket = serverSocket.accept();  // 접속 대기
            System.out.println("Connected to Client");

            try (
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(clientSocket.getInputStream()));
                    PrintWriter pw =
                            new PrintWriter(clientSocket.getOutputStream(), true))
            {
                Supplier<String> socketIn = () -> {
                    try {
                        return br.readLine();
                    } catch (IOException ex) {
                        return null;
                    }
                };

                Stream
                        .generate(() -> {
                            try {
                                return br.readLine();
                            } catch (IOException ex) {
                                return null;
                            }
                        })
                        .peek(text -> {
                            System.out.println("클라이언트로 부터 받은 메세지 : " + text);
                            pw.println(text);
                        })
                        .allMatch(Objects::nonNull);
        }
        catch (IOException ex) {
            System.out.println("IOException!");
        }
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}