import java.util.*;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int num : nums){
            if(num > 0){
                arr1.add(num);
            }else{
                arr2.add(num);
            }
        }
        for(int i = 0; i<n/2; i++){
            result.add(arr1.get(i));
            result.add(arr2.get(i));
        }
        int[] ans = new int[n];
        int index = 0;
        // for(int i=0)
        for(Integer nu : result){
            ans[index] = nu;
            index++;
        }
        return ans;

    }
}