package _20204_08_25_reflection.lamps;

/**
 *  * 2.электрическая лампа (потребляемая мощность, тип цоколя)
 */
public class Lamp extends Lighting{
    private double wt;
    private Type type;

    @Override
    public String toString() {
        return "Lamp{" +
                "wt=" + wt +
                ", type=" + type +
                "} " + super.toString();
    }


}
