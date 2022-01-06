Lab - Class & Array
==========

Before you start
----------
The purpose of this lab is to practice how to create and use class, as well as array.


Exercise One - Patterns
--------------------
The skeleton code can be found in the ​ lab.oodp.moreclass.pattern.
Open the file ​ PrintPatternProgram.java​ . This class creates an instance of the ​ Pattern
class and calls the methods in the ​ Pattern ​ class to print different patterns.
The ​ Pattern ​ class defines a pattern. It consists of 2 instance variables: the symbol and the number of repetitions of the symbol. Create the ​Pattern.java file and complete the
class so that ​ PrintPatternProgram ​ can print the first pattern in the screenshot below. 

:sparkles: **Note: You can create a new class in Eclipse by right click on the package ( lab.oodp.moreclass.pattern) and choose New > Class**

Pattern.java should includes:
- Constructor so that PrintPatternProgram can create an object. For example,  _new Pattern(5, '*')_ , which is a pattern that prints * for 5 times.
- Accessor/Mutator for setting and getting symbol and the number of repetitions
- toString() method that return a string pattern (For example, _*****_ )

The printPatternOne prints out the pattern as shown below, you can uncomment the code in printPatternOne() to make it work. (To comment/uncomment on Eclipse, select the comment lines and press Shift+Ctrl+C)

Please complete the ​ printPatternTwo() method in ​ PrintPatternProgram ​ so that the second pattern is also printed, as in the sample output below. This method must create ​ Pattern ​ objects in a similar way to the printPatternOne()​ method using Pattern class. You have to include a for-loop that is already there.

You may try to run PrintPatternProgram, it should give the results as below.

```
First Pattern
***************
#######.#######
~~~~~~~..~~~~~~~
~~~~~~~...~~~~~~~
~~~~~~~....~~~~~~~
~~~~~~~.....~~~~~~~
~~~~~~~......~~~~~~~
~~~~~~~.......~~~~~~~

Second Pattern
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
============............============
&&&&&&&&&&&&&..........&&&&&&&&&&&&&
&&&&&&&&&&&&&&........&&&&&&&&&&&&&&
&&&&&&&&&&&&&&&......&&&&&&&&&&&&&&&
&&&&&&&&&&&&&&&&....&&&&&&&&&&&&&&&&
&&&&&&&&&&&&&&&&&..&&&&&&&&&&&&&&&&&
&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
```

:rocket: **Note: This exercise will be marked with TestPattern.java, please try to run and confirm the results with this test script.**

Exercise Two - Mobile Phones
------------------------------
The skeleton code is found in the ​ lab.oodp.moreclass.mobilephones package.
Complete the ​ MobilePhone class, and uncomment the marked lines in DisplayMobilePrices.java so that when ​ DisplayMobilePrices ​ is run, it produces the
following output:

```
Jonathan has an Apple iPhone 4 which cost $899.95
Ann has an LG Optimus-P970 which cost $699.95
Adriana has a Nokia N97 which cost $599.55
Alastair has now purchased a new Apple iPhone 4 for $899.95
Alastair has the same type as Jonathan
Adriana wants a new phone
```

You need to declare the 3 instance variables for brand, model and price, and write the following methods:
- The ​ MobilePhone()​ constructor
- The ​ getPrice()​ and ​ setPrice() ​ methods
- The ​ toString() ​ method
- The ​ getModel()​ and ​ setModel()​ methods
- The ​ equals()​ method that takes another MobilePhone object and checks if brand, model and price are equal.
- The​ isCheaperThan()​ method that takes another MobilePhone object and compare the price.


:rocket: **Note: This exercise will be marked with TestMobilePhone.java, please try to run and confirm the results with this test script.**

Exercise Three - Movies
---------------------------------
The skeleton code is found in the ​ ictgradschool.industry.arrays.movies ​ package.
Complete the code in ​ MovieProgram.java as in Steps 1 - 5 below, so that it produces the
following output when you run the code. The Movie.java class is provided and no need to modify it.

```
Movie Collection
================
Meet the Parents (2000), 107 minutes, Director: Jay Roach
The Parent Trap (1961), 129 minutes, Director: David Swift
Alice In Wonderland (2009), 109 minutes, Director: Tim Burton
Dark Shadows (2012), 113 minutes, Director: Tim Burton
The Iron Lady (2011), 105 minutes, Director: Phylliday Lloyd
The Help (2011), 137 minutes, Director: Tate Taylor
From Russia With Love (1963), 110 minutes, Director: Terence Young
The King's Speech (2011), 118 minutes, Director: Tom Hooper
Charlie and the Chocolate Factory (2005), 115 minutes, Director: Tim Burton
Easy Rider (1969), 94 minutes, Director: Dennis Hopper
Walk the Line (2005), 136 minutes, Director: James Mangold
Kaikohe Demolition (2004), 52 minutes, Director: Florian Habicht
Brokeback Mountain (2005), 134 minutes, Director: Ang Lee
Gladiator (2000), 154 minutes, Director: Ridley Scott
The Long Voyage Home (1940), 105 minutes, Director: John Ford
Happy-Go-Lucky (2008), 118 minutes, Director: Mike Leigh
The Big Wedding (2013), 89 minutes, Director: Justin Zackham
The Intouchables (2011), 112 minutes, Director: Olivier Nakache and Eric Toledano
Searching for Sugar Man (2012), 86 minutes, Director: Malik Bendjelloul

The most recent movie is: The Big Wedding (2013), 89 minutes, Director: Justin Zackham
The longest movie is: Gladiator (2000), 154 minutes, Director: Ridley Scott

Searching for Sugar Man was directed by Malik Bendjelloul
Liberal Arts is not in the collection.
The Intouchables was directed by Olivier Nakache and Eric Toledanos
```

1. Declare and construct an array of 19 ​ Movie​ objects.
2. Write the ​ printMoviesArray() method. This method takes an array of ​ Movie
objects as a parameter and prints all the elements as per the screenshot above.
Note that the ​ toString() method in the ​ Movie ​ class can be called to obtain a
String ​ containing the instance variables of a particular ​ Movie​ , formatted in the
required manner.
3. Write the ​ getMostRecentMovie() method. This method takes an array of ​ Movie
objects as a parameter and returns a reference to the most recent ​ Movie​ . Note
that the ​ isMoreRecentThan() method in the ​ Movie ​ class can be used to determine
if a ​ Movie ​ is more recent than another ​ Movie​ .
4. Write the ​ getLongestMovie() method. This method takes an array of ​ Movie
objects as a parameter and returns a reference to the longest ​ Movie​ . Note that the
isLongerThan() method in the ​ Movie ​ class can be used to determine if a ​ Movie ​ is
longer than another ​ Movie​ .
5. Write the ​ printDirector() method. This method takes 2 parameters: the name of
a movie, and an array of ​ Movie ​ objects. The method should loop through the array
searching for the movie with the name that has been passed in as a parameter. If it
finds a movie with that name, it should print out the director of the movie as per the
screenshot above. If it cannot find a movie with the name that has been passed in as
a parameter, then it should print out “not in the collection” as per the screenshot
above.

:rocket: **Note: This exercise will be marked with TestMovie.java, please try to run and confirm the results with this test script.**

Submit this lab
------------------
:octocat: Don't forget to push your project to Github. Please make sure your project's classroom workflow is successfully executed. You may refer to the lab2's "Submit this lab", as a guideline for checking submission.

