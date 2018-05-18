
import org.apache.http.client.utils.URIBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class Main {


    public static void main(String[] args) throws IOException, URISyntaxException {
        URI bnmURL = new URIBuilder(Property.readProperties().getProperty("bnmURL"))
                .addParameter("date", "13.02.2018")
                .build();

        System.out.println(bnmURL);
        HttpRequest r1 = new HttpRequest();
        String result = r1.Request(bnmURL);
        System.out.println(result);



        result = "<Valute ID=\"47\"><NumCode>784</NumCode><CharCode>AED</CharCode><Nominal>1</Nominal><Name>U.A.E. Dirham</Name><Value>4.5636</Value></Valute>";
        XStream xstream = new XStream();
        xstream.alias("Valute", Rate.class);
        Rate myObj = (Rate) xstream.fromXML(result);
        System.out.println(myObj);

    }
}