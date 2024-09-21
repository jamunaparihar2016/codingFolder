package GenericQuestions;

public class missingNumInAnArr {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8};
        findMissingEle(arr);
    }
    private static void findMissingEle(int[] arr)
    {
        int len= arr.length+1;
        int expSum= ((len)*(len-1))/2;
        System.out.println("the expected sum is :"+ expSum);
        int actSum=0;
        for(int n: arr)
        {
            actSum+=n;
        }
        System.out.println("The actual sum is :"+ actSum);
        int miss= actSum-expSum;
        System.out.println("the missing number is :"+ miss);
    }

}
