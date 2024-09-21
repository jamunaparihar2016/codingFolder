package leetCodeDailyProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minDiffInTime {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("00:00");
        list.add("22:30");
        list.add("00:00");
        System.out.println("the list is :"+ list);
        System.out.println("the min diff is :"+ findMinDifference(list));
    }

    public static int findMinDifference(List<String> timePoints) {
        List<List<Integer>> timeList = new ArrayList<>();
        for(int i=0;i<timePoints.size();i++)
        {
            List<Integer> internalList = new ArrayList<>();
            internalList.add(Integer.parseInt(timePoints.get(i).split(":")[0]));
            internalList.add(Integer.parseInt(timePoints.get(i).split(":")[1]));
            timeList.add(internalList);
        }
        System.out.println("resulting list is :"+timeList);
        //convert into minutes:
        int[] mins = new int[timePoints.size()];
        for(int i=0;i<timePoints.size();i++)
        {
            // int hours = timeList.get(i).get(0)<=12 ? timeList.get(i).get(0) : timeList.get(i).get(0)-12;
            int hours = timeList.get(i).get(0);
            int minutes = timeList.get(i).get(1);
            int time = (hours * 60) + minutes;
            mins[i]=time;         
        }
        
        Arrays.sort(mins);

        System.out.print("the minutes array is :");
        for(int n: mins)
        {
            System.out.print(n + ", ");
        }

        int minDiff = 1440;
        for(int i=1;i<mins.length;i++)
        {
            int diff = mins[i]-mins[i-1];
            minDiff = Math.min(minDiff, diff);
        }
        for(int i=0;i<mins.length;i++)
        {
            int wrappedDiff = 1440 - mins[mins.length-1] + mins[0];
            minDiff = Math.min(wrappedDiff,minDiff);
        }
        return minDiff;

    }   

}
