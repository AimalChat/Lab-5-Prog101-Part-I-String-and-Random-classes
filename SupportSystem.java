import java.util.Random;
import java.util.HashSet;

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
        //add somewhat logical answers before having an input.
        responder.fillResponseMap();//HashSet for standard responses.
        responder.fillSynonymMap();//HashSet for synonyms.
        //add default answers before having an input.
        responder.fillQuestionsMap();//HashSet for general questions.
        responder.addDefaultResponses();//ArrayList
        printWelcome();

        while(!finished) {
            HashSet<String> input = reader.getInput();//what the user types
            if(input.contains("bye")) {//if this input starts with "bye" = finished
                finished = true;
            }
            else {
                String response = responder.generateResponse(input);
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
