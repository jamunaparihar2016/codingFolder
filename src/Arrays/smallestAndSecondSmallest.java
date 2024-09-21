package Arrays;

public class smallestAndSecondSmallest {

    public static void main(String[] args) {
        int[] arr = {1,2,6,10,0,-1,-2,5,9};
        smallestNumber(arr);
    }

    private static void smallestNumber(int[] arr)
    {
        int min= Integer.MAX_VALUE;
        for(int n: arr)
        {
            if(n<min)
            {
                min=n;
            }
        }
        System.out.println("the min value is :"+ min);
        int secondMin= Integer.MAX_VALUE;
        for(int n: arr)
        {
            if(n<secondMin && n!=min)
            {
                secondMin=n;
            }
        }
        System.out.println("the second min is :"+ secondMin);
    }

}
