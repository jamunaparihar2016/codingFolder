package Arrays;
import java.util.HashSet;
import java.util.*;
public class combineTwoArraysAndSort {

    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5,6,7,8,9};
        int[] arr2= {3,4,5,6,6,7,8,9};
        sortTwoArraysAndMerge(arr1, arr2);
    }

    private static void sortTwoArraysAndMerge(int[] arr1, int[] arr2)
    {
        int len1= arr1.length;
        int len2 = arr2.length;
        int[] combinedArr = new int[len1+len2];
        System.arraycopy(arr1, 0, combinedArr, 0,len1);
        //System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        System.arraycopy(arr2, 0, combinedArr, len1, len2);
        System.out.println("the combined array is: ");
        for(int num: combinedArr)
        {
            System.out.print(num + ", ");
        }
        Arrays.sort(combinedArr);
        HashSet<Integer> set = new HashSet<>();
        for(int num: combinedArr)
        {
            set.add(num);
        }
        System.out.print("Set is : "+ set);
        int[] arr = set.stream().mapToInt(Integer:: intValue).toArray();
        System.out.println("the sorted array is :");
        for(int num: arr)
        {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

}
