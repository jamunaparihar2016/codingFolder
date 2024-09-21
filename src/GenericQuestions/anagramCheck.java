package GenericQuestions;
import java.util.Arrays;
public class anagramCheck {
    public static void main(String[] args) {
        String str = "jamuna";
        String str2 = "jamnuap";
        checkAnagram(str,str2);
    }
    private static void checkAnagram(String str1, String str2)
    {
        char[] arr1= str1.toCharArray();
        char[] arr2= str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Boolean val =Arrays.equals(arr1, arr2);
        if(val.booleanValue()==true)
        {
            System.out.println("Yes!");
        }
        else{
            System.out.println("No!");
        }
    }

}
