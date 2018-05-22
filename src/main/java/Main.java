import org.apache.http.client.utils.URIBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;

public class Main {


    public static void main(String[] args) throws IOException, URISyntaxException {
        // Creating an instance of the test URL
        URI bnmURL = new URIBuilder(Property.readProperties().getProperty("bnmURL"))
                .addParameter("date", "13.02.2018")
                .build();

        System.out.println(bnmURL);

        HttpRequest r1 = new HttpRequest();
        String response = r1.Request(bnmURL);
        System.out.println(response);

        XStream xstream = new XStream();
        xstream.alias("Valute", Valute.class);
        xstream.alias("ValCurs", ValCurs.class);
    //the commented lines + addimplicitcollection is an example of serialization using addimplicitcollection
    // 1st case  - not using the addimplicitcollection
/*        <ValCurs>
            <currencies>
                <Valute>
                    <NumCode>111</NumCode>
		            <CharCode>EUR</CharCode>
		            <Nominal>45</Nominal>
		            <Name>Euro</Name>
		            <Value>98</Value>
                </Valute>
            </currencies>
        </ValCurs>
*/
    //2nd case - using addimplicitcollection
/*        <ValCurs>
                <Valute>
                    <NumCode>111</NumCode>
		            <CharCode>EUR</CharCode>
		            <Nominal>45</Nominal>
		            <Name>Euro</Name>
		            <Value>98</Value>
                </Valute>
        </ValCurs>
*/
/*
        Valute valuta1 = new Valute();
        valuta1.setCharCode("EUR");
        valuta1.setName("Euro");
        valuta1.setNominal(45);
        valuta1.setNumCode("111");
        valuta1.setValue(98);

        Valute valuta2 = new Valute();
        valuta2.setCharCode("USD");
        valuta2.setName("US Dollar");
        valuta2.setNominal(22);
        valuta2.setNumCode("22222");
        valuta2.setValue(44);

        ArrayList<Valute> buzunar = new ArrayList<Valute>();
        buzunar.add(valuta1);
        buzunar.add(valuta2);

        ValCurs valCurs1 = new ValCurs();
        h.setCurrencies(buzunar);
*/
        xstream.addImplicitCollection(ValCurs.class, "currencies");
/*        String rateSer = xstream.toXML(valCurs1);
        System.out.println(rateSer);
*/

        ValCurs myObj = (ValCurs) xstream.fromXML(response);
        //getting the arraylist of objects of Valute type
        ArrayList<Valute> myArrayList = myObj.getCurrencies();
        System.out.println(myArrayList);
    }
}