import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;

public class HttpRequest {

    public String Request(URI bnmURL){

        HttpURLConnection con = null;
        StringBuilder response = new StringBuilder();
        try {
            con = (HttpURLConnection) bnmURL.toURL().openConnection();
            con.setRequestMethod("GET");

            BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
            }
            rd.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        return response.toString();
    }
}
