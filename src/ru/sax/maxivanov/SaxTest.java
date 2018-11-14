package ru.sax.maxivanov;

import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.IOException;
import java.util.ArrayList;

public class SaxTest {

    private static final String XML_PATH = ".\\src\\plant_catalog.xml";

    public static void main(String[] args) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            PlantParserHandler handler = new PlantParserHandler();
            saxParser.parse(XML_PATH, handler);
            ArrayList<Plant> plants = handler.getPlants();
            for (Plant plsnt : plants) {
                System.out.println(plsnt);
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
