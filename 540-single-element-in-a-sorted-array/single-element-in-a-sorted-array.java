class Solution {
    public int singleNonDuplicate(int[] nums) {
        // int n = nums.length;
        // int s = 0;
        // int e = n;
        // while(s<e){
        //     int mid = s+(e-s)/2;
        //     if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
        //         return mid;
        //     }
        //     else if()
        // }
        int j =0;
        if(nums.length < 2){
            return nums[0];
        }
        for(int i =0; i<nums.length-1;i++){
            
            // if(nums[i+1]){
            //     return nums[i];
            // }
            if(nums[i] != nums[i+1]){
                return nums[i]; 
            }else{
                i++;
                j=j+2;
            }
            // if(nums[i])
        }
        return nums[j];
    }
}