package GenericQuestions;

public class armstrongNum {

    public static void main(String[] args) {
        int num=153;
        checkArmstrong(num);
        if(checkArmstrong(num)==true)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No!");
        }
    }
    private static Boolean checkArmstrong(int num)
    {
        int og=num;
        int sum=0;
        int lengthOfDig = String.valueOf(num).length();
        while(num>0)
        {
            int dig= num%10;
            sum+=Math.pow(dig, lengthOfDig);
            num=num/10;
        }
        System.out.println("The sum is :"+ sum);
        return sum==og;
    }

}
/*
 * Meaning: sum of every digit in the number raised to the power of the number of digits in the number
 * is equal to the original number
 * 
 * 123%10
 */
