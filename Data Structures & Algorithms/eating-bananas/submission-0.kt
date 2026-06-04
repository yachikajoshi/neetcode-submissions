class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var low = 1
        var high = piles.max()
        var minimumEatingSpeed = 0
        while(low <= high){
            val mid = (low + high)/2
            val totalHrs = computeHrs(piles, mid)
            if(totalHrs <= h){
                minimumEatingSpeed = mid
                high = mid - 1
            }else{
                low = mid + 1
            }
        }
        return minimumEatingSpeed
    }
    fun computeHrs(piles: IntArray, mid: Int):Int{
        var totalhr = 0
        for(i in piles){
            totalhr += (i + mid - 1) / mid 
        }
        return totalhr
    }
}
