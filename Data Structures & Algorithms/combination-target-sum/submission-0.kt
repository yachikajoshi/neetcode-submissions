class Solution {
    fun combinationSum(nums: IntArray, target: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val currentCombination = mutableListOf<Int>()
        fun backtrack(index: Int, currentSum: Int){
            if(currentSum == target){
                result.add(currentCombination.toList())
                return
            }
            if(index == nums.size || currentSum > target){
                return
            }
            currentCombination.add(nums[index])
            backtrack(index, currentSum = currentSum + nums[index])
            currentCombination.removeAt(currentCombination.lastIndex)
              backtrack(index + 1, currentSum = currentSum)
        }
        backtrack(0,0)
        return result
    }
}
