import java.util.Random;
import java.util.ArrayList;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder
{
        // instance variables - replace the example below with your own
    private Random generator;
    // collection of possible answers
    private ArrayList<String> responses;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        generator = new Random();
        responses = new ArrayList<String>();
    }

    private void getResponse()
    {
        int selectedIndex = generator.nextInt(responses.size());
        System.out.println(responses.get(selectedIndex));
    }
    
    public void addDefaultResponses()
    {
        responses.add("I think you should make some real friends");
        responses.add("What are you doing here just talking to me?");
        responses.add("Get over yourself.");
    }
    
    public void addResponse(String response)
    {
        responses.add(response);
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
}

