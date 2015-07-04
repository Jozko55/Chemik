package com.example.jozko.chemik.chemia;

import java.util.HashMap;

/**
 * Created by Jozko on 13.6.2015.
 */
public class Pomocky {
    public static final HashMap<String, String> ZNACKY = new HashMap<String, String>();
    public static final HashMap<String, String> PREDPONY1 = new HashMap<String, String>();
    public static final HashMap<String, String> PREDPONY2 = new HashMap<String, String>();

    public static HashMap<String, Prvok> prvky = new HashMap<String, Prvok>();

    static {
        new Prvok("Sodik", "Na", "sod", "sod");
        new Prvok("Litium", "Li", "lit", "lit");
        new Prvok("Zelezo", "Fe", "zelez", "zelez");
        new Prvok("Uhlik", "C", "uhol", "uhl");
        new Prvok("Vodik", "H", "vod", "vod");
        new Prvok("Dusik", "N", "dus", "dus");
        new Prvok("Kyslik", "O", "kyslic", "kyslic");
        new Prvok("Horcik", "Mg", "horec", "horec");
        Prvok hlinnik = new Prvok("Hlinnik", "Al", "hlin", "hlin");
        Prvok zlato = new Prvok("Zlato", "Au", "zlat", "zlat");
        Prvok striebro = new Prvok("Striebro", "Ag", "striebor", "striebr");
        Prvok osmium = new Prvok("Osmium", "Os", "osmi", "osm");
        Prvok olovo = new Prvok("Olovo", "Pb", "olov", "olov");
        Prvok cin = new Prvok("Cin", "Sn", "cin", "cin");
        Prvok antimon = new Prvok("Antimon", "St", "antimon", "antimon");
        Prvok brom = new Prvok("Brom", "Br", "brom", "brom");
        Prvok bor = new Prvok("Bor", "B", "bor", "bor");
        Prvok jod = new Prvok("Jod", "I", "jod", "jod");
        Prvok chlor = new Prvok("Chlor", "Cl", "chlor", "chlor" );
        Prvok sira = new Prvok("Sira", "S", "sir", "sir");
        Prvok fluor = new Prvok("Fluor", "F", "fluor", "fluor");
        Prvok fosfor = new Prvok("Fosfor", "P", "fosfor", "fosfor");
        Prvok kremik = new Prvok("Kremik", "Si", "krem", "krem");
        Prvok telur = new Prvok("Telur", "Te", "telur", "telur");
        Prvok zinok = new Prvok("Zinok", "Zn", "zinoc", "zinoc");
        Prvok ortut = new Prvok("Ortut", "Hg", "ortut", "ortut");

        ZNACKY.put("Sira", "S");
        ZNACKY.put("Sodik", "Na");
        ZNACKY.put("Uhlik", "C");
        ZNACKY.put("Horcik", "Mg");
        ZNACKY.put("Bor", "B");
        ZNACKY.put("Zelezo", "Fe");
        ZNACKY.put("Draslik", "K");
        ZNACKY.put("Litium", "Li");
        ZNACKY.put("Fosfor", "P");
        ZNACKY.put("Chlor", "Cl");
        ZNACKY.put("Kremik", "Si");

        PREDPONY2.put("S", "sir");
        PREDPONY2.put("Na", "sod");
        PREDPONY2.put("C", "uhl");
        PREDPONY2.put("Mg", "horec");
        PREDPONY2.put("B", "bor");
        PREDPONY2.put("Fe", "zelez");
        PREDPONY2.put("K", "dras");
        PREDPONY2.put("Li", "lit");
        PREDPONY2.put("P", "fosfor");
        PREDPONY2.put("Cl", "clor");
        PREDPONY2.put("Si", "krem");

        PREDPONY1.put("S", "sir");
        PREDPONY1.put("Na", "sod");
        PREDPONY1.put("C", "uhol");
        PREDPONY1.put("Mg", "horec");
        PREDPONY1.put("B", "bor");
        PREDPONY1.put("Fe", "zelez");
        PREDPONY1.put("K", "dras");
        PREDPONY1.put("Li", "lit");
        PREDPONY1.put("P", "fosfor");
        PREDPONY1.put("Cl", "clor");
        PREDPONY1.put("Si", "krem");
    }
}
