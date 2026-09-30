class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int d = nums[i];
            int sum = 0;
            while (d != 0) {
                int digit = d % 10;
                sum = digit + sum;
                d = d / 10;
            }

            if (sum == i) {
                return i;
            } 
        }
    return -1;
    }
}