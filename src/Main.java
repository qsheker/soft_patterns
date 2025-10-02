import Adapter.adaptee.Xml;
import Adapter.adapter.AdapterBetween;
import Adapter.utils.XMLParser;
import Bridge.ConcreteProccessor.CryptoProcessor;
import Bridge.ConcreteProccessor.PayPalProcessor;
import Bridge.ConcreteProccessor.StripeProcessor;
import Bridge.abstraction.Payment;
import Bridge.abstraction.concretePayments.OfflinePayment;
import Bridge.abstraction.concretePayments.OnlinePayment;
import Bridge.interfaces.PaymentProcessor;
import org.json.JSONObject;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException {
//        VehicleFactory vf = new CarFactory();
//        Vehicle corvette = vf.createVehicle();
//        Vehicle dodge = vf.createVehicle();
//
//        corvette.drive();
//        dodge.drive();

//        ClothesFactory cf = new CasualFactory();
//        SportFactory sf = new SportFactory();
//
//        Shirt shirt = cf.createShirt();
//        Pants pants = cf.createPants();
//        Shoes shoes = sf.createShoes();
//
//        shirt.wear();
//        pants.wear();
//        shoes.wear();

//        // XML -> JSON
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        XMLParser xmlParser = new XMLParser(factory, "employee");
//        Xml xml = new Xml(xmlParser);
//
//        try (PrintWriter writer = new PrintWriter("C:\\Users\\aldik\\IdeaProjects\\SoftwareDesignPatternFold\\src\\Adapter\\result\\converted.json")) {
//            Target adapter = new AdapterBetween(xml, writer);
//            adapter.toJson(new File("src/Adapter/resources/employees.xml"));
//        }
//
//        // JSON -> XML
//        JSONObject json = new JSONObject(
//                new String(java.nio.file.Files.readAllBytes(
//                        java.nio.file.Paths.get("src/Adapter/resources/employees.json")
//                ))
//        );
//
//        try (PrintWriter writer = new PrintWriter("C:\\Users\\aldik\\IdeaProjects\\SoftwareDesignPatternFold\\src\\Adapter\\result\\converted.xml")) {
//            Target adapter = new AdapterBetween(json, writer);
//            adapter.toXml(json);
//        }

        PaymentProcessor paypal = new PayPalProcessor();
        Payment onlinePayPalPayment = new OnlinePayment(paypal);
        onlinePayPalPayment.doPayment(500);

        PaymentProcessor stripe = new StripeProcessor();
        Payment onlineStripePayment = new OfflinePayment(stripe);
        onlineStripePayment.doPayment(100);

        PaymentProcessor crypto = new CryptoProcessor();
        Payment onlineCryptoPayment = new OnlinePayment(crypto);
        onlineCryptoPayment.doPayment(141);


    }
}
