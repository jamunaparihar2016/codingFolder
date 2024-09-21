package GenericQuestions;

public class isPerfectNumber {

    public static void main(String[] args) {
        int num=9;
        if(isPerfectNum(num).booleanValue()==true)
        {
            System.out.println("Yes!");
        }
        else{
            System.out.println("No!");
        }
    }
    private static Boolean isPerfectNum(int num)
    {
        int sum=0;
        int og=num;
        if(num<=1)
        {
            return true;
        }
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        System.out.println("The sum is :"+ sum);
        return sum==og;
    }
}
/*
 * A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself). For example, the number 6 is a perfect number because its divisors (excluding itself) are 1, 2, and 3, and their sum is 
1+2+3=6
1+2+3=6.
 */

