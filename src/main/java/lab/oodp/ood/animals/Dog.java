package lab.oodp.ood.animals;

/**
 * Represents a dog.
 *
 * TODO Make this class implement the IAnimal interface, then implement all its methods.
 */
public class Dog implements IAnimal {

    @Override
    public String sayHello() {
        return "woof woof";
    }

    @Override
    public boolean isMammal() {
        return true;
    }

    @Override
    public String myName() {
        return "Bruno the dog";
    }

    @Override
    public int legCount() {
        return 4;
    }
}
