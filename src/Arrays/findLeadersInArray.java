package Arrays;

import java.util.ArrayList;
import java.util.List;

public class findLeadersInArray {

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,0,102,5,7,29};
        findLeaders(arr);
    }
    private static List<Integer> findLeaders(int[] arr)
    {
        List<Integer> list = new ArrayList<>();
        int maxFromRight = arr[arr.length-1];
        list.add(maxFromRight);
        for(int i=arr.length-2;i>0;i--)
        {
            if(arr[i]>maxFromRight)
            {
                maxFromRight=arr[i];
                list.add(maxFromRight);
            }
        }
        System.out.println("the list is :"+ list);
        return list;
    }

}
