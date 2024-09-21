package GenericQuestions;

public class mergeTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {3,4,5,6,1};
        int[] arr2 = {8,7,4,1,3};
        mergeTwoArr(arr1,arr2);
    }
    private static void mergeTwoArr(int[] arr1, int[] arr2)
    {
        int[] mergeArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergeArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergeArr, arr1.length, arr2.length);
        System.out.println("the merged array is :");
        for(int n: mergeArr)
        {
            System.out.print(n+ ", ");
        }
    }

}
