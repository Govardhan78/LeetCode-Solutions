class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }else if(price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;


    //     int profit = 0;

    //     for(int i = 0; i<n-1; i++){
    //         for(int j = i; j<n; j++){
    //             int check = prices[j] - prices[i];
    //             if(check > profit){
    //                 profit = check;
    //             }
    //         }
    //     }
    //     return profit;
    }
}