package leetCodeDailyProblems;

public class findPallindromes {

    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(shortestPalindrome(str));
    }
    private static String shortestPalindrome(String str)
    {
        String rev = new StringBuilder(str).reverse().toString();
        String combined = str + "#" + rev;
        int[] lps = computeLps(combined);
        int toAdd = str.length() - lps[lps.length-1];
        return rev.substring(0, toAdd) + str;
    }
    private static int[] computeLps(String str)
    {
        int n = str.length();
        int[] lps = new int[n];
        int j=0;
        for(int i=1;i<n;i++)
        {
            while(j>0 && str.charAt(i)!=str.charAt(j))
            {
                j = lps[j-1];
            }
            if(str.charAt(i) == str.charAt(j))
            {
                j++;
            }
            lps[i]=j;
        }
        return lps;
    }

}
