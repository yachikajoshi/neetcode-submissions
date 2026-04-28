class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
          var map = hashMapOf<Int, Int>()
        var bool = false
        for(n in nums.indices){
           map.getOrPut(n){nums[n]}
           bool = map.values.size != map.values.distinct().size

        }
        return bool
    }
}
