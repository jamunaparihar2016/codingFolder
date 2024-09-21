package GenericQuestions;
import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number!");
        int num = sc.nextInt();
        System.out.println("the number entered is :"+num);
        int fib= findFib(num);
        System.out.println("the fib is :"+ fib);
        sc.close();
    }

    private static int findFib(int num)
    {
        if(num==0 || num==1)
        {
            return num;
        }
        return findFib(num-1)+findFib(num-2);
        
    }

    //0,1,1,2,3,5,8
    //fib=fib(n-1)+fib(n-2);

}
