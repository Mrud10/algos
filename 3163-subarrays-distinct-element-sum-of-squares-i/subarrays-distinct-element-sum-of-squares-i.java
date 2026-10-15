class Solution {
    public int sumCounts(List<Integer> nums) {
       int total = 0;
       for(int i=0;i<nums.size();i++){
        HashSet<Integer> set = new HashSet<>();
        int totalUnique = 0;
        for(int j=i;j<nums.size();j++){
            if(set.add(nums.get(j))){
                totalUnique++;
            }
             total+=totalUnique*totalUnique;
        }
       
       } 
       return total;
        
    }
}