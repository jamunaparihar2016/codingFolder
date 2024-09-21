package leetCodeDailyProblems;
import java.util.*;
public class printLargestNumber {

    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println("the string is :"+findLargest(nums));
    }
    private static String findLargest(int[] nums)
    {
       String[] arr = new String[nums.length];
       for(int i=0;i<nums.length;i++)
       {
            arr[i]=String.valueOf(nums[i]);
       }
       Arrays.sort(arr, new Comparator<String>(){
        public int compare(String a, String b)
        {
            String order1 = a+b;
            String order2 = b+a;
            return order2.compareTo(order1);
        }
       });
       if(arr[0].equals("0"))
       {
            return "0";
       }
       StringBuilder sb = new StringBuilder();
       for(String s: arr)
       {
            sb.append(s);
       }
       return sb.toString();
      
    }
}
