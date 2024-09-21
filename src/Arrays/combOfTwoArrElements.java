package Arrays;
import java.util.HashSet;
public class combOfTwoArrElements {

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {5,6};
        findCombOfArrElements(a,b);
    }
    private static void findCombOfArrElements(int[] arrA, int[] arrB)
    {
        HashSet<Integer> setA= new HashSet<>();
        HashSet<Integer> setB= new HashSet<>();
        int sum=0;
        for(int a: arrA)
        {
            setA.add(a);
        }
        for(int b: arrB)
        {
            setB.add(b);
        }
        for(int a: arrA)
        {
            for(int b: arrB)
            {
                sum=a+b;
                if(setA.contains(sum) || setB.contains(sum))
                {
                    System.out.println("the elements are :"+ a + " and :"+ b + " and the sum is :"+ sum);
                }
            }
        }


    }


}
