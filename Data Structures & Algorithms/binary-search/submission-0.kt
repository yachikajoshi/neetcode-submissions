class Solution {
    fun search(nums: IntArray, target: Int): Int {
       return bs(0,nums.size-1, nums, target)   
    }
    fun bs(low: Int, high: Int, nums: IntArray, target: Int):Int{
        if(low > high) return -1
        val mid = (low+high)/2
        if(nums[mid] == target){
            return mid
        }else
        if(target > nums[mid]){
            return bs(mid+1, high, nums, target)  
        }else{
            return bs(low, high-1, nums, target)  
        }
    }
}
