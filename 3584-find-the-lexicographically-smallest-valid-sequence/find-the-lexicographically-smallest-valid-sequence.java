class Solution {
    public int[] validSequence(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int cnt = 0, j = n - 1;
        int[] v = new int[m];
        for (int i = m - 1; i >= 0; i--) {
            v[i] = cnt;
            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                j--;
                cnt++;
            }
        }
        int[] res = new int[n];
        int k = 0;
        boolean flag = false;
        j = 0;
        for (int i = 0; i < m && j < n; i++) {
            if (word1.charAt(i) == word2.charAt(j)) {
                res[k++] = i;
                j++;
            }
            else if (!flag && v[i] >= n - 1 - j) {
                res[k++] = i;
                j++;
                flag = true;
            }
        }
        return (k == n) ? res : new int[0];
    }
}