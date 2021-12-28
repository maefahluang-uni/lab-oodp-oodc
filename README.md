Lab - Object Oriented Programming
==========

Before you start
----------
The purpose of this lab is to practice Java programming and basic object oriented programming. You will also learn how to develop Java source and unit testing it. In this project, it contains two sub-folders. **src/main** contains the source code that you have to complete. **src/test** contains unit testing script that helps to check your exercises.



Exercise One - Object References
---------
1. After the statements below executed, what are the values stored in a,b and c variable?

```java
int​ a ​ = 7​
int​ b ​ = 1​
int​ c ​ = a + 2​
a ​ = ​ b​ ;
b ​ = ​ c​ ;
c ​ = ​ c ​ + 1​
```
Please note your answer below.

```
Your answers here.
```
2. After the following statements are executed, what are the outputs? The method **setFruitName(String)** changes the fruit name and the method ​ **getFruitName()** returns the fruit name of the object.

```java
Fruit​ apple ​ = ​ ​ new​ ​ Fruit​ ( ​ "red apple"​ );
Fruit​ orange ​ = ​ ​ new​ ​ Fruit​ ( ​ "orange"​ );
Fruit​ greenApple ​ = ​ apple​ ;
System​.out​.println​("The fruit is "​ + apple​.getFruitName​());
System​.out​.println​("The fruit is "​ + orange​.getFruitName​());
System​.out​.println​("The fruit is "​ + greenApple​.getFruitName​());
orange​.setFruitName​("navel orange"​);
greenApple​.setFruitName​("green apple"​);
System​.out​.println​("The fruit is "​ + apple​.getFruitName​());
System​.out​.println​("The fruit is "​ + orange​. ​getFruitName​());
System​.out​.println​("The fruit is "​ + greenApple​.getFruitName​());
```
Please note your answer below.

```
Your answers here.
```


Exercise Two - Matrix Manipulation
----------
Write a program to extract 3 rows of 6 characters from a ​ String ​ of 18 characters. The program should print out the 3 rows, followed by the left diagonal of the 3 rows. The ​ String method ​ substring()​ can be used to extract the required characters.

The program is to be written so that each task is in a separate method. Please find **Matrix** class in src folder. You need to complete 3 methods, one method for each of the following tasks:
1. **getRow()** - Extracting a row by substring 6 characters from the ​String
2. **getLeftDiagonal()** - Extracting and returning the left diagonal by given rows
3. **getRightDiagonal()** - Extracting and returning the right diagonal by given rows

The Matrix class can be used as follows:

```java
Matrix ex = new Matrix();
ex.setLetters("X X O O X O X O X ");
ex.start();
```

Here is an example of the output of the program:

```
X X O
O X O
X O X
Left Diagonal: X X X
Right Diagonal: O X X
```

Another way to test that you have correct code for this exercise is through unit testing. The unit testing is for testing methods in the class. please find unit test for Matrix class in test folder: **TestMatrix**. On Eclipse, right click on this file and choose Run as/Junit Test. If the method is coded correctly, the green check icon appears.

![Junit run](image/junit.png)

Exercise Three - Deodorant Class
----------
In the ​ Deodorant ​ class, complete the method definitions for:

- the accessor methods getPrice()​ , ​ getBrand()​ , ​and getFragrance()
- the mutator methods ​ setPrice()​ , ​ setBrand()​ , ​ setFragrance()
- the boolean method ​ isMoreExpensiveThan(Deodorant other)

**Note: You can test your implementations using the supplied test class: TestDeodorant**

Please complete DeodorantApp.java. This application get the user inputs, create a deodorant object and print out its details. Please complete the last two steps (as noted in **TODO**).

After you complete and run this application, you should get similar output as follows:

```
===== Deodorant =====
Enter brand:spring
Enter fragrance:baby powder
Enter price:5.99
spring baby powder Deodorant, 
$5.99
```

**Question:** In DeodorantApp.java, why do we need Double.parseDouble at line:14
Please note your answer below.

```
your answer here
```

Before you submit
---------------
Please make sure:
1. You put in answers for every questions in this lab.
2. All unit-testing have been passed

To make sure all unit-testing have been passed, you can run maven. Maven is a framework that our project is based on. It helps to build, package, test and run application. On Eclipse, right click on the project/Run As/Maven build. On run configuration, type in **verify** in the Goals, and click Run button. The console should give the output as below, that shows sucess build, where all tests have been passed.

```
 T E S T S
-------------------------------------------------------
Running lab.oodp.oop.test.TestMatrix
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.069 sec
Running lab.oodp.oop.test.TestDeodorant
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec

Results :

Tests run: 7, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ lab-oop ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```

Submit this lab
------------------
You can submit this lab by simply pushing the code to the Github. On Eclipse, right click on project/Team/Commit. Stage all changes by clicking on ++ icon, type in message and click Push button.

After you push the code, please make sure all code changes have been updated on Github's repository and "Github Action" runs successfully. This lab is marked automatically using "Github Action", which runs "maven verify" (as previously explained). To make sure you lab is sucessfully marked, on Github, click on Action tab and check if the green check icon apears as shown below.

![Junit run](image/github-workflow.png)
