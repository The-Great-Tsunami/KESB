import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// IP 165.246.115.165 포트 20000

public class CN_Day02_06_TreadServer implements Runnable {
    // 다중 접속 에코 서버
    private static Socket clientSocket;
    public CN_Day02_06_TreadServer(Socket clientSocket)
    {
        this.clientSocket = clientSocket;
    }
    public static void main(String[] args) {
        ExecutorService eService = Executors.newFixedThreadPool(5);  // 5 threads
        System.out.println("Multi Tread Echo Server");

        try (ServerSocket serverSocket = new ServerSocket(20000)) {
            while (true) {
                System.out.println("waiting for connection to cilent");
                clientSocket = serverSocket.accept();
                CN_Day02_06_TreadServer tes = new CN_Day02_06_TreadServer(clientSocket);
                eService.submit(tes);
            }
        } catch (IOException ex) {
            System.out.println("IOException!");
        }
        System.out.println("Multi Tread Echo Server end");
        eService.shutdown();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " Tread Connection");
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)
        ) {
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                System.out.println(Thread.currentThread() +" message to client: " + inputLine);
                out.println(inputLine);
            }
            System.out.println(Thread.currentThread() +" client disconnection"); }
        catch (IOException ex)
        {
            System.out.println("IOException!");
        }
    }
}