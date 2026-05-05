class Solution {
  fun trap(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxLeft = height[left]
        var maxRight = height[right]
        var areaOfWater = 0
     
        while (left < right) {
            maxLeft = maxOf(maxLeft,height[left])
            maxRight = maxOf(maxRight,height[right])
         	
            if (maxLeft > maxRight) {
                areaOfWater = areaOfWater + (maxRight - height[right])
                right--
            }else{
                areaOfWater = areaOfWater + (maxLeft - height[left])
                left++
            }
        }
        return areaOfWater
    }
    fun maxOf(left: Int, right: Int): Int {
        return if (left > right) {
            left
        } else right
    }
}
