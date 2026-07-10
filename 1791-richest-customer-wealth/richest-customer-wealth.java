class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int maxPerson = 0;
        for(int row = 0; row<n; row++){
            int total = 0;
            for(int col = 0; col<m; col++){
                total += accounts[row][col];
                if(total>maxPerson){
                    maxPerson = total;
                }
            }
        }
        return maxPerson;

    }
}