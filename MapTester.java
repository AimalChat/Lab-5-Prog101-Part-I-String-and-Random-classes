import java.util.HashMap;
import java.util.HashSet;

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
    //to store something for Q35
    private HashSet<String> hashSet;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        hashMap = new HashMap();
        hashSet = new HashSet();
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
     * @param name = key, number = value corresponding to the name key
     * Associates the specified number with the specified name in this map.
     */
    public void enterName(String name)
    {
        hashSet.add(name);
    }
    
        /**
     * @param  name  Key associated to the value we are searching for(number)
     * @return       (number associated to name)value stored in key
     */
    public String lookupName(String name)
    {
        if(hashSet.contains(name))
        {
            name = hashMap.get(name);
            return number;
        }else
        {
            System.out.println("The name : "+ name + "is not included in our database.");
            return null;
        }
    }
    
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
}
