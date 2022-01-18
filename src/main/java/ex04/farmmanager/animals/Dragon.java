package ictgradschool.industry.lab05.ex04.farmmanager.animals;

import ictgradschool.industry.lab05.ex04.farmmanager.IProductionAnimal;

/**
 * Created by anhyd on 7/04/2017.
 */
public class Dragon extends Animal implements IProductionAnimal{

    public Dragon() {
        super("Dragon", 20000, -1);
    }

    @Override
    public boolean isHarvestable() {
        return true;
    }

    @Override
    public int harvest() {
        return value / 10;
    }

    @Override
    public int costToFeed() {
        return value;
    }

    @Override
    public void feed() {
        value *= 3;
    }
}