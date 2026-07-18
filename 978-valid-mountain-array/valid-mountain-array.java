class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return false;
        }
        int pick = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[pick]) {
                pick = i;
            }
        }

        if (pick == 0 || pick == n - 1) {
            return false;
        }

        for (int i = 0; i < pick; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }

        for (int i = pick; i < n-1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}