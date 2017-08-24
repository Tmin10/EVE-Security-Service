package ru.tmin10.EveSecurityService.Utils;

import java.util.HashMap;

public class GameConstants
{
    public static final HashMap<Integer, String> RACES;
    public static final HashMap<Integer, String> BLOODLINES;

    static
    {
        RACES = new HashMap<>();
        RACES.put(1, "Caldari");
        RACES.put(2, "Minmatar");
        RACES.put(4, "Amarr");
        RACES.put(8, "Gallente");

        BLOODLINES = new HashMap<>();
        BLOODLINES.put(1, "Deteis");
        BLOODLINES.put(2, "Civire");
        BLOODLINES.put(3, "Sebiestor");
        BLOODLINES.put(4, "Brutor");
        BLOODLINES.put(5, "Amarr");
        BLOODLINES.put(6, "Ni-Kunni");
        BLOODLINES.put(7, "Gallente");
        BLOODLINES.put(8, "Intaki");
        BLOODLINES.put(9, "Static");
        BLOODLINES.put(10, "Modifier");
        BLOODLINES.put(11, "Achura");
        BLOODLINES.put(12, "Jin-Mei");
        BLOODLINES.put(13, "Khanid");
        BLOODLINES.put(14, "Vherokior");
        BLOODLINES.put(19, "Drifter");
    }
}