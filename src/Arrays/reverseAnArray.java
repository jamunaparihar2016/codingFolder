package Arrays;

public class reverseAnArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        reverseArray(arr);
    }
    private static void reverseArray(int[] arr)
    {
        int start=0;
        int end= arr.length-1;
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("the reversed array is :");
        for(int num: arr)
        {
            System.out.println(num);
        }
    }


}
