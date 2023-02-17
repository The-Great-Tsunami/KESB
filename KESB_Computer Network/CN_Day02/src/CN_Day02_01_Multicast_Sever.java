import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class CN_Day02_01_Multicast_Sever {
    public static void main(String args[]) {
        System.out.println("Multicast  Time Server");
        DatagramSocket serverSocket = null;

        try {
            serverSocket = new DatagramSocket();

            while (true) {
                String dateText = new Date().toString();
                byte[] buffer = new byte[256];
                buffer = dateText.getBytes();

                InetAddress group = InetAddress.getByName("224.0.0.7");
                DatagramPacket packet;
                packet = new DatagramPacket(buffer, buffer.length, group, 10000);
                serverSocket.send(packet);
                System.out.println("Time sent: " + dateText);

                try {
                    Thread.sleep(1000); // 1초 단위 딜레이
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                    // Handle exception
                }
            }

        }
        catch (IOException ex){
            // Handle exception
        }
    }
}