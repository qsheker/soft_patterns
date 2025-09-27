package Adapter.adaptee;

import Adapter.utils.XMLParser;

import java.io.File;

public class Xml {
    private XMLParser xmlReader;

    public Xml(XMLParser xmlReader){
        this.xmlReader = xmlReader;
    }
    public String parse(File file){
        String nodes = null;
        try{
            nodes = xmlReader.read(file);
        }catch (Exception e){
            e.printStackTrace();
        }
        return nodes;
    }
}
