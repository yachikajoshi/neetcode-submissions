class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val arr = IntArray(nums.size*2){0}
        for((index,i) in nums.withIndex()){
            arr[index] = i
            arr[nums.size + index] = i
        }
        return arr
    }
}
