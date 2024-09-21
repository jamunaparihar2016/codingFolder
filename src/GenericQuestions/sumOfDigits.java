package GenericQuestions;

public class sumOfDigits {

    public static void main(String[] args) {
        int num=1234;
        sumOfDigInNum(num);
    }
    private static void sumOfDigInNum(int num)
    {
        int sum=0;
        while(num>0)
        {
            int dig=num%10;
            sum+=dig;
            num=num/10;
        }
        System.out.println("the sum is :" + sum);
    }

}
