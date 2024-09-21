package Arrays;
import java.util.*;
public class uniqueCombinations {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int sum=5;
        uniqueCombMethod1(arr,sum);
    }

    private static void uniqueCombMethod1(int[] arr, int targetSum)
    {
        List<Integer> list = new ArrayList<>();
        int sum=0;
        for(int num: arr)
        {
            sum+=num;
            if(sum==targetSum)
            {
                list.add(num);
            }
            else if(sum<targetSum && targetSum-sum>=num)
            {
                
            }

        }

    }

}
