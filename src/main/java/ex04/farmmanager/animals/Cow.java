package ictgradschool.industry.lab05.ex04.farmmanager.animals;

import ictgradschool.industry.lab05.ex04.farmmanager.IProductionAnimal;

public class Cow extends Animal implements IProductionAnimal {

	public Cow() {
		super("Cow", 1000, 60);
	}

	@Override
	public void feed() {
		if (value < 1500) {
			value += 100;
		}
	}

    @Override
    public boolean isHarvestable() {
        return ticks >= 10;
    }

    @Override
    public int harvest() {
        if (isHarvestable()) {
            ticks -= 10;
            return 20;
        } else {
            return 0;
        }
    }
}
