class Solution {
    public String[] assignUmbrella(int[] rain) {

        String[] result = new String[rain.length];

        int alice = 0;
        int bob = 0;

        for (int i = 0; i < rain.length - 1; i++) {

            if (rain[i] == 0) {
                result[i] = "None";
            } 
            else if (rain[i + 1] == 0) {
                result[i] = "Bob";
                bob++;
            } 
            else {
                if (alice <= bob) {
                    result[i] = "Alice";
                    alice++;
                } else {
                    result[i] = "Bob";
                    bob++;
                }
            }
        }
        if (rain[rain.length - 1] == 1) {
            result[rain.length - 1] = "Bob";
        } else {
            result[rain.length - 1] = "None";
        }
        return result;
    }
}