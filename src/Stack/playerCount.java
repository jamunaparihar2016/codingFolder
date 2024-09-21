package Stack;
import java.util.Stack;
public class playerCount {

    public static void main(String[] args) {
        String str= "baabbzzpq";
        int k=5;
        System.out.println("the lost player index is :"+findLosingPlayer(str,k));
    }
    private static int findLosingPlayer(String str, int k)
    {
        Stack<Character> stack = new Stack<>();
        int player=0;
        for(char c: str.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek()==c)
            {
                stack.pop();
                if(stack.isEmpty())
                {
                    return player+1;
                }
            }
            else{
                stack.push(c);
            }
            player=(player+1)%k;
            }
        return player+1;
    }

}
