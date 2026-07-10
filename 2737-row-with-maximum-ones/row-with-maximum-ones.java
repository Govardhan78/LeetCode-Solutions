class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int maxOnesRowIndex = 0;
        int maxOnesCount = 0;


        for(int i = 0; i<n;i++){
            int count = 0;

            for(int j=0; j<m; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if( count > maxOnesCount){
                maxOnesCount = count;
                maxOnesRowIndex = i;
            }
            
        }
        return new int[]{maxOnesRowIndex,maxOnesCount}; 
    }
}