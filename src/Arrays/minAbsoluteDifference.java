package Arrays;

import java.util.Arrays;

public class minAbsoluteDifference {

    public static void main(String[] args) {
        int[] arr= {-5,-2,-3};
        bruteForceApproach(arr);
    }
    private static void bruteForceApproach(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        //sorting the array
        for(int num: arr)
        {
            System.out.println(num);
        }
        //find min difference
        for(int i=1;i<arr.length;i++)
        {
            int diff = arr[i]-arr[i-1];
            if(diff<min)
            {
                min=diff;
            }
        }
        System.out.println("the absolute min is :"+ min);
        
    }

}
