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
