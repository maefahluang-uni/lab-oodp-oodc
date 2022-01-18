package ictgradschool.industry.lab05.ex04.farmmanager.animals;

import ictgradschool.industry.lab05.ex04.farmmanager.ITickable;

/**
 * Created by anhyd on 7/04/2017.
 */
public abstract class Animal implements ITickable {

    protected long ticks;

    protected int value;
    protected String name;
    protected int costToFeed;

    public Animal(String name, int value, int costToFeed) {
        this.name = name;
        this.value = value;
        this.costToFeed = costToFeed;
    }

    public String getName() {
        return name;
    }

    public abstract void feed();

    public int costToFeed() {
        return costToFeed;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + " - $" + value;
    }

    @Override
    public void tick() {
        ticks++;
    }
}
