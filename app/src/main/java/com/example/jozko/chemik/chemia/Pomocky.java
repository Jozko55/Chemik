package com.example.jozko.chemik.chemia;

import java.util.HashMap;

/**
 * Created by Jozko on 13.6.2015.
 */
public class Pomocky {
    public static final HashMap<String, String> ZNACKY = new HashMap<String, String>();
    public static final HashMap<String, String> PREDPONY1 = new HashMap<String, String>();
    public static final HashMap<String, String> PREDPONY2 = new HashMap<String, String>();
    static {
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
