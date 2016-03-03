package ph.edu.dlsu.olives;

/**
 * This is a superclass for all olives
 */

public class Olive {

    /**
     * This is for the black olives
     */

    public static final long BLACK = 0x000000;

    /**
     * This is for the green olives
     */

    public static final long GREEN = 0x00FF00;

    public String name = "Kalamata";
    public String flavor = "Grassy";
    public long color = Olive.BLACK;
    private int oil = 3;
    protected boolean crushed=false;

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public Olive() {
        System.out.println("Constructor of " + this.name);
    }

    public Olive(int oil) {
        setOil(oil);
    }

    /**
     * Call this to crush a single olive
     */

    public int crush() {
        System.out.println("You crushed a " + this.name + " olive");
        return oil;
    }

}
