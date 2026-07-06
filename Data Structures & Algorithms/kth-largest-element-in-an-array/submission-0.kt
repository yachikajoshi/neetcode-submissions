class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val minHeap = PriorityQueue<Int>()
        for(n in nums){
            minHeap.offer(n)
            if(minHeap.size > k){
            minHeap.poll()
            }
        }
        return minHeap.peek()
    }
}
