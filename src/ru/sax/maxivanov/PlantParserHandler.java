package ru.sax.maxivanov;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class PlantParserHandler extends DefaultHandler {
    private ArrayList<Plant> plants = null;
    private Plant plant = null;

    public ArrayList<Plant> getPlants() {
        return plants;
    }

    boolean bCommon = false;
    boolean bBotanical = false;
    boolean bZone = false;
    boolean bLight = false;
    boolean bPrice = false;
    boolean bAvailability = false;



    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("Plant")) {
            String id = attributes.getValue("id");
            plant = new Plant();
            plant.setId(Integer.parseInt(id));
            if (plants == null) {
                plants = new ArrayList<>();
            }
        } else if (qName.equalsIgnoreCase("common")) {
            bCommon = true;
        } else if (qName.equalsIgnoreCase("botanical")) {
            bBotanical = true;
        } else if (qName.equalsIgnoreCase("zone")) {
            bZone = true;
        } else if (qName.equalsIgnoreCase("light")) {
            bLight = true;
        } else if (qName.equalsIgnoreCase("price")) {
            bPrice = true;
        } else if (qName.equalsIgnoreCase("availability")) {
            bAvailability = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("plant")) {
            plants.add(plant);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (bCommon) {
            plant.setCommon(new String(ch, start, length));
            bCommon = false;
        } else if (bBotanical) {
            plant.setBotanical(new String(ch, start, length));
            bBotanical = false;
        } else if (bZone) {
            plant.setZone(new String(ch, start, length));
            bZone = false;
        } else if (bLight) {
            plant.setZone(new String(ch, start, length));
            bLight = false;
        } else if (bPrice) {
            plant.setPrice(new String(ch, start, length));
            bPrice = false;
        } else if (bAvailability) {
            plant.setAvailavility(new String(ch, start, length));
            bAvailability = false;
        }
    }
}
