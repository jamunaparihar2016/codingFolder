package GenericQuestions;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class findDuplicatesInArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,0,0,8};
        findDup(arr);
    }
    private static void findDup(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int num: arr)
        {
            if(set.contains(num))
            {
                res.add(num);
            }
            set.add(num);
        }

        System.out.println("the duplicate elements are :"+ res);
    }

}
