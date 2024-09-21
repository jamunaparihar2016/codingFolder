package GenericQuestions;

public class reverseAnum {

    public static void main(String[] args) {
        int num=123;
        revNum(num);
    }
    private static void revNum(int num)
    {
        int rev=0;
        while(num>0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("the rev number is :"+ rev);
    }
}
/*
 * 123
 * rev = 0+ 3
 * num=12
 * rev= 3*10 + 2 = 32
 * num=1
 * rev= 320+1
 * num=0
 * break;
 */

