package Arrays;
import java.util.List;
import java.util.ArrayList;


public class allCombinationsOfElements {
    
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int sum=8;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combinations = new ArrayList<>();
        findAllComb(arr,sum,0,combinations,result);
        for(List<Integer> com: result)
        {
            System.out.println(com);
        }
    }
    private static void findAllComb(int[] arr, int target, int index, List<Integer> combinations, List<List<Integer>> result)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(combinations));
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(arr[i]>target)
            {
                continue;
            }
        combinations.add(arr[i]);
        findAllComb(arr, target-arr[i], i, combinations, result);
        combinations.remove(combinations.size()-1);
        }

        

        

        
    }

}
