import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CN_Day02_04_Uncast_ModernSever {
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

            Stream s = Stream.generate(socketIn);
            s.map(text -> {
                System.out.println("messege to cilent : " + text);
                pw.println(text);
                return text;
                }).allMatch(t -> t != null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        catch (IOException ex) {
            System.out.println("IOException!");
        }
    }
}