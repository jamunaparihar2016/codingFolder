package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertArrayToListViceVersa {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        List<Integer> list = List.of(4,5,6,7,8,9);
        convertArrToList(arr);
        convertListToArr(list);
    }

    public static void convertArrToList(int[] arr)
    {
        Integer[] boxedArray = Arrays.stream(arr).
                                boxed()
                                .toArray(Integer[]::new);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(boxedArray));
        System.out.println("the list is :"+ list);
        
    }
    private static void convertListToArr(List<Integer> list)
    {
        int[] arr = list.stream().mapToInt(Integer:: intValue).toArray();
        System.out.print("the arr is :");
        for(int n: arr)
        {
            System.out.print(n);
        }
    }




}
