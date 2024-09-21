package Arrays;

import java.util.HashSet;

public class removeDuplicateElementsFromArray {

    public static void main(String[] args) {
        int[] arr= {3,4,3,4,5,6,1,2,3};
        remDuplicateEle(arr);
    }
    private static void remDuplicateEle(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr)
        {
            set.add(num);
        }
        System.out.println("the set is :"+ set);
        int[] res = set.stream().mapToInt(Integer::intValue).toArray();
        for(int n: res)
        {
            System.out.println(n);
        }
      
           
    }

}
