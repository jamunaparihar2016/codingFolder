package GenericQuestions;
import java.util.HashSet;

public class commonElementsInTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {4,9,0,6};
        findComEle(arr1,arr2);
    }
    private static void findComEle(int[] arr1, int[] arr2)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr1)
        {
            set.add(num);
        }
        for(int num: arr2)
        {
            if(!set.add(num))
            {
                System.out.println("the common element is :"+ num);
                break;
            }
            set.add(num);
        }
    }

}
