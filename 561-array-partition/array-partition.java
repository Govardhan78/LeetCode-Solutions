class Solution {
    public int arrayPairSum(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        int n = nums.length;
        int pair = n/2;

        for(int i = 0; i<nums.length; i=i+2){
            // for(int j=i+1; j<nums.length-1; j++){
                max += Math.min(nums[i],nums[i+1]);

                // if(total >max){
                //     max = total;
                // }
            // }
        }
        return max;
    }
}