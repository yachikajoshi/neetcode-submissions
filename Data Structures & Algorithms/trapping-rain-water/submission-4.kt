class Solution {
  fun trap(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxLeft = height[left]
        var maxRight = height[right]
        var areaOfWater = 0
     
        while (left < right) {
            if (maxLeft > maxRight) {
                right--
                maxRight = maxOf(maxRight,height[right])
                areaOfWater = areaOfWater + (maxRight - height[right])
            }else{
                left++
                maxLeft = maxOf(maxLeft,height[left])
                areaOfWater = areaOfWater + (maxLeft - height[left])
            }
        }
        return areaOfWater
    }
}
