class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n = quiet.length;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] r : richer) {
            int u = r[0];
            int v = r[1];

            list.get(v).add(u);
        }
        int[] result = new int[n];
        Arrays.fill(result, -1);
        for (int i = 0; i < n; i++) {
            dfs(i, list, quiet, result);
        }

        return result;
    }

    private int dfs(int person, List<List<Integer>> list,
                    int[] quiet, int[] result) {
        if (result[person] != -1) {
            return result[person];
        }
        result[person] = person;
        for (int richerPerson : list.get(person)) {
            int candidate = dfs(richerPerson, list, quiet, result);
            if (quiet[candidate] < quiet[result[person]]) {
                result[person] = candidate;
            }
        }
        return result[person];
    }
}