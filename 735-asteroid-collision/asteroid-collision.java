class Solution {
    public int[] asteroidCollision(int[] nums) {
        // List<Integer> list = new ArrayList<>();
        // int n = nums.length;
        // int result = new int[n];
        // for(int i=0;i<n-1;i++){
        //     if(nums[i+1] < 0 && nums[i] > 0){
        //         if(Math.abs(nums[i]) > Math.abs(nums[i+1)){
        //             result[i] = nums[i];
        //             result[i+1] = 0;
        //         }else if(Math.abs(nums[i]) < Math.abs(nums[i+1])){
        //             result[i] = 0;
        //             result[i+1] = nums[i];
        //         }
        //     }else{
        //         result[i] = nums[i];
        //     }
        // }
        // return result;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            if(st.isEmpty()){
                st.push(nums[i]);
                continue;
            }
            if(st.peek()>0 && nums[i]<0){
                if(Math.abs(st.peek()) > Math.abs(nums[i])){
                    continue;
                }else if(Math.abs(st.peek()) < Math.abs(nums[i])){
                    st.pop();
                    i--;
                }else if(Math.abs(st.peek())==Math.abs(nums[i])){
                    st.pop();
                }
            }else if(st.peek()>0 && nums[i]>0){
                st.push(nums[i]);
            }else{
                st.push(nums[i]);
            }
        }
        int[] ans = new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]= st.pop();
        }
        return ans;
    }
}