class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val maxHeap = PriorityQueue<Int>(Collections.reverseOrder())
        for(stone in stones){
            maxHeap.offer(stone)
        }

        while (maxHeap.size > 1){
            val first = maxHeap.poll()
            val second = maxHeap.poll()
            val diff = first - second
            if(diff > 0){
                maxHeap.offer(diff)
            }
        }
        return if(maxHeap.isEmpty()) 0 else maxHeap.peek()
    }
}
