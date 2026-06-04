class Solution {
    public int numRescueBoats(int[] people, int limit) {
     Arrays.sort(people);
     int r = people.length-1;
     int l =0;
     int trip = 0;
     while(l<=r){
        if(people[l]+people[r]<=limit){
            trip++;
            l++;
            r--;
        }else if(people[l]+people[r]>=limit){
            trip++;
            r--;
        }
     }
     return trip;   
    }
}