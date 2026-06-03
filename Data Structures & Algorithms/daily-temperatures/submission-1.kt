class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
    val stack = ArrayDeque<Int>()
    val result = IntArray(temperatures.size)
    
    for (i in temperatures.indices) {
        while (stack.isNotEmpty() && temperatures[stack.last()] < temperatures[i]) {
            val idx = stack.removeLast()
            result[idx] = i - idx
        }
        stack.addLast(i)
    }
    return result
    }
}
