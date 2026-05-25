class Solution {
    fun maxProfit(prices: IntArray): Int {
        var l = 0
        var r = 1
        val n = prices.size 
        var maxProfit = 0
        while(r < n){
             if(prices[l] < prices[r]){
                val profit = prices[r] - prices[l]
                maxProfit = maxOf(maxProfit, profit)
            }else{
                l = r
               
            }
            r++
        }
        return maxProfit
    }
    fun maxOf(left:Int, right:Int):Int{
        if(left < right){
            return right
        }else{
            return left
        }
    }
}
