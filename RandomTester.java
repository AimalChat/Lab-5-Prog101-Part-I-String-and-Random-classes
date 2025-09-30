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
    
    public void getResponse()
    {
        int selectedIndex = generator.nextInt(responses.size());
        System.out.println(responses.get(selectedIndex));
    }

    public int throwDice()
    {
        int diceFace = generator.nextInt(6);
        if(diceFace == 0){
            return (diceFace + 1);
        }else{
            return diceFace;
        }
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
