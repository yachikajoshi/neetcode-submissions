class Solution {
    fun sortColors(nums: IntArray) {
        var low = 0
        var mid = 0
        var high = nums.size - 1
        while(mid <= high){
            when{
                nums[mid] == 1 -> mid++
                nums[mid] == 0 -> {
                    swap(nums, low, mid)
                    low++
                    mid++
                }
                nums[mid] == 2 -> {
                    swap(nums, mid, high)
                    high--
                }
            }
        }
    }
    fun swap(nums: IntArray, mid:Int, high:Int){
        val temp = nums[mid]
        nums[mid] = nums[high]
        nums[high] = temp
    }
}
