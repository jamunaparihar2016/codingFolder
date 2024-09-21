package leetCodeDailyProblems;

public class palindromeNumber {

    public static void main(String[] args) {
        int num = 123432191;
        boolean isPalNum = checkIfPalindromeMethod1(num);
        System.out.println("the answer is :"+ isPalNum);
        boolean isPalNum2 = checkIfPalindromeMethod2(num);
        System.out.println("the answer is :"+ isPalNum2);
    }
    private static Boolean checkIfPalindromeMethod1(Integer num)
    {
        return (new StringBuilder(String.valueOf(num)).reverse()).toString().equals(String.valueOf(num));
        // int rev = reverseInteger(num);
    }
    private static Boolean checkIfPalindromeMethod2(int num)
    {
        int input = num;
        int newNum = 0;
        while(input!=0)
        {
            int y = input%10;
            newNum= newNum*10 + y;
            input=input/10;
        }
        System.out.println("the new rev num is :"+ newNum);
        return num==newNum? true : false;
    }
}
