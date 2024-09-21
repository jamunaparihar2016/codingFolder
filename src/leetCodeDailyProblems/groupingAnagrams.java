package leetCodeDailyProblems;
import java.util.*;
public class groupingAnagrams {

    public static void main(String[] args) {
        String[] arr = {"tea","eat","ate","dam","mad","b"};
        findAnagrams(arr);
    }

    private static void findAnagrams(String[] arr)
    {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            String val = arr[i];
            char[] c= arr[i].toCharArray();
            Arrays.sort(c);
            String sortedVal = "";
            for(char ch : c)
            {
                sortedVal+=ch;
            }
            System.out.println("checking for :"+ val);
            if(map.containsKey(sortedVal))
            {
                // map.get(sortedVal).add(val);
                for(Map.Entry<String,List<String>> entryMap : map.entrySet())
                {
                    if(entryMap.getKey().equals(sortedVal))
                    {
                        List<String> innerString = new ArrayList<>(entryMap.getValue());
                        innerString.add(val);
                        map.put(sortedVal,innerString);
                    }
                }
            }
            else{
            map.put(sortedVal,Arrays.asList(val));
            }
        }
        List<List<String>> output = new ArrayList<>();
        for(List<String> innerList: map.values())
        {
            output.add(innerList);
        }
        // List<String> inner = new ArrayList<>();
        // for(Map.Entry<String, List<String>> mapEntry: map.entrySet())
        // {
        //     if(mapEntry.getValue().size()>1)
        //     {
        //         inner.addAll(mapEntry.getValue());
        //     }
        //     output.add(inner);
        // }
        
        System.out.println("the map is :"+ map);
        System.out.println("the list output is :"+ output);
    }

}
