package Stack;

import java.util.Stack;

public class paranthesis {

    public static void main(String[] args) {
        String val= "[]";
        paranthesis p = new paranthesis();
        p.isValid(val);
    }
    private boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if(c=='{' || c=='[' || c=='(')
            {
                stack.push(c);
            }
            else
            {
                if(!stack.isEmpty())
                {
                char top = stack.pop();
                if(c==']' && top=='[' ||
                 c == '}' && top== '{' ||
                 c== ')' && top=='(')
                 {
                    return true;
                 }
                }
                else{
                    return false;
                }
            }    
        }
        if(stack.isEmpty())
        {
            return true;
        }
        return false;
    }

}
