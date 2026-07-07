class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List<List<Integer>> list = new ArrayList<>();
        // List<List<Intger>> current = new ArrayList<>();
        // for(int i=0;i<n-1;i++){
        //     if(intervals[i][1]>intervals[i+1][0]){
        //         list.add(Arrays.asList(intervals[i][0], intervals[i + 1][1]));
        //     }else{
        //         list.add(Arrays.asList(intervals[i][0],intervals[i][1]));
        //     }
        // }
        int currentEnd = intervals[0][1];
        int currentStart = intervals[0][0];
        for(int i=0;i<n;i++){
            
            if(intervals[i][0] <= currentEnd){
               currentEnd = Math.max(currentEnd,intervals[i][1]);
            }else{
                list.add(Arrays.asList(currentStart,currentEnd));
                currentStart = intervals[i][0];
                currentEnd = intervals[i][1];
            }
        }
        list.add(Arrays.asList(currentStart,currentEnd));
        int [][] result = new int[list.size()][2];
        for(int i=0;i<result.length;i++){
            result[i][0] = list.get(i).get(0);
            result[i][1] = list.get(i).get(1);
        }
        return result;

    }
}