package Arrays;

public class missingNumberInAnArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9};
        findMissingNumber(arr);
    }

    private static void findMissingNumber(int[] arr)
    {
        int len = arr.length+1;
        System.out.println(" the length is :"+ len);
        int sum = ((len) * (len+1))/2;
        int arrSum=0;
        for(int n: arr)
        {
            arrSum+=n;
        }
        System.out.println(" the sum of arr is :"+ arrSum + " and the sum expected is :"+ sum);
        System.out.println("the missing element is: "+ (sum-arrSum));
    }

}
