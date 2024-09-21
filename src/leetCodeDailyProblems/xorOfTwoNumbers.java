package leetCodeDailyProblems;

public class xorOfTwoNumbers {

    public static void main(String[] args) {
        int[] arr = {16};
        int[][] queries = {{0,0},{0,0},{0,0}};
        findTheXor(arr,queries);
    }
    private static  int[] findTheXor(int[] arr, int[][] queries)
    {
        System.out.println("rows count is :"+ queries.length + " and the col length is :"+ queries[0].length);
        int[] res = new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int left = queries[i][0];
            int right= queries[i][1];
            int xorVal=0;
            for(int j=left;j<=right;j++)
            {
                xorVal^=arr[j];
            }
            res[i]=xorVal;
        }
        System.out.println("the resulting array is :");
        for(int num: res)
        {
            System.out.print(num+", ");
        }
        return res;
    }

}
