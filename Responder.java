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
    //index of most recent default response.
    private int latestIndex;
    //collection of synonyms.
    private HashMap<String, String> synonyms;
    //to store general questions.
    private HashMap<String, String> questions;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        generator = new Random();
        responses = new ArrayList<String>();
        betterResponses = new HashMap<String,String>();
        synonyms = new HashMap<String,String>();
        latestIndex = -1;
        questions = new HashMap<String,String>();
    }

    private void getResponse()
    {
        int selectedIndex = generator.nextInt(responses.size());
        System.out.println(responses.get(selectedIndex));
    }
    
    public void fillSynonymMap()
    {
        synonyms.put("ios",betterResponses.get("mac"));
        synonyms.put("hello",betterResponses.get("hi"));
        synonyms.put("phone",betterResponses.get("help"));
        synonyms.put("useless",betterResponses.get("die"));
        synonyms.put("depressed",betterResponses.get("sad"));
        synonyms.put("buggy",betterResponses.get("bug"));
    }
    
    public void fillQuestionsMap()
    {
        questions.put("who","""
                            I am a swagger jagger helper bot named TinyTan, 
                            here to answer your questions related to issues 
                            you're currently facing!
                            """);
        questions.put("what","""
                            What, what, wh-wh-what, what. No but honestly,
                            what do you want from a hardworking and extremely
                            handsome/beautiful bot?
                            """);
        questions.put("where","""
                            Most likely you'll find the settings you want to
                            find are in the tab at the top left corner of your
                            screen. Just look through'em.
                            """);
        questions.put("when","""
                            Born in 1989. Yes, I am Taylor Swift's biggest fan.
                            """);
        questions.put("why","""
                            Why not? I mean why not? My god. I meant why not?
                            I give up.
                            """);
        questions.put("how","BY USING FRESHLY CURATED HUMAN MINDS. rawr :3");
        questions.put("which","Which is, not my problem.");
        questions.put("whose","I do not know, go ask Gandalf or something");
        questions.put("whom","Whom? Who uses whom???? Use WHO like everyone.");
    }
    
    public void printAllValuesInSynonymMap()
    {
        for(String value : synonyms.values())
        {
            System.out.println(value);
        }
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
    
    public int fetchIndexOfLatestResponse()
    {
        return latestIndex;
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateBasicResponse()
    {
        //randomly generated index to put in the ArrayList
        int selectedIndex = generator.nextInt(responses.size());
        //For first loop, latestIndex = -1, so not a valid answer, meaning prints answer without condition.
        while(latestIndex == selectedIndex)
        {
            //reroll until different than the latestIndex field.
            selectedIndex = generator.nextInt(responses.size());
        }
        //call whatever is stored in the generated index of the ArrayList
        String response = responses.get(selectedIndex);
        //update the lastest index to the one who was just now generated. 
        latestIndex = selectedIndex;
        //return chosen default response.
        return response;
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> inputSet)
    {
        Iterator<String> it = inputSet.iterator();
        boolean answerFound = false;
        StringBuilder legitimateResponse = new StringBuilder();
        StringBuilder lessLegitimateResponse = new StringBuilder();
        while(it.hasNext()){
            String word = it.next();
            String answer = betterResponses.get(word);
            String variation = synonyms.get(word);
            String answerToQuestion = questions.get(word);
            if(answer != null)
            {
                answerFound = true;
                legitimateResponse.append(answer).append("\n");
            }else if(variation != null)
            {
                answerFound = true;
                legitimateResponse.append(variation).append("\n");
            }
            if(answerToQuestion!=null)
            {
                lessLegitimateResponse.append(answerToQuestion).append("\n");
            }
        }
            if(answerFound){
            String response = legitimateResponse.toString().trim();
            return response;
        }else
        {
            if(lessLegitimateResponse.length() > 0)
            {
                String response = lessLegitimateResponse.toString().trim();
                return response;
            }else
            {
                String response = generateBasicResponse();
                return response;
            }
        }
    }
    
        /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponsev2(HashSet<String> inputSet)
    {
        Iterator<String> it = inputSet.iterator();
        while(it.hasNext()){
            String word = it.next();
            String answer = betterResponses.get(word);
            String variation = synonyms.get(word);
            if(answer != null)
            {
                return answer;
            }else if(variation != null)
            {
                return variation;
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

