package Algorithms;

public class binarySearch {

    public static void main(String[] args) 
    {
        int[] arr= {1,2,3,4,5,6};
        int k=4;
        System.out.println("the index is :"+ binarySearchAlgo(arr,k));
    }
    private static int binarySearchAlgo(int[] arr, int k)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(high+low)/2;
            System.out.println("the mid element is :"+ arr[mid]);
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]>k)
            {
                high = mid - 1; 
            }
            else{
                low = mid + 1;
            }
            
        }
        return -1;
    }
}
