class Solution {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = mutableListOf<List<Int>>()
        val currentSubset = mutableListOf<Int>()

        fun findSubset(index: Int){
                result.add(currentSubset.toList())
            
            for(i in index until nums.size){
                if(i > index && nums[i] == nums[i-1]){
                    continue
                }
                currentSubset.add(nums[i])
                findSubset(i+1)
                currentSubset.removeAt(currentSubset.lastIndex)
            }
        }
        findSubset(0)
        return result
    }
}
