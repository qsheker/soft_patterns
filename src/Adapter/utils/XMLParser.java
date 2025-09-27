package Adapter.utils;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class XMLParser {
    private DocumentBuilder documentBuilder;

    private String tagName;

    public XMLParser(DocumentBuilderFactory factory, String tagName) throws ParserConfigurationException {
        this.documentBuilder = factory.newDocumentBuilder(); this.tagName = tagName;
    }

    public String read(File file) throws IOException {
        return new String(Files.readAllBytes(file.toPath()));
    }
}