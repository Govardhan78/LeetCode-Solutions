class Solution {
    public void duplicateZeros(int[] arr) {
        int n  = arr.length;
        int i = 0;
        int j = 1;    
        ArrayList<Integer> rst = new ArrayList<>();

        while(i<n){
            if(arr[i] == 0){
                rst.add(0);
                rst.add(0);
                i++;
                j++;
            }else{
                rst.add(arr[i]);
                i++;
                j++;
            }

        }
            int[] ans = new int[n];

        for(int k = 0; k<n; k++){
            arr[k] = rst.get(k);
        }
        System.out.print(Arrays.toString(ans));
    }
}