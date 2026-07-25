class Solution {
    public int maxArea(int[] height) {
        // int max = 0;
        // for(int i = 0; i<height.length; i++){
        //     for(int j = i+1; j<height.length;  j++){
        //         int width = j-i;
        //         int high = Math.min(height[i],height[j]);
        //         int water = high * width;
        //         if(water>max){
        //             max = water;
        //         }
        //     }
        // }
        // return max;

        int left = 0;
        int right = height.length-1;
        
        int maxWater = 0;
        while(left < right){
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int water = width * minHeight;

            maxWater = Math.max(maxWater, water);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        } 
        return maxWater;
    }
}