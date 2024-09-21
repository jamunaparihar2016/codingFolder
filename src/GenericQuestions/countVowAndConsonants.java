package GenericQuestions;

public class countVowAndConsonants {

    public static void main(String[] args) {
        String str= "aaaajjjjjjjjjj";
        countVowAndCons(str);
    }

    private static void countVowAndCons(String str)
    {
        int vow=0;
        int con=0;
        for(char c: str.toCharArray())
        {
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                vow++;
            }
            else
            {
                con++;
            }
        }
        System.out.println("the vow is :"+ vow + " and the consonant count is :"+ con);
    }

}
