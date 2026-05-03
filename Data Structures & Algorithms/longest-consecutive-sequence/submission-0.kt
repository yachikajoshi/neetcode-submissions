class Solution {
    fun longestConsecutive(nums: IntArray): Int {
   val set = nums.toHashSet()	//store in hashset so i can get unique value
	 var longest = 0
     for(num in set){
         if(!set.contains(num-1)){	//check what will be the start num of sequence
             
           var  currentStartValue = num 
           var  currentLenghtOfSequence = 1
             
             while(set.contains(currentStartValue + 1)){	//Increment the sequence if num + 1 exist
                 currentStartValue++
                 currentLenghtOfSequence++
             }
             longest = maxOf(longest,currentLenghtOfSequence)
         }
     }
     return longest
    }
}
