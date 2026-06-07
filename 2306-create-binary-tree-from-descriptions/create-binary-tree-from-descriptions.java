/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        int rootval = 0;
        Set<Integer> st = new HashSet<>();
        for(int i = 0;i<descriptions.length;i++){
            st.add(descriptions[i][1]);
        }
        for(int i=0;i<descriptions.length;i++){
            if(!st.contains(descriptions[i][0])){
                rootval = descriptions[i][0];
            }
        }
        TreeNode root = new TreeNode(rootval);
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        HashMap<Integer,Integer> loc = new HashMap<>();
        for(int i=0;i<descriptions.length;i++){
            loc.put(descriptions[i][1],descriptions[i][2]);
        }
        for(int i=0;i<descriptions.length;i++){
            if(map.containsKey(descriptions[i][0])){
                map.get(descriptions[i][0]).add(descriptions[i][1]);
            }else{
                map.put(descriptions[i][0],new ArrayList<>());
                map.get(descriptions[i][0]).add(descriptions[i][1]);
            }
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            int val = node.val;
            List<Integer> list = map.get(val);
            if(list==null){
                continue;
            }else{
            for(int i=0;i<list.size();i++){
                int child = list.get(i);
                if(loc.get(child)==1){
                    TreeNode childNode = new TreeNode(child);
                    node.left = childNode;
                    queue.add(childNode);
                }else{
                    TreeNode childNode = new TreeNode(child);
                    node.right = childNode;
                    queue.add(childNode);
                }
                
            }
            }
            
        }
        return root;
    }
}