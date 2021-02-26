package fr.sad.liteskyapi.number;

import java.text.DecimalFormat;

public class Numberutils {

    public static String formatFloat(float value){
        return new DecimalFormat("#.#").format(value);
    }

}
