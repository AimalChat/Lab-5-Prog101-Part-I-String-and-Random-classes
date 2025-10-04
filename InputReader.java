import java.util.HashSet;//Another collection class
import java.util.Scanner;//allows to scan the input of user using the keyboard.

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);//System.in = watching for getting inputs from the keyboard. 
        //Same class for scanning outisde files, so specify with System.in for keyboard inputs.
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user that becomes an ArrayList for
     * the scanner to read.
     */
    public HashSet<String> getInput()
    {
        // print prompt
        System.out.print("> ");
        //empty set to put each individual word in the String input.
        HashSet<String> inputSet = new HashSet<String>();
        //The inputed String in question and remove all uneccessary characters.
        String inputLine = reader.nextLine().replaceAll(",","").replaceAll("\\?","").toLowerCase().replaceAll("\\.","").replaceAll("\\!","").replaceAll("\\?","");
        //Individualize each word of the String input into an ArrayList that will be scaner in responder
        String[] arrayInput = inputLine.split(" ");//inputLine.split = splitting each part of sentence. 
        for(String word : arrayInput)//for each word, add to the hashSet for it to be read.

        {
            inputSet.add(word);
        }
        return inputSet;
    }
}
