import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

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
    // collection of possible answers that correspond to an input
    private HashMap<String, String> betterResponses;
    //to store said betterResponses in case of iteration needed.
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        generator = new Random();
        responses = new ArrayList<String>();
        betterResponses = new HashMap<String,String>();
    }

    private void getResponse()
    {
        int selectedIndex = generator.nextInt(responses.size());
        System.out.println(responses.get(selectedIndex));
    }
    
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
    public String generateBasicResponse()
    {
        int selectedIndex = generator.nextInt(responses.size());
        String response = responses.get(selectedIndex);
        return response;
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponsev1(String input)
    {
        while(betterResponses.keySet().iterator().hasNext()){
            String answer = betterResponses.keySet().iterator().next();
            if(answer.equals(input))
            {
                String response = betterResponses.get(input);
                return response;
            }else
            {
                String response = generateBasicResponse();
                return response;
            }
        }
        return null;
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
}

