package Arrays;
import java.util.HashMap;
import java.util.Map;
public class mostFrequentElement {

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,4,5};
        mostFreqElement(arr);
    }
    private static void mostFreqElement(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: arr)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println(" the map is: "+ map);
        int max = Integer.MIN_VALUE;
        int maxVal=0;
        for(Map.Entry<Integer,Integer> entrySet : map.entrySet())
        {
            if(entrySet.getValue()>max)
            {
                max=entrySet.getValue();
                maxVal=entrySet.getKey();
            }
        }
        System.out.println("the max value is :"+ maxVal + " and the occurrence count is :"+ max);
    }
}
