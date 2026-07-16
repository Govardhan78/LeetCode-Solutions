class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        // int j = nums.length-1;

        HashSet<Integer> arr = new HashSet<>();

        for(Integer n : nums){
            if(arr.contains(n)){
                flag = true;
            }else{
                arr.add(n);
            }
        }
        return flag;

        




    //     if(j == 0){
    //         return flag;
    //     }

    //    for(int i = 0;i<=nums.length-1; i++){
    //     // for(int j = i+1; j<nums.length; j++){
    //         if(nums[i] == nums[j]){
    //             System.out.println(nums[i]+"--"+nums[j]);
    //             flag = true;
    //         }
    //         j--;
    //     // }
    //    }
    //    return flag;
    }
}