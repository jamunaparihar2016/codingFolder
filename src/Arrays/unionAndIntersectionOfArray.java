package Arrays;
import java.util.ArrayList;
import java.util.HashSet;
public class unionAndIntersectionOfArray {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,7};
        int[] arr2 = {4,5,6,7};
        unionOfArrays(arr1,arr2);
        findIntersection(arr1,arr2);
    }

    private static void unionOfArrays(int[] arr1, int[] arr2)
    {
        HashSet<Integer> set = new HashSet<>();
        //adding the first array
        for(int num: arr1)
        {
            set.add(num);
        }

        //adding another array
        for(int num: arr2)
        {
            set.add(num);
        }
        System.out.println("the union is :"+ set);

        //converting set to array
        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.print(" the array is :");
        for(int n: arr)
        {
            System.out.print(n);
        }

    }
    private static void findIntersection(int[] arr1, int[] arr2)
    {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: arr1)
        {
            set.add(num);
        }
        for(int num: arr2)
        {
            if(set.contains(num))
            {
                list.add(num);
                set.remove(num);
            }
        }
        System.out.println("the intersection of the array is :"+ list);
        }
    }

