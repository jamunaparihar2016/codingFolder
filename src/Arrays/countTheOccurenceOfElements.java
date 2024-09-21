package Arrays;
import java.util.HashMap;

public class countTheOccurenceOfElements {

    public static void main(String[] args) {
        int[] arr= {1,1,2,3,2,3,2,2,4,5};
        countOccurenceOfEle(arr);
    }
    private static void countOccurenceOfEle(int[] arr)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: arr)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        System.out.println("the map is: "+ map);
    }
    

}
