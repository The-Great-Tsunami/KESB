import java.net.InetAddress;
import java.net.UnknownHostException;

public class dd {
    InetAddress address = null;
    public static void main(String[] args) throws UnknownHostException {

        InetAddress names[] = InetAddress.getAllByName("www.pornhub.com");
        for(InetAddress element : names) {
            System.out.println(element);
        }



        InetAddress address = InetAddress.getByName("www.packtpub.com");
        displayInetAddressInformation(address);

    }

    private static void displayInetAddressInformation(
            InetAddress address) {
        System.out.println(address);
        System.out.println("CanonicalHostName: " + address.getCanonicalHostName());
        System.out.println("HostName: " + address.getHostName());
        System.out.println("HostAddress: " + address.getHostAddress());
    }
}