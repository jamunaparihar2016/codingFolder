package Arrays;
import java.util.HashMap;
public class contSubArrSumEqualsToAnum {
    
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,8,6,7};
        int sum=15;
        findSubArrIndex(arr,sum);
    }
    private static void findSubArrIndex(int[] arr, int targetSum)
    {
        int currentSum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            currentSum+=arr[i];
            if(currentSum==targetSum)
            {
                System.out.print("inside method 1");
                System.out.println("The sub-Array found from index 0 to "+ i);
            }
            if(map.containsKey(currentSum-targetSum))
            {
                int startIndex= map.get(currentSum-targetSum)+1;
                for(int j=startIndex;j<=i;j++)
                {
                    System.out.println("inside the method!");
                    System.out.println(arr[j]);
                }
                System.out.println("The sub-Array found from index :"+ startIndex + " to the index :"+ i);
            }
            map.putIfAbsent(currentSum, i);
        }
        // System.out.println("no subarray found!");
    }

}
