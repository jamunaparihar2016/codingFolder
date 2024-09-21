package GenericQuestions;

public class sortAnArray {

    public static void main(String[] args) {
        int[] arr= {3,5,1,2,4,0};
        sortArr(arr);
    }
    private static void sortArr(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("the sorted array is :");
        for(int n: arr)
        {
            System.out.print(n);
        }
    }

}
