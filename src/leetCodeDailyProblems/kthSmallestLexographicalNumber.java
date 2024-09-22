package leetCodeDailyProblems;
import java.util.*;
public class kthSmallestLexographicalNumber {
    public static void main(String[] args) {
        int num = 4289384;
        int index= 1922239;
        findKthSmallestLexoNum(num,index);
        System.out.println("the ele is :"+findKthSmallestLexNumMethodTwo(num,index));
        System.out.println("the smallest k-th lexographical number with method two is: "+ findKthSmallestLexoNum(num, index));
    }
    private static int findKthSmallestLexNumMethodTwo(int num, int index)
    {
        int current = 1; //starting from 1
        index--; //to maine zero-based indexing
        while(current<=num)
        {
            int steps = calculateSteps(current,num);
            if(steps<=index)
            {
                current+=1;
                index= index-current;
            }else{
                current*=10;
                index--;
            }   
        }
        System.out.println("the integer is :"+ current);
        return current;
    }
    private static int calculateSteps(int current, int num)
    {
        int steps = 0;
        long first = current;
        int last = current+1;
        while(first<=num)
        {
            steps += Math.min(num+1,last)-first;
            first *= 10;
            last *= 10;
        }
        return steps;
    }
    private static int findKthSmallestLexoNum(int num, int index)
    {
        List<Integer> output = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen = String.valueOf(num).length();
        for(int i=1;i<=num;i++)
        {
            int x = i;
            int lenOfVal = String.valueOf(x).length();
            int lenDiff = maxLen-lenOfVal;
            if(lenDiff>0)
            {
                int val = x * (int) (Math.pow(10, lenDiff));
                map.put(x,val);
            }
            else{
                map.put(x,x);
            }
        }
        System.out.println("the map is :"+ map);
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println("the sorted list is :"+ list);
        for(Map.Entry<Integer,Integer> entry: list)
        {
            output.add(entry.getKey());
        }
        System.out.println("the kth smallest lexoNum is :"+ output.get(index-1));
        return output.get(index-1);
    }

}
