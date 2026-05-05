class Solution {
    fun reverseString(s: CharArray) {
        var left = 0
        var right = s.size-1
        reverse(s,left,right)
    }
     fun reverse(nums: CharArray, start:Int,end:Int){
        var left = start
        var right = end
        while(left < right){
            val temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp
            left++
            right--
        }
    }
}
