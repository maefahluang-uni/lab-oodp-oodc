package ictgradschool.industry.lab05.ex04.farmmanager.animals;

import ictgradschool.industry.lab05.ex04.farmmanager.IProductionAnimal;

public class Chicken extends Animal implements IProductionAnimal {

    public Chicken() {
        super("Chicken", 100, 10);
    }

    @Override
    public boolean isHarvestable() {
        return ticks >= 3;
    }

    @Override
    public int harvest() {
        if (isHarvestable()) {
            ticks -= 3;
            return 3;
        } else {
            return 0;
        }
    }

    @Override
    public void feed() {
        if (value < 300) {
            value += 20;
        }
    }
}
