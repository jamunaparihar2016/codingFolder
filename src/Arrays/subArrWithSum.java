package Arrays;
import java.util.HashMap;

public class subArrWithSum {

    public static void main(String[] args) {
        int[] arr = {4,3,1,2,9,8,10,11};
        int sum=6;
        findSubArrWithSum(arr,sum);
    }
    private static void findSubArrWithSum(int[] arr, int sum)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum=0;
        for(int j=0;j<arr.length;j++)
        {
            currentSum+=arr[j];
            if(currentSum==sum)
            {
                System.out.println("the sub-array for method 1 is ");
                for(int k=0;k<j;k++)
                {
                    System.out.println(arr[k]);
                }
            }
            if(map.containsKey(currentSum-sum))
            {
                int startIndex= map.get(currentSum-sum)+1;
                System.out.println("the subArray is :");
                for(int i=startIndex;i<=j;i++)
                {
                    System.out.print(arr[i] + ",  ");
                }
            }
            map.putIfAbsent(currentSum, j);
        }
    }

}
