class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val result = mutableListOf<Int>()
        val queue = ArrayDeque<Int>()
        var l = 0
        var r = 0

        while(r < nums.size){
            while(queue.isNotEmpty() && nums[queue.last()] < nums[r]){
                queue.removeLast()
            }
            queue.addLast(r)
            if(l > queue.first()){
                queue.removeFirst()
            }
            if((r+1) >= k){
                result.add(nums[queue.first()])
                l++
            }
            r++
        }
        return result.toIntArray()
    }
}
