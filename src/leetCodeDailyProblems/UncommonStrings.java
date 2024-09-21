package leetCodeDailyProblems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
public class UncommonStrings {

    public static void main(String[] args) {
        String str1 = "this apple is sour";
        String str2 = "this apple is sweet";
        findUncommon(str1,str2);
    }

    private static void findUncommon(String str1, String str2)
    {
        HashMap<String,Integer> map = new HashMap<>();
        String[] a1 = str1.split(" ");
        String[] a2 = str2.split(" ");
        for(String s: a1)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:a2)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        System.out.println("map is :"+map);
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entrySet: map.entrySet())
        {
            if(entrySet.getValue()==1)
            {
                list.add(entrySet.getKey());
            }    
        }
        System.out.println("the resulting list is:"+ list);
        // HashSet<String> set = new HashSet<>();
        // for(String s: a1)
        // {
        //     System.out.print(s + ", ");
        // }
        // System.out.println();
        // for(String s: a2)
        // {
        //     System.out.print(s + ", ");
        // }
        // for(String s: a1)
        // {
        //     set.add(s);
        // }
        // System.out.println("a1 set:"+ set);
        // for(String s: a2)
        // {
        //     if(!set.add(s))
        //     {
        //         set.remove(s);
        //     }
        // }
        // System.out.println("a2 set:"+set);

    }

}
