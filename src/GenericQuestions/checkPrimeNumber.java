package GenericQuestions;

public class checkPrimeNumber {

    public static void main(String[] args) {
        int num=5;
        Boolean val =check(num);
        if(val.booleanValue()==true)
        {
            System.out.println("Yes!");
        }else{
            System.out.println("no!");
        }
    }
    private static Boolean check(int num)
    {
        if(num==0 || num==1)
        {
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
        
    }

}
