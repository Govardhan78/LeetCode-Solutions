class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int index = 0;
        for (int i = 0; i < m; i++) {
                ans[index++] = nums1[i];

        }
        for (int i = 0; i < n; i++) {
                  ans[index++] = nums2[i];

        }
        Arrays.sort(ans);
        for(int i = 0; i<m+n; i++){
            nums1[i] = ans[i];
        }
        System.out.print(Arrays.toString(ans));

    }
}