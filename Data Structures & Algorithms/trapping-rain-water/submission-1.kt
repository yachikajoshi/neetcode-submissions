class Solution {
  fun trap(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxLeft = height[left]
        var maxRight = height[right]
        var areaOfWater = 0
     
        while (left < right) {
            maxLeft = maxOf(maxLeft,height[left])//2
            maxRight = maxOf(maxRight,height[right])//1
             println("Previous => Left pointer: $left , Right pointer: $right")
            println("MaxLeft: $maxLeft ; MaxRight: $maxRight")
           
         	
            if (maxLeft > maxRight) {
                areaOfWater = areaOfWater + (maxRight - height[right])
                
                right--
                println(" right $areaOfWater")//2
            }else{
                areaOfWater = areaOfWater + (maxLeft - height[left])
                left++
                  println(" left $areaOfWater")
            }
            println("Updated => Left pointer: $left , Right pointer: $right")
        }
        println(areaOfWater)
        return areaOfWater
    }
    fun maxOf(left: Int, right: Int): Int {
        return if (left > right) {
            left
        } else right
    }
}
