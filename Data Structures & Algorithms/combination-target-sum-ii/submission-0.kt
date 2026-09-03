class Solution {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        candidates.sort()
        val result = mutableListOf<List<Int>>()
        val currentCombination = mutableListOf<Int>()
        
        fun track(startIndex:Int, remainingSum: Int){
            if(remainingSum == 0){
                result.add(currentCombination.toList())
                return
            }

            for(i in startIndex until candidates.size){
                if(i > startIndex && candidates[i] == candidates[i-1]){
                    continue
                }
                if(candidates[i] > remainingSum){
                    break
                }
                currentCombination.add(candidates[i])
                track(i + 1, remainingSum - candidates[i])
                currentCombination.removeAt(currentCombination.lastIndex)
            }
        }
        track(0, target)
        return result
    }
}
