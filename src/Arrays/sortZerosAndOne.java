package Arrays;

public class sortZerosAndOne {

    public static void main(String[] args) {
        int[] arr={1,0,0,1,1,1,0,0};
        sortZeroAndOne(arr);
    }

    private static void sortZeroAndOne(int[] arr)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            if(arr[low]==0)
            {
                low++;
            }
            else if(arr[high]==1)
            {
                high--;
            }
            else{
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }

        }
        for(int n: arr)
        {
            System.out.print(n + ", ");
        }
    }

}
