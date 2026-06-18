class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        sb.append(strs[0]);
           for (int i = 1; i < strs.length; i++) {
            String s = strs[i];

            int j = 0;
            while (j < sb.length() && j < s.length()
                    && sb.charAt(j) == s.charAt(j)) {
                j++;
            }

            sb.delete(j, sb.length());

            if (sb.length() == 0) {
                return "";
            }
        }

        return sb.toString();
    }
}