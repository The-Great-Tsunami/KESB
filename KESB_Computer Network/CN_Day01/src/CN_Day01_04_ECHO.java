import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CN_Day01_04_ECHO {
    public static void main(String[] args){
        System.out.println("simple Echo Server");

        // Java.try-with-resource
        //try구문에서 ()를 사용하면 try 블록의 동작완료 후 실행이 종료된다. python의 with와 같음.
        try (ServerSocket serverSocket = new ServerSocket(6000)) {
            System.out.println("Waiting for connection.....");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connected to client");
        }
        catch (IOException ex) {
            // Handle exceptions
        }
    }
}

