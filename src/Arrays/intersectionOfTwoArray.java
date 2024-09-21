package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class intersectionOfTwoArray {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,6,4,5};
        int[] arr2 = {3,4,5,7,8,2,2,9};
        findIntersectionArray(arr1,arr2);
    }
    private static void findIntersectionArray(int[] arr1, int[] arr2)
    {
        HashSet<Integer> set = new HashSet<>();
        //storing the elements of the array1 in a set.
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: arr1)
        {
            set.add(num);
        }

        //iterating through the array2 and checking if the elements of array2 exists in the set of array1.
        for(int i=0;i<arr2.length;i++)
        {
            if(set.contains(arr2[i]))
            {
                list.add(arr2[i]);
                set.remove(arr2[i]);  //to prevent duplicate elements.
            }
        }
        int[] newArr = new int[list.size()];
        //converting the arraylist back into array
        for(int i=0;i<list.size();i++)
        {
            newArr[i]=list.get(i);
        }
        System.out.println("the intersection list is: "+ list);
        System.out.print("the new array is :");
        for(int n: newArr)
        {
            System.out.print(n + ",");
        }

    }

}
