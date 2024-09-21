package GenericQuestions;

public class factorialOfAnum {

    public static void main(String[] args) {
        int num=7;
        int fic = fictorialNum(num);
        System.out.println("the fictorial is :"+ fic);
    }
    private static int fictorialNum(int num)
    {
        if(num<=2 && num>=0)
        {
            return num;
        }else if(num<0)
        {
            return -1;
        }
        else{
            return num*fictorialNum(num-1);
        }
    }   

}
