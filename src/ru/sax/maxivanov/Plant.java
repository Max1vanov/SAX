package ru.sax.maxivanov;

public class Plant {

    String common, botanical, zone, light, price, availavility;

    public Plant(String common, String botanical, String zone, String light, String price, String availavility) {
        this.common = common;
        this.botanical = botanical;
        this.zone = zone;
        this.light = light;
        this.price = price;
        this.availavility = availavility;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public String getbotanical() {
        return botanical;
    }

    public void setbotanical(String botanical) {
        this.botanical = botanical;
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

    @Override
    public String toString() {
        return "Plant{" +
                "common= " + common + ' ' +
                ", botanical= " + botanical + ' ' +
                ", zone='" + zone + ' ' +
                ", light='" + light + ' ' +
                ", price='" + price + ' ' +
                ", availavility='" + availavility + '\n';
    }
}
