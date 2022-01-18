package ictgradschool.industry.lab05.ex04.farmmanager.animals;

/**
 * Created by anhyd on 7/04/2017.
 */
public class Tyrannosaurus extends Animal {

    // Max value of a T-Rex
    private static final int MAX_VALUE = 20000;

    public Tyrannosaurus() {
        super("Tyrannosaurus", 5000, 200);
    }

    @Override
    public void feed() {
        if (value < MAX_VALUE) {
            value += (MAX_VALUE - value) / 2;
        }
    }
}
