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
//Import the class from java library
import.java.util.Random;
//fields
private Random generator;
//class wrapper
public class Random
{  
   //constructor method
   public void Random(){
   generator = new Random();
   }

   //method to generate a int value(without any limits)
   public int generateRandomInt(){
   int randomInt = generator.nextInt();
   return randomInt;
   }   
}


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

15b.The values that can be generated from this specific limit would be 0 to 99.

16a. Write a method in your RandomTester class called throwDice that returns a random number between 1 
and 6 (inclusive). Try to find a way to do this that only involves calling once on each call of . In other 
words, do not include a loop in the body of the method. Be careful to ensure that your method can never
return the value 0.

16b.
    public int throwDice()
    {
        int diceFace = generator.nextInt(6) + 1 ;//because 7 is exclusive
        return diceFace;
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
        int validNumber = generator.nextInt(max) + 1;
        return validNumber;
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
            max = a++;
            min = b;
        }else{
            max = b++;
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
    public void addDefaultResponses()
    {
        responses.add("I think you should make some real friends");
        responses.add("What are you doing here just talking to me?");
        responses.add("Get over yourself.");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int selectedIndex = generator.nextInt(responses.size());
        String response = responses.get(selectedIndex);
        return response;
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;
        //add default answers before having an input.
        responder.addDefaultResponses();
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

23a. What happens when you add more (or fewer) possible responses to the responses list? Will the selection 
of a random response still work properly? Why or why not?

23b.
It will work just fine, since you determine wiht the initialiaztion of the support system
what default answers will be found in said arrayList of responses the tech bot can give.

24a. What is a HashMap? What is its purpose and how do you use it? Answer these questions in writing, and 
use the Java library documentation of Map and HashMap for your responses. Note that you will find it 
hard to understand everything, as the documentation for these classes is not very good. We will discuss 
the details later in this chapter, but see what you can find out on your own before reading on.

24b.It is an object that stores Map objects, which is an object that maps keys to values. 
The Map interface provides three collection views, which allow a map's contents to be 
viewed as a set of keys, collection of values, or set of key-value mappings. Esentially, it sets a key(similar to a passcode) in order to access its value. So, like a diary and key. 
the key is your key in this case while the contents of the diary is the value stored within
that key. Only one value can be set to a key, or, as the API says, each key can map to at
most one value. But that value can be a collection object, so value(s).

25a. HashMap is a parameterized class. List those of its methods that depend on the types used to parameterize it. Do you think the same type could be used for both of its 
parameters?

25b. Yes.
HashMap(), Constructs an empty HashMap with the default initial capacity (16) and the default load factor (0.75). Load factor is simply how full it can be before having to automatically
increase its capacity. Usually its (0.75)

HashMap(int initialCapacity), you decide the initial capacity

HashMap(int initialCapacity, float loadFactor), you decide the loadFactor variable's value.

HashMap(Map<? extends K,? extends V> m), Constructs a new HashMap with the same mappings as the specified Map.

26a. How do you check how many entries are contained in a map?

26b.
public int getHashMapSize()
{
   HashMap hashMap = new HashMap();
   hashMap.size();
}


27a. Create a class MapTester (either in your current project or in a new project). In it, use a HashMap to 
implement a phone book similar to the one in the example in the book. (Remember that you must 
import java.util.HashMap.) In this class, implement two methods:
 public void enterNumber(String name, String number)
 and
 public String lookupNumber(String name)
 The methods should use the put and get methods of the HashMap class to implement their 
functionality.

27b.
import java.util.HashMap;

/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> hashMap;
    //key for accessing number 
    private String name;
    //value stored in name key
    private String number;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        hashMap = new HashMap();
    }

    /**
     * @param name = key, number = value corresponding to the name key
     * Associates the specified number with the specified name in this map.
     */
    public void enterNumber(String name, String number)
    {
        hashMap.put(name, number);
    }
    
    /**
     * @param  name  Key associated to the value we are searching for(number)
     * @return       (number associated to name)value stored in key
     */
    public String lookupNumber(String name)
    {
        number = hashMap.get(name);
        return number;
    }
}

28a. What happens when you add an entry to a map with a key that already exists in the map?

28b.the value stored in said key is replaced by the recently inputted one.

29a. What happens when you add an entry to a map with two different keys?

29b.They both get added into the hashmap collection. However, one is at the 3rd index while
the second is at the 13th index.

30a. How do you check whether a given key is contained in a map? (Give a Java code example.)

30b.
    /**
     * @param  name  Key associated to the value we are searching for(number)
     * @return       (number associated to name)value stored in key
     */
    public String lookupNumber(String name)
    {
        if(hashMap.containsKey(name))
        {
            number = hashMap.get(name);
            return number;
        }else
        {
            System.out.println("The name : "+ name + "is not included in our database.");
            return null;
        }
    }

31a. What happens when you try to look up a value and the key does not exist in the map?

31b. it returns null.

32a. How do you print out all keys currently stored in a map?

32b.
                /**
     * Prints out list of keys from the HashMap.
     */
    public void lookupNames()
    {
        Set listOfNames = hashMap.keySet();
        for(String firstName : hashSet){
            System.out.println(firstName);
        }
    }

33a. Change your version of the TechSupport system to use a map of known words as keys 
and associated responses as values. A new method, fillResponsesMap, should be created to 
populate the HashMap of responses. At this stage, the generateResponse method should 
receive a single word as a parameter, and return the value associated with that word in 
the HashMap. If the word is not a valid key, a call to pickDefaultResponse() should 
provide a default value. Test it to get a feel for how well it works.

33b.
    public void fillResponseMap()
    {
        betterResponses.put("glitch","What kind of glitch?");
        betterResponses.put("thank","You're welcome!");
        betterResponses.put("die","haha, you're so funny!");
        betterResponses.put("kind","Oh that? Just a feature.");
        betterResponses.put("hi","hello! :D");
        betterResponses.put("feature","If I say it's a feature, then it is one.");
        betterResponses.put("help","For additional help, please call : (000)-000-0000");
        betterResponses.put("number","You shouldve just started with calling the place");
        betterResponses.put("sad","Please don't kill yourself. :C");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String input)
    {
        if(betterResponses.containsKey(input))
        {
            String response = betterResponses.get(input);
            return response;
        }else
        {
            String response = generateBasicResponse();
            return response;
        }
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateBasicResponse()
    {
        int selectedIndex = generator.nextInt(responses.size());
        String response = responses.get(selectedIndex);
        return response;
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;
        //add somewhat logical answers before having an input.
        responder.fillResponseMap();
        //add default answers before having an input.
        responder.addDefaultResponses();
        printWelcome();

        while(!finished) {
            String input = reader.getInput();//what the user types
            //if this input starts with "bye" = finished
            input = input.trim();
            input = input.toLowerCase();
            if(input.contains("bye")) {
                finished = true;
            }
            else {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }

        printGoodbye();
    }

34a. What are the similarities and differences between a HashSet and an ArrayList? Use the descriptions of Set, HashSet, List, and ArrayList in the library documentation to find 
out, because HashSet is a special case of a Set and ArrayList is a special case of a List.

34b. They're both collections. ArrayList and HashSet both grow automatically when a new accepted element is added to their collection. Both are unsorted lists. HashSet typically has two parameters while Array
has one, but they do share it both, the initial capacity. Thye can both extend an existing collection with the ceation of a set. They both allow for iteration over the entire collection, however the order in which they are iterated are 
different. ArrayList loops over its collection by order of the indexes while HashSet simply iterates with
no real index to keep track, it still does do the same job, just a bit more carefree with what is scanned first. They both
allow the use of Iterators so removing, adding, hasNext and next, meaning they can both be modified during an 
iteration. HashSet does not allow for duplicates in their collection. HashSet uses the Set class, while ArrayList uses
the List class. Also, ArrayList's elements can be accesed by index while HashSet cannot. HashSet is faster than ArrayList
in an interation it seems?

35a. What is the difference in the result of returning the words in a HashSet compared with returning them 
in an ArrayList?

35b.For example, if you had repeats in both list, then HashSet would not return them and it would display the
elements in the collection in whatever order. While in the ArrayList, the user would see an ordered list
with the duplicates still displayed.

36a. What happens if there is more than one space between two words (e.g., two or three spaces)? Is there a 
problem?

36b.Well, yes, because it, the splitter, would then split the empty places, making it so that the empty
Strings are in the array.

37a. To implement the final changes discussed in the book, you would also need to adjust the SupportSystem 
and Responder classes to deal with a set of words instead of a single String:
 ◦ The input variable receiving the result from reader.getInput() is now of type HashSet
 ◦ The check for ending the application is done using the contains method of the HashSet class, rather 
than a String method
 ◦ The HashSet class has to be imported
 ◦ The generateResponse method in the Responder class has to accept a set of words as a parameter. It
 should iterate over these words and check each of them with our map of known words. If any is 
recognized, we return the associated response, otherwise, one of the default reponses is returned.

37b.

38a. Add more word/response mappings into your application. You could copy some out of the solutions 
provided and add some yourself.

38b.

39a. Ensure that the same default response is never repeated twice in a row.

39b.

40a. Challenge exercise Sometimes two words (or variations of a word) are mapped to the same response. Deal 
with this by mapping synonyms or related expressions to the same string so that you do not need 
multiple entries in the response map for the same response.

40b.

41a. Challenge exercise Identify multiple matching words in the user’s input, and respond with a more 
appropriate answer in that case.

41b.

42a. Challenge exercise When no word is recognized, use other words from the user’s input to pick a well
fitting default response: for example, words such as “why,” “how,” and “who.”

42b.


