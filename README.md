Lab - Object-oriented Concepts
==========

Before you start
----------
The purpose of this lab is to give a practice of how to implement the source in object-oriented concepts including inheritance and polymorphism.

Exercise One - Printer Scanner
--------------------------------
 The following two interfaces specify the functions that a Document Scanner and a Printer are expected to have (This exercise does not require Eclipse to do):

```java
public​ ​ interface​ ​ Scanner​ ​ {
	public​ ​ Document​ getDocument​ ();
	public​ ​ boolean​ jobsDone​ ();
	public​ ​ Error​ getError​ ();
}
public​ ​ interface​ ​ Printer​ ​ {
	public​ ​ void​ printDocument​ ( ​ Document​ d​ );
	public​ ​ int​ getEstimateMinutesRemaining​ ();
	public​ ​ Error​ getError​ ();
}
```
For the following two classes write down the methods that they must implement.

```java
public​ ​ class​ ​ PrintOmatic​ ​ implements​ ​ Printer​ ​ {
	// TODO Implement the necessary methods
}
public​ ​ class​ ​ OverpricedAllInOnePrinterfier​ ​ implements​ Scanner​, ​​Printer​ ​ {
	// TODO Implement the necessary methods
}
```

Which of the following lines are valid?
1. Scanner​ eg2 ​ = ​ ​ new​ ​ PrintOmatic​ ();
2. Printer​ eg3 ​ = ​ ​ new​ ​ OverpricedAllInOnePrinterfier​ ();
3. OverPricedAllInOnePrinterfier​ eg4 ​ = ​ ​ new​ ​ Printer​ ();
4. Printer​ eg1 ​ = ​ ​ new​ ​ Scanner​ ();

```
The answer is 2
```


Exercise Two - Animals
---------------------------
The source code of this exercise is in *lab.oodp.ood.animals*. The following interface specifies the functions that ​ IAnimal ​ is expected to perform:

```java
public​ ​ interface​ ​ IAnimal​ ​ {

	// Returns a string containing the greeting
	public​ ​ String​ sayHello​ ();
	
	// Returns true or false;
	public​ ​ boolean​ isMammal​ ();
	
	// Returns the name, followed by "the" followed by the
	// animal type, e.g. "George the Monkey"
	public​ ​ String​ myName​ ();
	
	// Returns the number of legs
	public​ ​ int​ legCount​ ();
}
```

Here is an example output of the application:

```
Tweety the bird says tweet tweet.
Tweety the bird is a non-mammal.
Did I forget to tell you that I have 2 legs.
--------------------------------------------------------------
Bruno the dog says woof woof.
Bruno the dog is a mammal.
Did I forget to tell you that I have 4 legs.
--------------------------------------------------------------
Mr. Ed the horse says neigh.
Mr. Ed the horse is a mammal.
Did I forget to tell you that I have 4 legs.
This is a famous name of my animal type: PharLap
--------------------------------------------------------------
```
Pleaes complete the following:
- Complete the ​ **Bird** ​ and ​ **Dog** ​ classes that implement the interface ​ *IAnimal*​.
:sparkles: *Hint: On Eclipse, you can automatically generate override methods by go to menu Source > Overide/Implement Methods* 
- Complete the **Horse** ​ class that implements the interface ​ *IAnimal* ​ and another interface ​ *IFamous ​ which will be used to tell the user about the famous horse ​ "PharLap"​.
- Create a simple application and call the method ​ processAnimalDetails(IAnimal[]
list) which iterates through an array of animals and gives the example output. Note that
this method will call ​ myName​ , ​ sayHello​ , ​ isMammal​ , and ​ legCount ​ for each one of the
animals. We also like to print famous names of animals if they exist. 
:sparkles: *Hint: use ​ instanceof operator.*



