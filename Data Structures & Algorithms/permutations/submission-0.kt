class Solution {
    val result = mutableListOf<List<Int>>()

    fun permute(nums: IntArray): List<List<Int>> {
        calculatePermutation(0, nums)
        return result
    }
    fun calculatePermutation(index: Int, nums:IntArray){
            if(index == nums.size){
                result.add(nums.toList())
                return
            }
            for(i in index until nums.size){
                nums.swap(index, i)
                calculatePermutation(index + 1, nums)
                nums.swap(index, i)
            }
    }

    fun IntArray.swap(i:Int, j:Int){
            val temp = this[i]
            this[i] = this[j]
            this[j] = temp
    }
}
