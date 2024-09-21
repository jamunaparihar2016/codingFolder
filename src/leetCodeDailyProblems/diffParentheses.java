package leetCodeDailyProblems;
import java.util.*;
public class diffParentheses {

    public static void main(String[] args) {
        String inp = "2*3-4*5";
        findParentheses(inp);
    }
    private static List<Integer> findParentheses(String str)
    {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c=='+' || c=='*' || c=='-')
            {
                List<Integer> left = findParentheses(str.substring(0, i));
                List<Integer> right = findParentheses(str.substring(i+1));

                for(int l: left)
                {
                    for(int r: right)
                    {
                        if(c=='+')
                        {
                            result.add(l+r);
                        }
                        else if(c=='*')
                        {
                            result.add(l*r);
                        }
                        else{
                            result.add(l-r);
                        }
                    }
                }
            }
        }
        if(result.isEmpty())
        {
            result.add(Integer.parseInt(str));
        }
        System.out.println("the result is :"+ result);
        return result;
    }

}
