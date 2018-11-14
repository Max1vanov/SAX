package ru.sax.maxivanov;

public class Plant {

    private String common, botanical, zone, light, price, availavility;
    private int id;

    public Plant(String common, String botanical, String zone, String light, String price, String availavility, int id) {
        this.common = common;
        this.botanical = botanical;
        this.zone = zone;
        this.light = light;
        this.price = price;
        this.availavility = availavility;
        this.id = id;
    }

    public Plant(){};

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAvailavility() {
        return availavility;
    }

    public void setAvailavility(String availavility) {
        this.availavility = availavility;
    }

    public String getBotanical() {
        return botanical;
    }

    public void setBotanical(String botanical) {
        this.botanical = botanical;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Plant: " + " id= " + this.id + ' ' +
                "common= " + this.common + ' ' +
                ", botanical= " + this.botanical + ' ' +
                ", zone='" + this.zone + ' ' +
                ", light='" + this.light + ' ' +
                ", price='" + this.price + ' ' +
                ", availavility='" + this.availavility + '\n';
    }
}
