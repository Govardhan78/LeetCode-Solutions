class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;

        int count = 0;
        for(int i = 0; i<n ; i++){
            int s = 0;
            // int e = n;

            while(nums[i] != 0){
                s++;
                  int digit = nums[i] % 10;
                  nums[i] = nums[i] / 10;
            }
            if(s%2==0){
                count++;
            }
        }
        return count;

    }
}