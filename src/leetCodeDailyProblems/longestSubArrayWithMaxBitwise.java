package leetCodeDailyProblems;
import java.util.List;
import java.util.ArrayList;
public class longestSubArrayWithMaxBitwise {

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,2};
        // int res = 5 & 3;
        // System.out.println("the bitwise and of 5 and 3 is :"+ res);
        findLongestSubArrayMaxBitWise(arr);
    }

    private static void findLongestSubArrayMaxBitWise(int[] arr)
    {
        int maxBitWise = 0;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            List<Integer> intList = new ArrayList<>();
            for(int j=i+1;j<arr.length;j++)
            {
                intList.add(arr[i]);
                int andVal = arr[i] & arr[j];
                if(andVal==1)
                {
                   if(!list.contains(intList)) 
                   {
                    maxBitWise=1;
                    intList.add(arr[j]);
                   }
                   else{
                    list.add(intList);
                   }
                
                }
                maxBitWise=0;
                
            }
        }
        System.out.println("the list is :"+ list);
    }
}
