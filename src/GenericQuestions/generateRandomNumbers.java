package GenericQuestions;

import java.util.Random;

public class generateRandomNumbers {

    public static void main(String[] args) {
        int num= 4;
        Random random = new Random();
        for(int i=0;i<num;i++)
        {
            System.out.println(random.nextInt(100));
        }
    }

}
