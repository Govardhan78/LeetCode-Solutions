class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = -1;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        for (int j = 0; j < n; j++) {
            if (nums[j] * 2 > max && index != j) {
                return -1;
            } 
        }
        return index;

    }
}