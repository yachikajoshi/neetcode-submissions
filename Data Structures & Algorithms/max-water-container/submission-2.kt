class Solution {
        fun maxArea(heights: IntArray):Int {
        var left = 0
        var right = heights.size - 1
        var maxHeight = 0
 		
        while (left < right) {
            var width = right - left 
            maxHeight = maxOf(maxHeight, width * minOf(heights[left], heights[right]))
            if (heights[left] < heights[right]) {
                left++
            }
            else {
                right--
            }
        }
           
        return maxHeight
    }
        fun maxOf(left: Int, right: Int): Int {
            return if (left > right) {
                left
            } else right
        }

        fun minOf(left: Int, right: Int): Int {
            return if (left < right) {
                left
            } else right
        }
}
