TechSupport - the DodgySoft Technical support system.

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

This project is discussed in chapter 6.

This project aims to implements a technical support system for customers of 
the DodgySoft software company. Users can describe their software problems and 
get advice instantly!

The idea is based on Eliza - a famous program described by Joseph Weizenbaum 
in 1966. (Do a web search for "Eliza" and "Weizenbaum" if you want to know 
more about this.)

In fact, it is much more primitive than Eliza. But that's enough to match the 
quality of many software companies' technical support advice...  ;-)

To start this program, create a SupportSystem object and execute the "start" 
method.

Then start describing your problem by typing in the terminal window.

The purpose of this project is to demonstrate and study library classes, such 
as ArrayList, HashMap, HashSet, and Random.

This project is only a first, rudimentary step towards the full solution.

Lab report (part a = question, part b = answer)

1a. Open and run the project tech-support-complete. You run it by creating an object of class SupportSystem
and calling its start method. Enter some problems you might be having with your software, to try out the
system. See how it behaves. Type “bye” when you are done. You do not need to examine the source code 
at this stage. This project is the complete solution that we will have developed by the end of this chapter.
The purpose of this exercise is only to give you an idea of what we plan to achieve. Open the project techsupport1 to continue with the following exercises. Try out this version and compare its behaviour with the
complete version.

1b.One can somehow hold a somewhat believable conversation while the v1 techsupport project repeats the same answer
regardless of the prompt.

2a. Investigate the Java Library documentation for the String class. Then look at the documentation for 
some other classes. What is the structure of class documentation? Which sections are common to all 
class descriptions? What is their purpose?

2b. It is seperated into a few reoccuring parts, the general usage of the class, its constructors, its methods,
and the details specifying the parameters of both constructors and methods

3a. Look up the startsWith method in the documentation for String. There are two versions. Describe in 
your own words what they do and the differences between them.

3b.The standart version, meaning the one wihtout the toffset parameter is simply a pattern match with the first
characters in the inputted String, ex: input= "Sal", output would be for example = salamander, salad, salty...
Whilst the other one lets you decide at what number of characters to start the patern matching, ex: toffset = 2, \
String = "ala", the output would be, in this hypothetical situation, salad, salamander.

4a. Is there a method in the String class that tests whether a string ends with a given suffix? If so, what is it 
called and what are its parameters and return type?

4b. boolean endsWith(String suffix), its parameters are a string to represent the suffix we are searching for and
the return type is boolean, to be used as a conditon.

5a. Is there a method in the String class that returns the number of characters in the string? If so, what is it 
called and what are its parameters?

5b.Yes, the length() method, simply returns the length, Meaning it is of void return type and doesnt require any
inputed parameters.

6a. If you found methods for the two tasks above, how did you find them? Is it easy or hard to find methods 
you are looking for? Why?

6b.I used control+F to easily navigate through everything, using keywords such as number, length, size to find the 
length method and did the same for endsWith.

7a. Find the trim method in the String class’s documentation. Write down the header of that method. Write
down an example call to that method on a String variable called text.

7b.
public String trim(String input){
input = input.trim();//For Q8, if you want to replace the input with its trimmed version, assign the changed String as the input
System.out.println("length of trimed input: " + input.length());
}

8a. Implement an improvement in your version of the tech-support1 project, making it tolerant of extra spaces
around the word ‘bye’.

8b.
    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();//what the user types
            //if this input starts with "bye" = finished
            input = input.trim();//For Q8, if you want to replace the input with its trimmed version, assign the changed String as the input
            if(input.contains("bye")) {//For 11, could be input.equals("bye"))
                finished = true;
            }
            else {
                String response = responder.generateResponse();
                System.out.println(response);
            }
        }

        printGoodbye();
    }

9a. Improve the code of the SupportSystem class in the tech-support1 project so that case in the input is 
ignored. Use the String class’s toLowerCase method to do this. Remember that this method will not 
actually change the String it is called on, but result in the creation of a new one being created with 
slightly different contents.

9b.
    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();//what the user types
            //if this input starts with "bye" = finished
            input = input.trim();//For Q8, if you want to replace the input with its trimmed version, assign the changed String as the input
            input = input.toLowerCase();//For Q9, in case you put in all caps.
            if(input.contains("bye")) {//For 11, could be input.equals("bye"))
                finished = true;
            }
            else {
                String response = responder.generateResponse();
                System.out.println(response);
            }
        }

        printGoodbye();
    }
10a. Find the equals method in the documentation for class String. What is the return type of this method?

10b.It is of boolean return type

11a. Change your implementation to use the equals method instead of startsWith.

11b.
    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();//what the user types
            //if this input starts with "bye" = finished
            input = input.trim();//For Q8, if you want to replace the input with its trimmed version, assign the changed String as the input
            input = input.toLowerCase();//For Q9, in case you put in all caps.
            if(input.equals("bye")) {//For 11, could be input.equals("bye"))
                finished = true;
            }
            else {
                String response = responder.generateResponse();
                System.out.println(response);
            }
        }

        printGoodbye();
    }

12a. Find the class Random in the Java class library documentation. Which package is it in? What does it do?
How do you construct an instance? How do you generate a random number? Note that you will probably 
not understand everything that is stated in the documentation. Just try to find out what you need to 
know.

12b. 

13a. Write a small code fragment (on paper) that generates a random integer number using this class.

13b.

14a. Write some code (in BlueJ) to test the generation of random numbers. To do this, create a new class 
called RandomTester. You can create this class in the tech-support1 project, or you can create a new 
project for it—it doesn’t matter. In class RandomTester, implement two methods: printOneRandom
(which prints out one random number) and printMultiRandom(int howMany) (which has a parameter 
to specify how many numbers you want, and then prints out the appropriate number of random 
numbers). Your class should create only a single instance of class Random (in its constructor) and store it
in a field. Do not create a new instance every time you want a new number.

14b.
import java.util.Random;

/**
 * Write a description of class RandomTeste here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random generator;

    /**
     * Constructor for objects of class RandomTeste
     */
    public RandomTester()
    {
        generator = new Random();
    }

        /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printRandomNumber(int limit){
        if(limit > 0){
            int number = generator.nextInt(limit);
            System.out.println("Random number : " + number );
        }else{
            System.out.println("Please input positive number.");
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printRandomNumbers(int limit, int howMany){
        int counter = 0;
        while(counter < howMany){    
            if(limit > 0){
                int number = generator.nextInt(limit);
                System.out.println("Random number "+ (counter+1) + " : " + number);
                counter++;
            }else{
                System.out.println("Please input positive number.");
            }
        }    
    }
}

15a. Find the nextInt method in class Random that allows the target range of random numbers to be 
specified. What are the possible random numbers that are generated when you call this method with 100 
as its parameter?

15b.The values that can be generated from this specific limit would be 0 to 100.

16a. Write a method in your RandomTester class called throwDice that returns a random number between 1 
and 6 (inclusive). Try to find a way to do this that only involves calling once on each call of . In other 
words, do not include a loop in the body of the method. Be careful to ensure that your method can never
return the value 0.

16b.
    public int throwDice()
    {
        int diceFace = generator.nextInt(6);
        if(diceFace == 0){
            return (diceFace + 1);
        }else{
            return diceFace;
        }
    }
17a. Write a method called getResponse that randomly returns one of the strings "yes", "no", or "maybe". 
Store those strings in a list and randomly select one from the list on each call.

17b.

import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTeste here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random generator;
    // collection of possible answers
    private ArrayList<String> responses;

    /**
     * Constructor for objects of class RandomTeste
     */
    public RandomTester()
    {
        generator = new Random();
        responses = new ArrayList<String>();
    }
    
    public void addResponse(String response)
    {
        responses.add(response);
    }
    
    public void getResponse()
    {
        int selectedIndex = generator.nextInt(responses.size());
        System.out.println(responses.get(selectedIndex));
    }
18a. Extend your getResponse method so that it uses an ArrayList to store an arbitrary number of responses 
and randomly returns one of them.

18b.
import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTeste here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random generator;
    // collection of possible answers
    private ArrayList<String> responses;

    /**
     * Constructor for objects of class RandomTeste
     */
    public RandomTester()
    {
        generator = new Random();
        responses = new ArrayList<String>();
    }
    
    public void addResponse(String response)
    {
        responses.add(response);
    }
    
    public void getResponse()
    {
        int selectedIndex = generator.nextInt(responses.size());
        System.out.println(responses.get(selectedIndex));
    }
19a. Add a method to your RandomTester class that takes a parameter max and generates a random number 
in the range 1 to max (inclusive). As for your solution to Exercise 16, do not include a loop in your 
method and make sure that the method can never return 0.

19b.
    public int returnValidRandomNumber(int max)
    {
        int validNumber = generator.nextInt(max);
        if(validNumber == 0)
        {
            validNumber++;
            return validNumber;
        }else{
            return validNumber;
        }
    }

20a. Add a method to your RandomTester class that takes two parameters, min and max, and generates a 
random number in the range min to max (inclusive). Rewrite the body of the method you wrote for the 
previous exercise so that it now calls this new method to generate its result. Once again, it should not be 
necessary to use a loop in this method.

20b.
    public int returnValidRandomNumber(int a, int b)
    {
        int max;
        int min;
        if(a > b)
        {
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }
        int validNumber = generator.nextInt(min,max);
        if(validNumber == 0)
        {
            validNumber++;
            return validNumber;
        }else{
            return validNumber;
        }
    }

21a. Look up the details of the SecureRandom class that is defined in the java.security package. Could this 
class be used instead of the Random class? Why are random numbers important for cryptographic 
security?

21b.To ensure hackers cant get in using predeteremind and stored keys within the code. By implementing random numbers
, it adds a level of complexity in which a person cannot simply guess what it might be and even so, they'd need incredible
luck.

22a. Implement in your version of the TechSupport system the random-response solution discussed in the 
book, extending the Responder class to select a random response from a list of predefined phrases. Its 
contructor should initialize a random generator field and the ArrayList<String> responses, as well as 
populate the list with responses Strings (in a separate fillResponses method). The generateResponse 
method should return a String from the list based on a randomly generated index.

22b.

23. What happens when you add more (or fewer) possible responses to the responses list? Will the selection 
of a random response still work properly? Why or why not?

23b.
