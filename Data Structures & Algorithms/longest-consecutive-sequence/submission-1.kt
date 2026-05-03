class Solution {
    fun longestConsecutive(nums: IntArray): Int {
     val set = nums.toHashSet()
	 var longest = 0
     for(num in set){
         if(!set.contains(num-1)){
             
           var  currentStartValue = num 
           var  currentLenghtOfSequence = 1
             
             while(set.contains(currentStartValue + 1)){
                 currentStartValue++
                 currentLenghtOfSequence++
             }
             longest = maxOf(longest,currentLenghtOfSequence)
         }
     }
     return longest
    }
}
