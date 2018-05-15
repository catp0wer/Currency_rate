
import org.apache.http.client.utils.URIBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Main {


        public static void main(String[] args) throws IOException, URISyntaxException {
            URI bnmURL = new URIBuilder(Property.readProperties().getProperty("bnmURL"))
                    .addParameter("date", "13.02.2018")
                    .build();

            System.out.println(bnmURL);

    }
}
