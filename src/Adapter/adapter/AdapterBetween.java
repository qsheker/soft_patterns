package Adapter.adapter;

import Adapter.adaptee.Xml;
import Adapter.target.Target;
import org.json.JSONObject;
import org.json.XML;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class AdapterBetween implements Target {
    private Xml xml;
    private JSONObject json;
    private PrintWriter printWriter;

    public AdapterBetween(Xml xml, PrintWriter printWriter){
        this.xml = xml;
        this.printWriter = printWriter;
        this.json = null;
    }
    public AdapterBetween(JSONObject json, PrintWriter printWriter){
        this.json = json;
        this.printWriter = printWriter;
        this.xml = null;
    }

    @Override
    public void toJson(File file) throws IOException {
        String content = xml.parse(file);
        this.json = XML.toJSONObject(content);
        printWriter.write(this.json.toString(4));
        printWriter.flush();
    }

    @Override
    public void toXml(JSONObject json) {
        String xmlContent = XML.toString(json);
        printWriter.write(xmlContent);
        printWriter.flush();
    }
}
