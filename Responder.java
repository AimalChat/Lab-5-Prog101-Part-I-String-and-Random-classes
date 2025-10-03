import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

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
    private HashSet<String> input;
    
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
        betterResponses.put("crash", 
                        """
                        Well, it never crashes on our system. It must have something
                        to do with your system. Tell me more about your configuration.
                        """);
        betterResponses.put("crashes", 
                        """
                        Well, it never crashes on our system. It must have something
                        "to do with your system. Tell me more about your configuration.
                        """);
        betterResponses.put("slow", 
                        """
                        I think this has to do with your hardware. Upgrading your processor
                        should solve all performance problems. Have you got a problem with
                        our software?
                        """);
        betterResponses.put("performance", 
                        """
                        Performance was quite adequate in all our tests. Are you running
                        any other processes in the background?
                        """);
        betterResponses.put("bug", 
                        """
                        Well, you know, all software has some bugs. But our software engineers
                        are working very hard to fix them. Can you describe the problem a bit
                        further?
                        """);
        betterResponses.put("buggy", 
                        """
                        Well, you know, all software has some bugs. But our software engineers
                        "are working very hard to fix them. Can you describe the problem a bit
                        further?
                        """);
        betterResponses.put("windows", 
                        """
                        This is a known bug to do with the Windows operating system. Please
                        report it to Microsoft. There is nothing we can do about this.
                        """);
        betterResponses.put("mac", 
                        """
                        This is a known bug to do with the Mac operating system. Please
                        report it to Apple. There is nothing we can do about this.
                        """);
        betterResponses.put("expensive", 
                        """
                        The cost of our product is quite competitive. Have you looked around
                        and really compared our features?
                        """);
        betterResponses.put("installation", 
                        """
                        The installation is really quite straight forward. We have tons of
                        "wizards that do all the work for you. Have you read the installation
                        instructions?
                        """);
        betterResponses.put("memory", 
                        """
                        If you read the system requirements carefully, you will see that the
                        specified memory requirements are 1.5 giga byte. You really should
                        upgrade your memory. Anything else you want to know?
                        """);
        betterResponses.put("linux", 
                        """
                        We take Linux support very seriously. But there are some problems.
                        Most have to do with incompatible glibc versions. Can you be a bit
                        more precise?
                        """);
        betterResponses.put("bluej", 
                        """
                        Ahhh, BlueJ, yes. We tried to buy out those guys long ago, but
                        they simply won't sell... Stubborn people they are. Nothing we can
                        do about it, I'm afraid.
                        """);
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
    public String generateResponse(HashSet<String> inputSet)
    {
        Iterator<String> it = inputSet.iterator();
        while(it.hasNext()){
            String word = it.next();
            String answer = betterResponses.get(word);
            if(answer!=null)
            {
                return answer;
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
    public String generateResponsev1(String input)
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

