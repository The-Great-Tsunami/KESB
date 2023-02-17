import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.net.URL;
public class CN_Day01_02_IP2 {
    public static void main(String[] args){
        try {
            URL url = new URL("http://www.inha.ac.kr");
            URLConnection urlConnection = url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream())
            );

            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        }
        catch (IOException ex) {
            System.out.println("Do it again");
            // Handle exceptions
        }
    }
}

