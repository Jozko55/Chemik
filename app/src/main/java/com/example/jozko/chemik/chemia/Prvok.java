package com.example.jozko.chemik.chemia;

/**
 * Created by Jozko on 13.6.2015.
 */
public class Prvok {

    private String nazov;
    private String znacka;
    //private int oxidacne_cislo;
    private String predpona1;
    private String predpona2;

    private int dlzka_nazvu;

    public Prvok(String nazov, String znacka, String predpona1, String predpona2) {
        this.nazov = nazov;
        this.znacka = znacka;
        this.dlzka_nazvu = nazov.length();
        this.predpona1 = predpona1;
        this.predpona2 = predpona2;

        Pomocky.prvky.put(this.znacka, this);
        //this.oxidacne_cislo = oxidacne_cislo;
    }

    public String getZnacka() {
        return znacka;
    }

    /*public int getOxidacne_cislo() {
        return oxidacne_cislo;
    }
    */

    public String getPredpona1() {
        return predpona1;
    }

    public String getPredpona2() {
        return predpona2;
    }

    public int getDlzka_nazvu() {
        return dlzka_nazvu;
    }

    public int dlzka_nazvu() {
        return dlzka_nazvu;
    }

    public String getNazov() {
        return nazov;
    }
}
