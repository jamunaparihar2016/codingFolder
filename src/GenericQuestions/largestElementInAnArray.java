package GenericQuestions;

public class largestElementInAnArray {

    public static void main(String[] args) {
        int[] arr = {3,2,45,90,100};
        largestEle(arr);
    }
    private static void largestEle(int[] arr)
    {
        int max= Integer.MIN_VALUE;
        for(int n: arr)
        {
            if(n>max)
            {
                max=n;
            }
        }
        System.out.println(" the max value is :"+ max);
    }


}
