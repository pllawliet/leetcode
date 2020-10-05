import java.util.*;

public class RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0])
                return b[1]-a[1];
            else 
                return a[0]-b[0];
        });
        int count = 0;
        int[] last = new int[]{0,0};
        for(int[] interval:intervals){
            boolean flag = false;
            if(last[0]<=interval[0] && last[1]>=interval[1])
                    flag=true;
            if(!flag){
                last = interval;
                count++;}
        }
        return count;
    }
}
