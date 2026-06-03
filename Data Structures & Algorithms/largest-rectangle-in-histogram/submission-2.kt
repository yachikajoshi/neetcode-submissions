class Solution {
    fun largestRectangleArea(heights: IntArray): Int{
        var maxArea = 0
        val stack = ArrayDeque<Int>()
        for(i in heights.indices){
            
            while(stack.isNotEmpty() && heights[stack.last()] > heights[i]){
                val height = heights[stack.removeLast()]
                val width = if(stack.isEmpty()) i else i -  stack.last() - 1
                val area = height * width
                maxArea = maxOf(maxArea, area)
            }
            stack.addLast(i)
        }
        while(stack.isNotEmpty()){
            val height = heights[stack.removeLast()]
            val width = if(stack.isEmpty()) heights.size else heights.size - stack.last() -1
             maxArea = maxOf(maxArea, height * width)
        }
        return maxArea
    }
    fun maxOf(left:Int, right:Int):Int{
      return if(left > right){
             left
            } else right
    }
}
