package Arrays;

public class separateZeroesFromIntegers {

    public static void main(String[] args) {
        int[] arr={0,1,2,0,0,10,-10};
        seperateZeroesFromIntegers(arr);
    }

    private static void seperateZeroesFromIntegers(int[] arr)
    {
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length)
        {
            arr[index]=0;
            index++;
        }
        for(int num: arr)
        {
            System.out.print(num +", ");
        }
        

    }

}
