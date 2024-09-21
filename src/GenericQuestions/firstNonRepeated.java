package GenericQuestions;
import java.util.LinkedHashMap;
import java.util.Map;
public class firstNonRepeated {
    public static void main(String[] args) {
        String str= "applemango";
        firstNonRepeatedChar(str);
    }
    private static void firstNonRepeatedChar(String str)
    {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char c: str.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println("the map is :"+ map);
        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println("the character is :"+ entry.getKey());
                break;
            }
        }
       
    }

}
