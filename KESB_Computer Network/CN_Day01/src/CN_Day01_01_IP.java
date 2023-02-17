import java.net.InetAddress;
import java.net.UnknownHostException;

public class CN_Day01_01_IP {
    public static void main(String[] args){
        try {
            InetAddress address = InetAddress.getByName("www.inha.ac.kr");
            //InetAddress address = InetAddress.getByName("www.kiminha.ac.kr");
            System.out.println(address);
            System.out.println(address.getCanonicalHostName());
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
        } catch (UnknownHostException e) {
            //throw new RuntimeException(e);
            System.out.println("해당 url은 존재하지 않습니다.");
        }
    }
}
