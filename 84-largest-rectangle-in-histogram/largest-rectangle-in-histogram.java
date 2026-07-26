class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        int right = 0;

        while (right <= heights.length) {
            int currHeight;
            if (right == heights.length) {
                currHeight = 0;
            } else {
                currHeight = heights[right];
            }

            while (!st.isEmpty() && heights[st.peek()] > currHeight) {
                int height = heights[st.pop()];
                int left;
                if (st.isEmpty()) {
                    left = -1;
                } else {
                    left = st.peek();
                }
                int width = right - left - 1;
                max = Math.max(max, height * width);
            }
            st.push(right);
            right++;
        }
        return max;
    }
}