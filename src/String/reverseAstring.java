package String;

public class reverseAstring {

    public static void main(String[] args) {
        String str= "jamuna";
        reverseStr(str);
    }
    private static void reverseStr(String str)
    {
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println("the rev string is :"+rev);
    }

}
