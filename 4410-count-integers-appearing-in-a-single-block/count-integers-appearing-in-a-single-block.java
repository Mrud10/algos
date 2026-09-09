class Solution {
    public int countSpecialIntegers(int[] nums) {
        if(nums.length==1) return 1;
        int total = 0;
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        // int current = nums[0];
        // boolean[current] = true;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==current){
        //         continue;
        //     }else if(nums[i])
        // }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }else{
                map.put(nums[i],new ArrayList<>());
                map.get(nums[i]).add(i);
            }
        }
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            int number = entry.getKey();
            List<Integer> curr = entry.getValue();
            boolean special = true;
            for (int j = 1; j < curr.size(); j++) {
                if (curr.get(j) != curr.get(j - 1) + 1) {
                    special = false;
                break;
                 }
            }
            if(special){
                total++;
            }
        }
        return total;
        
    }
}