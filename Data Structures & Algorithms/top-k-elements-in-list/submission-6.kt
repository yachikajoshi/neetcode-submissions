class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
    var hashmap = mutableMapOf<Int,Int>()
    var bucketList = List(nums.size + 1) { mutableListOf<Int>() }
    for(n in nums){
        hashmap[n] = hashmap.getOrDefault(n,0)+1
    }
    for((key, value) in hashmap){
        
            bucketList[value].add(key)
        
    }
      val result = mutableListOf<Int>()
        for(i in bucketList.size-1 downTo 1){
            for(num in bucketList[i]){
              result.add(num)
              if(result.size == k){
                return result.toIntArray()
              }  
            }
        }
    return result.toIntArray()
    }
}
