package leetCodeDailyProblems;

public class twelveSeptember {

    public static void main(String[] args) {
        String allowed="cad";
        String[] arr= {"cc","acd","b","ba","bac","bad","ac","d"};
        findAllowedCount(allowed,arr);
    }
    private static void findAllowedCount(String allowed, String[] arr)
    {
       int count=0;
       boolean[] allowedChars = new boolean[26];
       for(char c: allowed.toCharArray())
       {
            allowedChars[c-'a']=true;
       }

       for(String word: arr)
       {
            boolean consistentVal=true;
            for(char c: word.toCharArray())
            {
                if(!allowedChars[c-'a'])
                {
                    consistentVal=false;
                    break;
                }
            }
            if(consistentVal)
            {
                count++;
            }
       }
       System.out.println("the count is :"+ count);

    }
    

}
