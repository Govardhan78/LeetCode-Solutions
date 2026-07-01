class Solution {  
    public static boolean isValid(int[] arr, int totalTrips, long maxTime){
        long countTrip = 0;

        for(int i=0; i<= arr.length-1; i++){
            countTrip += maxTime / arr[i];
            if(countTrip >= totalTrips){
                return true;
            }
            
        }
        return false;
    }
    public long minimumTime(int[] time, int totalTrips) {
        int n = time.length;
        int maxi = -1;
        for(int i = 0; i<= n-1; i++){
            if(time[i]>maxi){
                maxi = time[i];
            }
        }

        long s = 1;
        long e = (long) maxi * totalTrips;
        long ans = 0;

        while(s<=e){
            long mid = s + (e - s)/2;

            if(isValid(time, totalTrips,mid)){
                e = mid - 1;
                ans = mid;
            }else{
                s = mid + 1;
        }

        }
        return ans;
    }
}