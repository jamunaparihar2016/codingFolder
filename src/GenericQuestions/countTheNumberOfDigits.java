package GenericQuestions;

public class countTheNumberOfDigits {

    public static void main(String[] args) {
        int num=1234567890;
        int dig=0;
        while(num>0)
        {
            dig++;
            num=num/10;
            
        }
        System.out.println("the number of digits is: "+ dig);
    }

}
