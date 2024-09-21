package Arrays;

import java.util.HashSet;

public class sumOfIntegers {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,6,7};
        int sum=10;
        sumOfIntegersMethod1Basic(arr,sum);
        sumOfIntegersMethod2(arr,sum);
    }
    private static void sumOfIntegersMethod2(int[] arr, int sum)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr)
        {
            int complement= sum-num;
            if(set.contains(complement))
            {
                System.out.println("The numbers are :"+ num + " and "+ complement);
            }
            set.add(num);
        }
    }
    private static void sumOfIntegersMethod1Basic(int[] arr , int sum)
    {
        int len= arr.length;
        for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                System.out.println("the first element is :"+ arr[i] + " and the second element is :"+ arr[j]);
                }
            }
        }
    }

}
