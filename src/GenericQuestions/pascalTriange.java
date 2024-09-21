package GenericQuestions;

public class pascalTriange {

    public static void main(String[] args) {
        int num=5;
        pascalTriangle(num);
    }
    private static void pascalTriangle(int row)
    {
        
        for(int i=0;i<row;i++)
        {
            int num=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(num+ " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }


}
/*
 * sample:
 * 
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
number = number * (i - j) / (j + 1);
num= 1 * (2-1)/(2+1) = 1/3 = 1
num = 1* (3-1)/(4) = 2/4 = 0
 */