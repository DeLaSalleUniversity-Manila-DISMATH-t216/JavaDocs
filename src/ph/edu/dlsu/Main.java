package ph.edu.dlsu;

import ph.edu.dlsu.press.OlivePress;
import ph.edu.dlsu.olives.Kalamata;
import ph.edu.dlsu.olives.Ligurian;
import ph.edu.dlsu.olives.Olive;

import java.util.ArrayList;

/**
 * This is the main class for the app
 * @author Aenon
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        ArrayList<Olive> olives = new ArrayList<Olive>();

        Olive olive;

        olive = new Kalamata();
        olives.add(olive);

        olive = new Ligurian();
        olives.add(olive);

        olive = new Kalamata();
        olives.add(olive);

        OlivePress press = new OlivePress();
        press.getOil(olives);

        System.out.println("You have " + press.getTotalOil() +
                " units of oil");

        press.getOil(olives);

        System.out.println("Now you have " + press.getTotalOil() +
                " units of oil");

        Kalamata olive1 = (Kalamata)olives.get(0);
        System.out.println("Olive 1 is from " + olive1.getOrigin());
    }

}
