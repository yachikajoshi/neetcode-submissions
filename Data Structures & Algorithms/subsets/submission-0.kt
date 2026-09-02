class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val currentSubset = mutableListOf<Int>()

        fun createSubset(index : Int){
            if(index == nums.size){
                result.add(currentSubset.toList())
                return
            }
            currentSubset.add(nums[index])
            createSubset(index+1)
            currentSubset.removeAt(currentSubset.lastIndex)
            createSubset(index+1)
        }
        createSubset(0)
        return result
    }
}