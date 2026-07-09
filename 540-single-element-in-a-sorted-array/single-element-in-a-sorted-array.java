class Solution {
    public int singleNonDuplicate(int[] nums) {
       
        int j =0;
        if(nums.length < 2){
            return nums[0];
        }
        for(int i =0; i<nums.length-1;i++){
            
            
            if(nums[i] != nums[i+1]){
                return nums[i]; 
            }else{
                i++;
                j=j+2;
            }
            
        }
        return nums[j];
    }
}