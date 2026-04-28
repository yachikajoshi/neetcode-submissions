class Solution {
    fun twoSum(arr: IntArray, target: Int): IntArray {
        var hashMap = mutableMapOf<Int, Int>()
       
        for ((index, num) in arr.withIndex()) {
            val diff = target - num
            if (hashMap.containsKey(diff)) {
               return intArrayOf(hashMap.getValue(diff), index)
            }
            hashMap[num] = index
        }
   return intArrayOf()
    }
}
