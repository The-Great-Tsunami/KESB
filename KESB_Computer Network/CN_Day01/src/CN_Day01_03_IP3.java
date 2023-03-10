import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class CN_Day01_03_IP3 {
    public static void main(String[] args){
        try {
            URL url = new URL("http://www.inha.ac.kr");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();

            ReadableByteChannel channel = Channels.newChannel(inputStream);
            ByteBuffer buffer = ByteBuffer.allocate(64);

            String line = null;

            while (channel.read(buffer) > 0) {
                System.out.println(new String(buffer.array()));
                buffer.clear();
            }
            channel.close();
            }
            catch (IOException ex) {
            // Handle exceptions
            }
    }
}
