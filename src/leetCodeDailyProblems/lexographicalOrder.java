package leetCodeDailyProblems;

import java.util.*;

public class lexographicalOrder {

    public static void main(String[] args) {
        int n= 14;
        findLexographicalOrder(n);
    }
    private static void findLexographicalOrder(int n)
    {
        List<Integer> output = new ArrayList<>();
        int maxLen = String.valueOf(n).length();
        System.out.println("the max length is:"+ maxLen);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++)
        {
            int lenVal= String.valueOf(i).length();
            int diffVal = maxLen-lenVal;
            // System.out.println("The diff value for :"+ i + "is :"+ diffVal);
            int val = diffVal==0 ? i : (int) (i* Math.pow(10,diffVal)) ;
            map.put(i,val);
            // System.out.println("the value printed for :"+ i + "is :"+ arr[i-1]);
        }
        System.out.println("map is :"+ map);
        List<Map.Entry<Integer,Integer>> entryVal = new ArrayList<>(map.entrySet());
        entryVal.sort(Map.Entry.comparingByValue());
        HashMap<Integer,Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> entry: entryVal)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
            output.add(entry.getKey());
        }

        System.out.println("the sorted map is :"+ sortedMap);
        System.out.println("the output list is: "+ output);

        
    }

}
