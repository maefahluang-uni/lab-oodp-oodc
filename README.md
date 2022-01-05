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
- toString method that return a string pattern (For example, _*****_ )

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

:rocket: ** Note: This exercise will be marked with TestPattern.java, please try to run and confirm the results with this test script.**

Submit this lab
------------------
Don't forget to push your project to Github. Please make sure your project's classroom workflow is successfully executed. You may refer to the lab2's "Submit this lab", as a guideline for checking submission.

