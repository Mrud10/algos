// class Solution {
//     public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        
//         Arrays.sort(asteroids);
//         if(mass<asteroids[0]) return false;
//         int l = 1;
//         int sum = 0;
//         while(l<asteroids.length){
//             sum = asteroids[l-1];
//             if(mass + sum < asteroids[l]){
//                 return false;
//             }else{
//                 mass = mass+sum;
//                 sum = 0;
//             }
//             l++;
            
//         }
//         return true;
//     }
// }
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long currMass = mass;

        for(int i = 0; i < asteroids.length; i++) {
            if(currMass < asteroids[i]) {
                return false;
            }

            currMass += asteroids[i];
        }

        return true;
    }
}