package lab.oodp.ood.animals;

/**
 * Main program for Exercise Two.
 */
public class AnimalProgram {

    public void start() {

        IAnimal[] animals = new IAnimal[3];

        // TODO Populate the animals array with a Bird, a Dog and a Horse.
        

        processAnimalDetails(animals);

    }

    private void processAnimalDetails(IAnimal[] list) {
        // TODO Loop through all the animals in the given list, and print their details as shown in the lab handout.
        // TODO If the animal also implements IFamous, print out that corresponding info too.
    	
    	// TODO Use println below to break between each animal
    	//System.out.println("--------------------------------------------------------------");
    }

    public static void main(String[] args) {
        new AnimalProgram().start();
    }
}
