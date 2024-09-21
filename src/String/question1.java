package String;

public class question1 {

    public static void main(String[] args) {
        String str = "Welcome to Express";
        removeCharacterFromString(str);
    }
    private static void removeCharacterFromString(String str)
    {
        StringBuilder sb = new StringBuilder();
       for(int i=0;i<str.length();i++)
       {
            char ch = str.charAt(i);
            if(ch!='e' && ch!='E')
            {
                sb.append(ch);
            }
       }
       System.out.println("the new string is :"+ sb.toString());
    }
}
