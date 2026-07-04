import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (Integer n : nums1) {
            map1.put(n, map1.getOrDefault(n, 0) + 1);
        }
        for (Integer n : nums2) {
            map2.put(n, map2.getOrDefault(n, 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer num : map1.keySet()) {
            if (map2.containsKey(num)) {

                int count = Math.min(map1.get(num), map2.get(num));
                while (count > 0) {
                    result.add(num);
                    count--;
                }
            }
        }
            
        int[] ans = new int[result.size()];
        int i = 0;
        for(int nb: result){
            ans[i] = nb;
            i++;
        }    
        return ans;
    }
}