import java.util.Random;

/**
 * This class implements a technical support system. It is the top level class 
 * in this project. The support system communicates via text input/output 
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user,
 * and an object of class Responder to generate responses. It contains a loop
 * that repeatedly reads input and generates output until the users wants to 
 * leave.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    private Random randomNumberGen;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
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

        printGoodbye();
    }

        /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void startv2()
    {
        boolean finished = false;
        //add default answers before having an input.
        responder.addDefaultResponses();
        printWelcome();

        while(!finished) {
            String input = reader.getInput();//what the user types
            //if this input starts with "bye" = finished 
            System.out.println("length of input: " + input.length());
            input = input.trim();//For Q8, if you want to replace the input with its trimmed version, assign the changed String as the input
            input = input.toLowerCase();//For Q9, in case you put in all caps.
            System.out.println("length of trimed input: " + input.length());
            System.out.println(input.trim());
            StringBuffer sb = new StringBuffer("Goodbye ");
            sb.append("appendix.");
            sb.insert(16," You're useless.");
            System.out.println(sb);
            Random randomNumberGen = new Random();
            int chance = randomNumberGen.nextInt(100);
            System.out.println("Your chances of living are : "+ chance+ "%");
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
    
    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}
