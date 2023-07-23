import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class merge_intervals {
    class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<1){
            return intervals;
        }
        // sorting on the first index of every interval
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));

        List <int[]> result = new ArrayList<>();
        // adding first interval in result
        int [] newInterval = intervals[0];
        result.add(newInterval);

        for (int[] interval : intervals) {
      if (interval[0] <= newInterval[1])
        // [1,3] [2,4] -> [1,4] interval[0] = 3 and newInterval[1] = 2
        // Overlapping intervals,
        // update the end if needed
        newInterval[1] = Math.max(newInterval[1], interval[1]);
      else {
        // Disjoint intervals,
        // add the new interval to the list
        newInterval = interval;
        result.add(newInterval);
      }
    }

    return result.toArray(new int[result.size()][]);

    }
}
}
