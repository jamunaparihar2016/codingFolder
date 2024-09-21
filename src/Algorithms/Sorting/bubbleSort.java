package Algorithms.Sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {45,3,40,90,1,2};
        bubbleSortMethod(arr);
        String[] arr2 = {"af","zk","ad","ae"};
        bubbleSortString(arr2);
    }
    private static void bubbleSortString(String[] arr)
    {
        String temp="";
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("the sorted string is: ");
        for(String str:arr)
        {
            System.out.print(str+", ");
        }
    }
    private static void bubbleSortMethod(int[] arr)
    {
        int temp;
        for(int i=0;i<arr.length-1;i++)
        {
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++)
            {
                
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }               
            }
            if(flag==0)
                {
                    break;
                }
        }
        System.out.println("the sorted array is:");
        for(int num: arr)
        {
            System.out.print(num+ ", ");
        }
    }

}
