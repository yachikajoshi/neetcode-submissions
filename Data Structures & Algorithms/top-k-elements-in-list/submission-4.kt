class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
  var hashmap = mutableMapOf<Int,Int>()

        for(n in nums){
            hashmap[n] = hashmap.getOrDefault(n,0)+1
        }
      return hashmap
        .entries
        .sortedByDescending { it.value }
        .take(k) 
        .map { it.key } 
        .toIntArray()
    }
}
